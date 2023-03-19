package com.assignment.solutions.assignment3;

import java.util.Scanner;

public class NetPayableSalary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");

        double basicSalary = input.nextDouble();
        double hra = 0.5 * basicSalary;
        double specialAllowance = 0.75 * basicSalary;
        double pfDeduction = 0.12 * basicSalary;
        double netPayableSalary = (basicSalary + hra + specialAllowance) - pfDeduction;
        System.out.println("Net payable salary: " + netPayableSalary);
    }

}
