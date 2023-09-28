package org.mtf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String hello(){
        return "hello ...9001";
    }

    @GetMapping("/consume")
    public String consume(){
        return "consume969 ..."+ port;
    }


}
