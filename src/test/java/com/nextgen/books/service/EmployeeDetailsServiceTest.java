package com.nextgen.books.service;

import com.nextgen.books.dto.EmployeeDetailsDto;
import com.nextgen.books.dto.EmployeeDetailsResponse;
import com.nextgen.books.entity.Book;
import com.nextgen.books.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDetailsServiceTest {

    private EmployeeDetailsService employeeDetailsService;

    @Mock
    private BookRepository bookRepository;

    @Before
    public void setUp() {
        employeeDetailsService = new EmployeeDetailsService(bookRepository);
    }


    @Test
    public void testCreateEmployeeDetails_ShouldReturnError_WhenMaritalStatusIsTrueAndMarriageDateIsNull() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setMaritalStatus(true);
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        Assert.assertEquals(-1, response.getCode());
        Assert.assertEquals("Date of marriage cannot be blank", response.getDescription());
    }

    @Test
    public void testCreateEmployeeDetails_ShouldReturnError_WhenEmployeeNameDoesNotStartWithEmp() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setEmployeeName("JOHN");
        employeeDetailsDto.setMaritalStatus(true);
        employeeDetailsDto.setDateOfMarriage("15/03/2000");
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        Assert.assertEquals(-1, response.getCode());
        Assert.assertEquals("This employee is not one of us", response.getDescription());
    }

    @Test
    public void testCreateEmployeeDetails_ShouldReturnSuccess_WhenEmployeeConditionsAreMet() {
        EmployeeDetailsDto employeeDetailsDto = new EmployeeDetailsDto();
        employeeDetailsDto.setEmployeeName("EMP-JOHN");
        employeeDetailsDto.setMaritalStatus(true);
        employeeDetailsDto.setDateOfMarriage("15/03/2000");
        EmployeeDetailsResponse response = employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
        Assert.assertEquals(-1, response.getCode());
        Assert.assertEquals("This book for this employee does not exist", response.getDescription());
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
        Assert.assertEquals(0, response.getCode());
        Assert.assertEquals("Successfully created employee", response.getDescription());
    }

}