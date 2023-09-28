package org.mtf.service;

import lombok.extern.slf4j.Slf4j;
import org.mtf.entities.User;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestFeignFallBackService implements TestFeignService{

    @Override
    public User getUserById(String userId) {
        return null;
    }

    @Override
    public String timeout() {
        return "timeout...";
    }


}
