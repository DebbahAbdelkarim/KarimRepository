package com.karimcoding.workoutloggingapp.controller;

import com.karimcoding.workoutloggingapp.entity.AppUser;
import com.karimcoding.workoutloggingapp.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {


    private final UserDao userDao;

    @GetMapping("/users")
     List<AppUser> getUsers() {
        return userDao.findAll();
    }
}
