package com.karimcoding.workoutloggingapp.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

    @Getter
    @RequiredArgsConstructor
    enum Permission {
        ADMIN_CREATE("Create"),
        ADMIN_READ("Read"),
        ADMIN_UPDATE("Update"),
        ADMIN_DELETE("Delete"),

        USER_CREATE("Create"),
        USER_READ("Read"),
        USER_UPDATE("Update"),
        USER_DELETE("Delete");

        private final String permission;

    }
