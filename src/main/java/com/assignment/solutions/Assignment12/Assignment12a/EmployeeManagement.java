package com.assignment.solutions.Assignment12.Assignment12a;

import java.util.Scanner;

public class EmployeeManagement {
    String name;
    String employeeId;
    String department;
    String designation;
    int age;
    double workDetails;
Scanner sc = new Scanner(System.in);
    public void employeeManagement(){
        System.out.println("Kindly fill in the details below");
        System.out.print("Your full name: ");
        name = sc.next();
        System.out.print("Employee ID: ");
        employeeId = sc.next();
        System.out.print("Your department: ");
        department = sc.next();
        System.out.print("Your designation: ");
        designation = sc.next();
        System.out.print("Your age: ");
        age = sc.nextInt();
        System.out.print("Enter the number of working month or hours: ");
       workDetails = sc.nextDouble();
    }
    public void viewDetail(){
        System.out.println("Here are your information");
        System.out.println("Your Name: " + name);
        System.out.println("Your ID: " + employeeId);
        System.out.println("Your Department: " + department);
        System.out.println("Your Designation: " + designation);
        System.out.println("Your Age: " + age);
        System.out.println("Your Working hours/month detail is: " + workDetails);
    }
}
