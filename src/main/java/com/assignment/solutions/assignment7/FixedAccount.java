package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class FixedAccount {
    double principal;
    double rate;
    double time;
    double amount;
    double compoundInterest;

    public double calculateInterest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        principal = input.nextDouble();
        System.out.println("Enter rate: ");
        rate = input.nextDouble();
        System.out.println("Enter time period: ");
        time = input.nextDouble();
        amount = principal * Math.pow((1 + ((rate /100) / 4)), (4 * time)); //This is compounded quarterly
        System.out.println("Amount is: " + amount);
        compoundInterest = amount - principal;
        return compoundInterest;
    }
}
