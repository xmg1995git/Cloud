package org.mtf.controller;

import org.mtf.entities.User;
import org.mtf.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/userTotal")
    public int userTotal(){
        return userMapper.userTotal();
    }

    @PostMapping("/saveUser")
    public long saveUser(@RequestBody User user){
        return userMapper.saveUser(user);
    }

    @GetMapping("/getUserById/{userId}")
    public User getUserById(@PathVariable String userId){
        User user = userMapper.getUserById(userId);
        return user;
    }
}
