package com.ithaha.ssm.controller;

import com.ithaha.ssm.pojo.User;
import com.ithaha.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SsmController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
