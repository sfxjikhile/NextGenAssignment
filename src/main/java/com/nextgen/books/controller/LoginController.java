package com.nextgen.books.controller;

import com.nextgen.books.dto.LoginDto;
import com.nextgen.books.dto.LoginResponseDto;
import com.nextgen.books.dto.RegisterDto;
import com.nextgen.books.dto.RegisterResponseDto;
import com.nextgen.books.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/auth/")
public class LoginController {
    private final LoginService loginService;


    @GetMapping("/welcome")
    public String home() {
        return "Welcome to Daily Code Buffer!!";
    }

    @PostMapping("login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginDto loginDto) {
        return new ResponseEntity<>(loginService.login(loginDto), HttpStatus.OK);
    }

    @PostMapping("register")
    public ResponseEntity<RegisterResponseDto> register(@RequestBody RegisterDto registerDto) {
        return new ResponseEntity<>(loginService.register(registerDto), HttpStatus.OK);
    }

}
