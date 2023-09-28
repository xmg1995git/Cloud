package org.mtf.controller;



import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.mtf.entities.User;
import org.mtf.service.TestFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@DefaultProperties(defaultFallback = "user_feign_timeout_default")
@RestController
public class HystrixController {

    @Resource
    TestFeignService feignService;

    @HystrixCommand(
//            fallbackMethod = "user_feign_timeout",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")}
    )
    @GetMapping("/hystrix/test/timeout")
    public String timeout() {
//        int i = 10/0;
        String timeout = feignService.timeout();
        return timeout;
    }


    /**
     * 对方繁忙或者自己出错
     * @return
     */
    public String user_feign_timeout(){
        return Thread.currentThread().getName()+": sorry!"+9001;
    }


    public String user_feign_timeout_default(){
        return Thread.currentThread().getName()+": sorry, i am default!"+9001;
    }




}
