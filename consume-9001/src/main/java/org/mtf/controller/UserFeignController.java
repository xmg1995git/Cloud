package org.mtf.controller;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.mtf.entities.User;
import org.mtf.service.TestFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserFeignController {

    @Resource
    TestFeignService feignService;


    @GetMapping("/feign/getUserById/{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        User userById = feignService.getUserById(userId);
        return userById;
    }




    @GetMapping("/feign/test/timeout")
    public String timeout() {
        String timeout = feignService.timeout();
        return timeout;
    }






}
