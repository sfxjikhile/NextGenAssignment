package com.nextgen.books.service;

import com.nextgen.books.dto.BookDto;
import com.nextgen.books.dto.BookResponse;
import com.nextgen.books.dto.BookResponseDto;
import com.nextgen.books.entity.Book;
import com.nextgen.books.enums.ResponseCodeEnum;
import com.nextgen.books.exception.BookNotFoundException;
import com.nextgen.books.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponse getAllBookDetails(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Book> books = bookRepository.findAll(pageable);
        List<Book> listOfBooks = books.getContent();
        List<BookDto> content = listOfBooks.stream().map(book -> mapToDto(book)).collect(Collectors.toList()); //Declarative
        //Can be written as (Imperative style)
//        List<BookDto> content = new ArrayList<>();
//        for (Book book : listOfBooks){
//            content.add(mapToDto(book));
//        }
        BookResponse bookResponse = new BookResponse();
        bookResponse.setContent(content);
        bookResponse.setPageNo(books.getNumber());
        bookResponse.setPageSize(books.getSize());
        bookResponse.setTotalElements(books.getTotalElements());
        bookResponse.setTotalPages(books.getTotalPages());
        bookResponse.setLast(books.isLast());
        return bookResponse;
    }

    public BookDto getBookById(int id) {
        Book book = bookRepository.findBookById(id); //In this case findBookByID is not Optional so a null check is done
        if (book == null) {
            throw new BookNotFoundException(ResponseCodeEnum.BOOK_NOT_FOUND.getDescription());
        }
        return mapToDto(book);
    }

    public BookDto addBookDetails(BookDto bookDto) {
        Book book = mapToEntity(bookDto);
        bookRepository.save(book);
        return mapToDto(book);
    }

    public BookResponseDto deleteBookDetailsById(int id) {
        //In this case findByID is Optional so we use the method orElseThrow() which is available in Optional
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(ResponseCodeEnum.BOOK_NOT_FOUND.getDescription()));
        bookRepository.delete(book);
        return new BookResponseDto(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getDescription());
    }

    @Transactional
    public BookResponseDto deleteBookDetailsByName(String name) {
        Book book = bookRepository.findBookByName(name);
        if (book == null) {
            throw new BookNotFoundException(ResponseCodeEnum.BOOK_NOT_FOUND.getDescription());
        }
        bookRepository.deleteBookByName(name);
        return new BookResponseDto(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getDescription());
    }

    private BookDto mapToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setCategory(book.getCategory());
        bookDto.setPages(book.getPages());
        bookDto.setColor(book.getColor());
        return bookDto;
    }

    private Book mapToEntity(BookDto bookDto) {
        Book book = new Book();
        book.setName(bookDto.getName());
        book.setPages(bookDto.getPages());
        book.setAuthor(bookDto.getAuthor());
        book.setCategory(bookDto.getCategory());
        book.setColor(bookDto.getColor());
        return book;
    }
}
