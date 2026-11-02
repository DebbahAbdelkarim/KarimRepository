package com.karimcoding.workoutloggingapp.dto;

import java.time.LocalDate;

public record RegisterRequest(
        String name,
        String lastName,
        String email,
        String password,
        LocalDate dateOfBirth
) {
}