package com.nextgen.books.service;

import com.nextgen.books.dto.EmployeeDetailsDto;
import com.nextgen.books.dto.EmployeeDetailsResponse;
import com.nextgen.books.entity.Book;
import com.nextgen.books.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeeDetailsServiceTest {

    private EmployeeDetailsService employeeDetailsService;

    @Mock
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        employeeDetailsService = new EmployeeDetailsService(bookRepository);
    }


    @Test
    public void testCreateEmployeeDetails_ShouldReturnError_WhenMaritalStatusIsTrueAndMarriageDateIsNull() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setMaritalStatus(true);
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        assertEquals(-1, response.getCode());
        assertEquals("Date of marriage cannot be blank", response.getDescription());
    }

    @Test
    public void testCreateEmployeeDetails_ShouldReturnError_WhenEmployeeNameDoesNotStartWithEmp() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setEmployeeName("JOHN");
        employeeDetailsDto.setMaritalStatus(true);
        employeeDetailsDto.setDateOfMarriage("15/03/2000");
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        assertEquals(-1, response.getCode());
        assertEquals("This employee is not one of us", response.getDescription());
    }

    @Test
    public void testCreateEmployeeDetails_ShouldReturnSuccess_WhenEmployeeConditionsAreMet() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setEmployeeName("EMP-JOHN");
        employeeDetailsDto.setMaritalStatus(true);
        employeeDetailsDto.setDateOfMarriage("15/03/2000");
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        assertEquals(-1, response.getCode());
        assertEquals("This book for this employee does not exist", response.getDescription());
    }

    @Test
    public void testCreateEmployeeDetails_ShouldReturnSuccess() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setEmployeeName("EMP-JOHN");
        employeeDetailsDto.setMaritalStatus(true);
        employeeDetailsDto.setDateOfMarriage("15/03/2000");

        Book book = new Book();
        book.setAuthor("James");
        book.setColor("Green");

        Mockito.when(bookRepository.findBookById(Mockito.anyInt())).thenReturn(book);
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        assertEquals(0, response.getCode());
        assertEquals("Successfully created employee", response.getDescription());
    }

}