package com.young.shibin.service.impl;

import com.young.shibin.mapper.UserMapper;
import com.young.shibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        userMapper.add(username,password);
    }
}
