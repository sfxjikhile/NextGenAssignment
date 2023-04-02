package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class Employee extends Person{
    int employeeID;
    double salary;
    String departmentName;
    String designation;

    public void getDetails(){
        super.getDetail();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Professional Details");
        System.out.println("Enter Employee ID");
        employeeID = input.nextInt();
        System.out.println("Enter the Department Name:");
        departmentName = input.next();
        System.out.println("Enter the Designation:");
        designation = input.next();
        System.out.println("Enter the Salary");
        salary = input.nextDouble();
        showDetail();
    }

    public void showDetail(){
        System.out.println("The details entered are: \n");
        System.out.println("First Name: "+ super.firstName);
        System.out.println("Last Name: "+ super.lastName);
        System.out.println("Age: "+ super.age);
        System.out.println("Employee ID: "+ employeeID);
        System.out.println("Department Name: "+ departmentName);
        System.out.println("Designation: "+ designation);
        System.out.println("Salary: "+ salary);
    }
}
