package org.mtf.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.mtf.feignApi.TestApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestApi testApi;


    @HystrixCommand
    @GetMapping("/number")
    public String getNumber(){
        return testApi.getNumber();
    }

    @HystrixCommand
    @GetMapping("/ok")
    public String getOk(){
        return testApi.getStr();
    }
}
