package org.mtf.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinController {


    @GetMapping("/zipkin")
    public String testZipkin(){
        return "hi, this is testZipkin!!!";
    }
}
