package org.mtf.controller;



import org.mtf.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class UserController {

    public static final String URL = "http://127.0.0.1:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/userTotalXml")
    public int userTotal() {
        return restTemplate.getForObject(URL+"/userTotal", Integer.class);
    }

    @GetMapping("/getUserById/{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        return restTemplate.getForEntity(URL+"/getUserById/"+userId, User.class).getBody();
    }


}
