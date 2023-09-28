package org.mtf.service;

import org.mtf.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider-8001", fallback = TestFeignFallBackService.class)
public interface TestFeignService {

    @GetMapping("/getUserById/{userId}")
    public User getUserById(@PathVariable("userId") String userId);

    @GetMapping("/timeout")
    public String timeout();

}
