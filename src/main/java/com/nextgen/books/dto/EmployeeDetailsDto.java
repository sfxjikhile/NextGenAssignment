package com.nextgen.books.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetailsDto {
    int employeeId;
    String employeeName;
    String department;
    String designation;
    String dateOfJoining;
    String dateOfBirth;
    boolean maritalStatus;
    String dateOfMarriage;
}
