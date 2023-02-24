package com.assignments.questions;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Salary");

        //input basic salary of David
        int basicSalary = sc.nextInt();

        System.out.println("This is your Basic Salary : " + basicSalary );

        // Calculating the percentage of the HRA
        double hra = basicSalary * 0.5;
        // Calculating the percentage of the Special Allowance
        double specialAllow = basicSalary * 0.75;
        // Calculating the percentage of the HRA
        double pf = basicSalary * 0.12;

        System.out.println("HRA : " + hra);
        System.out.println("Special Allowance : " + specialAllow);
        System.out.println("PF Deduction : " + pf);

        // Calculating the Net Payable Salary of David
        double netPaySal = (basicSalary + hra + specialAllow) - pf;

        // Displaying the Net Payable Salary of David
        System.out.println("Net Payable Salary: " + netPaySal);
    }
}
