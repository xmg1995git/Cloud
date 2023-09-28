package org.mtf.controller;


import org.mtf.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService testService;
    @GetMapping("/getNumber")
    String getNumber(){
        return testService.getNumber();
    };

    @GetMapping("/str")
    String str(){
        return testService.getStr();
    };
}
