package com.nextgen.books.service;

import com.nextgen.books.dto.LoginDto;
import com.nextgen.books.dto.LoginResponseDto;
import com.nextgen.books.dto.RegisterDto;
import com.nextgen.books.dto.RegisterResponseDto;
import com.nextgen.books.entity.Roles;
import com.nextgen.books.entity.Users;
import com.nextgen.books.repository.RoleRepository;
import com.nextgen.books.repository.UserRepository;
import com.nextgen.books.security.CustomUserDetailsService;
import com.nextgen.books.security.JWTUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final JWTUtility jwtUtility;

    private final AuthenticationManager authenticationManager;

    private final CustomUserDetailsService customUserDetailsService;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final RoleRepository rolesRepository;


    public LoginResponseDto login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.
                authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final UserDetails userDetails
                = customUserDetailsService.loadUserByUsername(loginDto.getEmail());

        String token = jwtUtility.generateToken(userDetails);
        return new LoginResponseDto(token);
    }

    public RegisterResponseDto register(@RequestBody RegisterDto registerDto) {
        if (userRepository.existsByEmail(registerDto.getEmail())) {
            return new RegisterResponseDto(-1, "Email is taken");
        }
        Users user = new Users();
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Roles roles = rolesRepository.findByName("USER").get();
        user.setRoles(Collections.singletonList(roles));
        userRepository.save(user);
        return new RegisterResponseDto(0, "User registration was successful");
    }
}
