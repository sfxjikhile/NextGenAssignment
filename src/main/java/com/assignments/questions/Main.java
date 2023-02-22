package com.assignments.questions;

import java.util.Scanner;

public class Main {
    // Scanner for Reading in User Input
    Scanner sc = new Scanner(System.in);

    // Instance variables for estimating payable salary - Question 1;
    private double HRA = 0.5;
    private double specialAllowance = 0.75;
    private double PFDeduction = 0.12;

    // Method for estimating Payable salary - Question 1;
    public void getPayableSalary(){
        System.out.println("What is your basic salary");
        Double basicSalary = sc.nextDouble();
        double estimatedSalary = basicSalary * (1 + HRA + specialAllowance - PFDeduction);
        System.out.printf("Your payable salary is %s: ", estimatedSalary);
    }

    // Question 4: Method for estimating the volume of a Cylinder;
    private final double PI = 22/7; // Instance variable (Final because PI is a constant);
    public void getCylinderVolume(double radius, double height){
        double volume = this.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume of a Cylinder whose radius is %s and height is %s, is: %s", radius, height, volume);
    }
    public static void main(String[] args) {
        // Instantiation and calling the getPayableSalary method - Question 1;
        Salary salary = new Salary();
        salary.getPayableSalary();

        // Assignment 3 - Order of Operation;
        int result = 4 * (8 + 4) / 4;
        System.out.println("\nThe result of the operation is: "+ result);

        //Question 4
        // Class Instantiation and calling the "getCylinderVolume" method;
        Main main = new Main();
        main.getCylinderVolume(3, 7);
    }
}
