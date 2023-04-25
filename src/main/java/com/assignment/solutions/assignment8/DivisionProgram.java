package com.assignment.solutions.assignment8;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object to read user input
        try {
            System.out.print("Enter numerator: ");
            int numerator = input.nextInt(); // read numerator input from user

            System.out.print("Enter denominator: ");
            int denominator = input.nextInt(); // read denominator input from user

            if (numerator == 0 || denominator == 0) { // check if numerator or denominator is zero
                throw new ArithmeticException("Error: Cannot divide by 0."); // if zero, throw an ArithmeticException with this message
            }
            double quotient = (double) numerator / denominator; // perform division operation and store the result in quotient
            System.out.println("Quotient = " + quotient); // display the quotient to the user
        } catch (ArithmeticException e) { // catch any ArithmeticException thrown in the try block
            System.out.println(e.getMessage()); // display the message associated with the exception
        }
    }
}