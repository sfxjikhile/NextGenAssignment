package com.nextgen.books.controller;

import com.nextgen.books.dto.UserRegistrationRequest;
import com.nextgen.books.dto.UserRegistrationResponse;
import com.nextgen.books.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register")
    public UserRegistrationResponse registerUser(@Valid @RequestBody UserRegistrationRequest userRegistrationRequest) {
    return userService.registerUser(userRegistrationRequest);
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("bye")
    public String bye(){
        return "Byeeee!";
    }

}
