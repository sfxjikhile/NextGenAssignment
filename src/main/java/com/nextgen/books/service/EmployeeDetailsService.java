package com.nextgen.books.service;

import com.nextgen.books.dto.EmployeeDetailsDto;
import com.nextgen.books.dto.EmployeeDetailsResponse;
import com.nextgen.books.entity.Book;
import com.nextgen.books.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService {
    private final BookRepository bookRepository;

    public EmployeeDetailsService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public EmployeeDetailsResponse createEmployeeDetails(EmployeeDetailsDto employeeDetailsDto) {
        if (employeeDetailsDto.isMaritalStatus() && employeeDetailsDto.getDateOfMarriage() == null) {
            return new EmployeeDetailsResponse(-1, "Date of marriage cannot be blank");
        }
        if (!employeeDetailsDto.getEmployeeName().startsWith("EMP-")) {
            return new EmployeeDetailsResponse(-1, "This employee is not one of us");
        }
        Book book = bookRepository.findBookById(employeeDetailsDto.getEmployeeId());
        if(book == null){
            return new EmployeeDetailsResponse(-1, "This book for this employee does not exist");
        }
        return new EmployeeDetailsResponse(0, "Successfully created employee");
    }
}

