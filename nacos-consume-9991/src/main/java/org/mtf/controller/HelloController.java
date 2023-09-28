package org.mtf.controller;


import org.mtf.feignApi.nacos888.HelloApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RefreshScope  //配置动态刷新
public class HelloController {



    @Value("${nacos-server.nacos-provider-888}")
    private String NACOS_PROVIDER_888;

    @Value("${version.info:error-info}")
    private String info;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HelloApi helloApi;

    @GetMapping("/hello/{message}")
    public String helloTo(@PathVariable String message){
        return restTemplate.getForObject(NACOS_PROVIDER_888+"/nacos/hello/"+message, String.class);
    }

    @GetMapping("/hello/feign/{message}")
    public String hello(@PathVariable String message){
        return helloApi.hello(message);
    }

    @GetMapping("/info")
    public String port(){
        return info;
    }


    @GetMapping("/goods")
    public void goods(){
        helloApi.exe();
    }

    @GetMapping("/get")
    public String get(){
        return restTemplate.getForObject(NACOS_PROVIDER_888+"/get", String.class);
    }



}
