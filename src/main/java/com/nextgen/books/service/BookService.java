package com.nextgen.books.service;

import com.nextgen.books.dto.BookResponseDto;
import com.nextgen.books.entity.Book;
import com.nextgen.books.enums.ResponseCodeEnum;
import com.nextgen.books.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBookDetails() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findBookById(id);
    }

    public BookResponseDto addBookDetails(Book book) {
         bookRepository.save(book);
         return new BookResponseDto(ResponseCodeEnum.SUCCESS.getCode(),ResponseCodeEnum.SUCCESS.getDescription());
    }

    public BookResponseDto deleteBookDetailsById(int id) {
        bookRepository.deleteById(id);
        return new BookResponseDto(ResponseCodeEnum.SUCCESS.getCode(),ResponseCodeEnum.SUCCESS.getDescription());
    }

    @Transactional
    public BookResponseDto deleteBookDetailsByName(String name) {
        bookRepository.deleteBookByName(name);
        return new BookResponseDto(ResponseCodeEnum.SUCCESS.getCode(),ResponseCodeEnum.SUCCESS.getDescription());
    }
}
