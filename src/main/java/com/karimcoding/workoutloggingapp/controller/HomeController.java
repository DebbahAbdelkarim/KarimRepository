package com.karimcoding.workoutloggingapp.controller;

import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Setter
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "forward:/index.html";
    }
}