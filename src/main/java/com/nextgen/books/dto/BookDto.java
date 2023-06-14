package com.nextgen.books.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private int id;
    private String name;
    private int pages;
    private String author;
    private String category;
    private String color;
}
