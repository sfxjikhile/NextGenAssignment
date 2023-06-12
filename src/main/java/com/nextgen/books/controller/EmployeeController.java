package com.nextgen.books.controller;

import com.nextgen.books.dto.EmployeeDetailsDto;
import com.nextgen.books.dto.EmployeeDetailsResponse;
import com.nextgen.books.service.EmployeeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeDetailsService employeeDetailsService;

    @PostMapping
    public EmployeeDetailsResponse createEmployeeDetails(@RequestBody EmployeeDetailsDto employeeDetailsDto){
        return employeeDetailsService.createEmployeeDetails(employeeDetailsDto);
    }
}
