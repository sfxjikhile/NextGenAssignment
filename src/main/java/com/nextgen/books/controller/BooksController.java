package com.nextgen.books.controller;

import com.nextgen.books.dto.BookDto;
import com.nextgen.books.dto.BookResponse;
import com.nextgen.books.dto.BookResponseDto;
import com.nextgen.books.entity.Book;
import com.nextgen.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BooksController {
    private final BookService bookService;

    @GetMapping("get/all")
    public ResponseEntity<BookResponse> getAllBookDetails(
            @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize
    ) {
        return new ResponseEntity<>(bookService.getAllBookDetails(pageNo, pageSize), HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<BookDto> getBookDetailById(@PathVariable int id) {
        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }

    @PostMapping("add/book")
    public ResponseEntity<BookDto> addBookDetails(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.addBookDetails(bookDto), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<BookResponseDto> deleteBookDetails(@PathVariable int id) {
        return new ResponseEntity<>(bookService.deleteBookDetailsById(id), HttpStatus.OK);
    }

    @DeleteMapping("delete/names/{name}")
    public ResponseEntity<BookResponseDto> deleteBookDetails(@PathVariable String name) {
        return new ResponseEntity<>(bookService.deleteBookDetailsByName(name), HttpStatus.OK);
    }
}

