package org.mtf.feignApi.nacos888;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider-888")
public interface HelloApi {

    @GetMapping("/nacos/hello/{message}")
    public String hello(@PathVariable("message") String message);

    @GetMapping("/exe")
    public void exe();
}
