package com.nextgen.books.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BookResponseDto {
    public BookResponseDto(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private int code;
    private String description;

}
