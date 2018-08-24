package com.darling.user.service.impl;

import com.darling.user.domain.User;
import com.darling.user.mapper.UserMapper;
import com.darling.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User findByName(String name) {
        return mapper.findByName(name);
    }
}
