package com.nextgen.assignment9c;
import java.util.Scanner;

public class NumDivision {
    double x;
    double y;
    double z;

    /*Create a program to divide two numbers. The program should provide the functionality,
 such that if a user tries to perform the division operation by 0,
  the program should terminate with a customized message.*/
    public void numDivision() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input the value of the number you want to divide: ");
            x = sc.nextDouble();
            System.out.print("Input the number for the division: ");
            y = sc.nextDouble();
            z = x / y;

            if (y == 0)
                throw new InvalidInputException("Cannot divide number by zero");
            else {
                System.out.println("The division of " + x + " and " + y + " = " + z);
                System.out.println();
            }
        } while (y != 0);
    }

    public static void main(String[] args) throws InvalidInputException {
        NumDivision division = new NumDivision();
        division.numDivision();
    }
}

