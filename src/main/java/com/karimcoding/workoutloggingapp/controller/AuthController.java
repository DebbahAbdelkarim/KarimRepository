package com.karimcoding.workoutloggingapp.controller;

import com.karimcoding.workoutloggingapp.dao.UserDao;
import com.karimcoding.workoutloggingapp.dto.RegisterRequest;
import com.karimcoding.workoutloggingapp.service.AuthenticationService;
import com.karimcoding.workoutloggingapp.service.LogOutService;
import com.karimcoding.workoutloggingapp.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public class AuthController {

    private final UserDao userDao;
    private final RegisterService registerService;
    private final AuthenticationService authenticationService;
    private final LogOutService logOutService;

    @PostMapping("/Register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        return registerService.registerUser(request);
    }

    @PostMapping("/Authenticate")
    public ResponseEntity<?> authenticate(@RequestBody RegisterRequest request){
        return authenticationService.authenticate(request);
    }

}