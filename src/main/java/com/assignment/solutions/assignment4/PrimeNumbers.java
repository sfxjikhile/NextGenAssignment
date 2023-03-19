package com.assignment.solutions.assignment4;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print all prime numbers between 1 and n
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

