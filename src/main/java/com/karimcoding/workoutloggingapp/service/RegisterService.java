package com.karimcoding.workoutloggingapp.service;

import com.karimcoding.workoutloggingapp.dao.UserDao;
import com.karimcoding.workoutloggingapp.dto.RegisterRequest;
import com.karimcoding.workoutloggingapp.entity.AppUser;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import static com.karimcoding.workoutloggingapp.entity.Role.USER;


@Service
@RequiredArgsConstructor
public class RegisterService {

    private final PasswordEncoder passwordEncoder;
    private final UserDao userDao;

    public ResponseEntity<?> registerUser(RegisterRequest request) {

        // if the entered email already exists, this will
        if (userDao.existsByEmail(request.email())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var user = AppUser.builder()
                .name(request.name())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .role(USER)
                .build();

        userDao.save(user);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}