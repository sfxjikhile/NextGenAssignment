package com.assignment.solutions.assignment12.number3;

import java.util.Scanner;

public class MonthlySalary extends EmployeeManagement implements EmployeeInfo {
    double salaryPerMonth = 10000.00;
    Scanner sc = new Scanner(System.in);

    public void inputDetails(){
        System.out.print("\nenter name : ");
        setName(sc.next());

        System.out.print("enter department : ");
        setDepartment(sc.next());

        System.out.print("Enter working duration : ");
        setHoursOrMonth(sc.nextInt());

        System.out.println("\nDetails Successfully Taken...............");

    }
    public void displayDetails(){
        System.out.println(".............................................................................");
        System.out.println("............................Details Display below............................");
        System.out.println(".............................................................................");

        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Department: " + getDepartment());
        System.out.println("Employee Work Duration: " + getHoursOrMonth());
        double salary = salaryPerMonth * getHoursOrMonth();
        System.out.println("Amount Earned Monthly : " + salaryPerMonth);
        System.out.println("Total Amount Earned in "+ getHoursOrMonth() +" Months : " + salary);

    }

}