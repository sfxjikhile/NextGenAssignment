package com.nextgen.books.controller;

import com.nextgen.books.dto.BookResponseDto;
import com.nextgen.books.entity.Book;
import com.nextgen.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BooksController {
    private final BookService bookService;

    @GetMapping("get/all")
    public List<Book> getAllBookDetails() {
        return bookService.getBookDetails();
    }

    @GetMapping("get/{id}")
    public Book getBookDetailById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("add/book")
    public BookResponseDto addBookDetails(@RequestBody Book book) {
        return bookService.addBookDetails(book);
    }

    @DeleteMapping("delete/{id}")
    public BookResponseDto deleteBookDetails(@PathVariable int id) {
        return bookService.deleteBookDetailsById(id);
    }

    @DeleteMapping("delete/names/{name}")
    public BookResponseDto deleteBookDetails(@PathVariable String name) {
        return bookService.deleteBookDetailsByName(name);
    }
}

