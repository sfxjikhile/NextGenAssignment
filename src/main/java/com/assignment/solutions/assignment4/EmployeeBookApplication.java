package com.assignment.solutions.assignment4;

import java.util.Scanner;

public class EmployeeBookApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            // Display the menu
            System.out.println("EmployeeBook Application");
            System.out.println("1. Enter Data");
            System.out.println("2. Display Data");
            System.out.println("3. Exit");

            // Get the user's choice
            System.out.print("Enter your choice (1-3): ");
            input = scanner.nextInt();

            // Invoke the appropriate method based on the user's choice
            switch (input) {
                case 1:
                    enterData();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    exitMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }

            System.out.println();
        } while (input != 3);

    }

    public static void enterData() {
        System.out.println("Entering data...");
    }

    public static void displayData() {
        System.out.println("Displaying data...");
    }

    public static void exitMenu() {
        System.out.println("Exiting the EmployeeBook application...");
    }
}

