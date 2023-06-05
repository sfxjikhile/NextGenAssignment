package com.nextgen.books.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetailsResponse {
    int code;
    String description;

    public EmployeeDetailsResponse(int code, String description) {
        this.code = code;
        this.description = description;

    }
}
