package io.github.ropereralk.clean_code.di.controller;

import io.github.ropereralk.clean_code.di.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/notification")
    public String messageUser(){
        userService.notifyUser("Congratulations");
        return "Completed Notification";

    }
}
