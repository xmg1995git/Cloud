package org.mtf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String hello(){
        return "hello ..."+port;
    }

    @GetMapping("/provider")
    public String provider(){
        return "provider..."+port;
    }




    @HystrixCommand(
            fallbackMethod = "hello_timeout",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")}
    )
    @GetMapping("/timeout")
    public String timeout(){
        if(Math.random() > 0.5){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return port+Thread.currentThread().getName();
    }

    public String hello_timeout(){
        return Thread.currentThread().getName()+": sorry!";
    }




}
