package com.darling.user.service;


import com.darling.user.domain.User;

public interface UserService {

    public User findByName(String name);
}
