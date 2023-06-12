package com.nextgen.books.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginResponseDto {
    private String accessToken;
    public LoginResponseDto(String accessToken){
        this.accessToken = accessToken;
    }
}
