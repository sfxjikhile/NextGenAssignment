package com.nextgen.books.service;

import com.nextgen.books.config.AppProperties;
import com.nextgen.books.dto.UserRegistrationRequest;
import com.nextgen.books.dto.UserRegistrationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final AppProperties appProperties;

    public UserRegistrationResponse registerUser(UserRegistrationRequest userRegistrationRequest) {
        String email = userRegistrationRequest.getEmail();
        log.debug("The request from client is {}", userRegistrationRequest);
        UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse(1, "You cannot sign up with email; sign up with email instead");
        if (appProperties.isEnableEmailSignUp()) {
            userRegistrationResponse.setCodeAndDescription(1, "You can sign up with email");
            return userRegistrationResponse;
        }
        return userRegistrationResponse;
    }
}
