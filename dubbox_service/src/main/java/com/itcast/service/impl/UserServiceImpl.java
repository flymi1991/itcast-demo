package com.itcast.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itcast.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String getName() {
        return "itcast-com";
    }
}
