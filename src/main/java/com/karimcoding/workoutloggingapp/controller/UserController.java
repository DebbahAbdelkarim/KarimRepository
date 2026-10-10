package com.karimcoding.workoutloggingapp.controller;

import com.karimcoding.workoutloggingapp.beans.AppUser;
import com.karimcoding.workoutloggingapp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/users")
     List<AppUser> getUsers() {
        return userDao.findAll();
    }
}
