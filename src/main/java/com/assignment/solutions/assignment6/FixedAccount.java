package com.assignment.solutions.assignment6;

import java.util.Scanner;

public class FixedAccount {
    protected double balance;
    protected double fixedInterestRate = 0.05; //designated interest for fixed acc to be 5%

    public FixedAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * fixedInterestRate;
    }
}

class SavingsAccount extends FixedAccount {
    protected double savingsInterestRate = 0.015; //designated interest for Savings acc to be 1.5%

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * savingsInterestRate;
    }
}


class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = getDoubleInput(scanner, "Enter initial balance: ");

        FixedAccount fixedAccount = new FixedAccount(initialBalance);
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);

        System.out.println("Fixed account interest: " + fixedAccount.calculateInterest());
        System.out.println("Savings account interest: " + savingsAccount.calculateInterest());
    }

    public static double getDoubleInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Invalid input. " + prompt);
        }
        return scanner.nextDouble();
    }
}




