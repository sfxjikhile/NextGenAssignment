package com.nextgen.assignment12c;
public class Monthly extends EmployeeManagement implements EmployeeInfo {
    double salaryPerMonth = 500.00;
    double employeeSalary;
    public void employeeInfo() {
        super.employeeManagement();
        employeeSalary = salaryPerMonth * super.workDetails;
        System.out.println();
        super.viewDetail();
        System.out.println("Salary per month is: " + salaryPerMonth);
        System.out.println("Your salary after calculation:" + employeeSalary);


    }
}
