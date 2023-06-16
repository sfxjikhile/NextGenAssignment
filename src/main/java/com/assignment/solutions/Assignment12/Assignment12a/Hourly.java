package com.assignment.solutions.Assignment12.Assignment12a;

public class Hourly extends EmployeeManagement implements EmployeeInfo {
    double salaryPerHour = 20.0;
    double employeeSalary;
    public void employeeInfo() {
        super.employeeManagement();
        employeeSalary = salaryPerHour * super.workDetails;
        System.out.println();
        super.viewDetail();
        System.out.println("Salary per hour is: " + salaryPerHour);
        System.out.println("Your salary after calculation: " + employeeSalary);


    }
}
