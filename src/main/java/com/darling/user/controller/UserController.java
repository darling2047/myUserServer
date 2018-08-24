package com.darling.user.controller;

import com.darling.user.domain.User;
import com.darling.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService service;

    /**
     *
     * @param name
     * @return
     */
    @GetMapping(value = "user/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User getUser(@PathVariable("name") String name){
        User user = service.findByName(name);
       return user;
    }

}
