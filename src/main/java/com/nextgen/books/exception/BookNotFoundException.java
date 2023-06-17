package com.nextgen.books.exception;

public class BookNotFoundException extends RuntimeException {
    private static final long serialVerisionUID = 1;

    public BookNotFoundException(String message) {
        super(message);
    }
}
