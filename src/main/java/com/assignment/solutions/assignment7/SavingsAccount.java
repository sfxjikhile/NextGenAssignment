package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class SavingsAccount extends FixedAccount {
    double simpleInterest;

    @Override
    public double calculateInterest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        principal = input.nextDouble();
        System.out.println("Enter rate: ");
        rate = input.nextDouble();
        System.out.println("Enter time period: ");
        time = input.nextDouble();
        amount = (principal * rate * time) / 100;
        simpleInterest = amount - principal;
        return simpleInterest;
    }

}
