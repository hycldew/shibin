package com.young.shibin.controller;

import com.young.shibin.pojo.Result;
import com.young.shibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public Result register(String username, String password) {
         userService.register(username, password);
         return Result.success();
    }
}