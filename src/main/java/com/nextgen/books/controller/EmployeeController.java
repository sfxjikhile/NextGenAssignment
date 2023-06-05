package com.nextgen.books.controller;

import com.nextgen.books.dto.EmployeeDetailsDto;
import com.nextgen.books.dto.EmployeeDetailsResponse;
import com.nextgen.books.service.EmployeeDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeDetailsService employeeDetailsService;

    @PostMapping
    public EmployeeDetailsResponse createEmployeeDetails(@RequestBody EmployeeDetailsDto employeeDetailsDto){
        return employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
    }
}
