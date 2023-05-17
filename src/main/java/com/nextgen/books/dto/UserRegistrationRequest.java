package com.nextgen.books.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRegistrationRequest {
    @NotBlank(message = "UserName should not be blank")
    private String username;
    @NotBlank(message = "Email should not be blank")
    private String email;
    @NotBlank(message = "Password should not be blank")
    private String password;
    @NotBlank(message = "FirstName should not be blank")
    private String firstName;
    @NotBlank(message = "LastName should not be blank")
    private String lastName;
}
