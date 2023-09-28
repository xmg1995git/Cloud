package org.mtf.controller;



import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.mtf.service.TestFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HystrixPlusController {

    @Resource
    TestFeignService feignService;


    @GetMapping("/hystrixPlus/test/timeout")
    public String timeout() {
        String timeout = feignService.timeout();
        return timeout;
    }






}
