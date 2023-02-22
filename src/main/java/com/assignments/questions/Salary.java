package com.assignments.questions;

import java.util.Scanner;

// Salary Class - An alternative to Question 1 - Class created specially for Question 1
public class Salary {
    Scanner input = new Scanner(System.in);
    private double HRA = 0.5;
    private double specialAllowance = 0.75;
    private double PFDeduction = 0.12;

    public void getPayableSalary(){
        System.out.println("Enter your basic salary: ");
        Double basicSalary = input.nextDouble();
        double estimatedSalary = basicSalary * (1 + HRA + specialAllowance - PFDeduction);
        System.out.printf("Your payable salary is %s: ", estimatedSalary);
    }

    public static void main(String[] args){
        Salary salary = new Salary();
        salary.getPayableSalary();
    }
}
