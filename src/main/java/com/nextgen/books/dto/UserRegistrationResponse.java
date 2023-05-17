package com.nextgen.books.dto;

import lombok.Data;

@Data
public class UserRegistrationResponse {
    private int code;
    private String description;

    public UserRegistrationResponse(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public void setCodeAndDescription(int code, String description) {
        this.code = code;
        this.description = description;
    }


}