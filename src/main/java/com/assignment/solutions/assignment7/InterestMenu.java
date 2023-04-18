package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class InterestMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Enter Account to calculate interest for");
        System.out.println("1. Fixed Account");
        System.out.println("2. Savings Account");
        System.out.println("Enter your choice");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                FixedAccount fixedAccount = new FixedAccount();
                System.out.println("The Compound interest is: "+ fixedAccount.calculateInterest());
                break;

            case 2:
                SavingsAccount savingsAccount = new SavingsAccount();
                System.out.println("Simple Interest is: " + savingsAccount.calculateInterest());
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
