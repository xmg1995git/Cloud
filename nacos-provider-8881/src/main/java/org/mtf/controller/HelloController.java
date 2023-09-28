package org.mtf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/nacos/hello/{message}")
    public String hello(@PathVariable("message") String message){
        return port + "-" +message;
    }


    @GetMapping("/nacos888/hello")
    public String hello(){
        return port +"-one";
    }


}
