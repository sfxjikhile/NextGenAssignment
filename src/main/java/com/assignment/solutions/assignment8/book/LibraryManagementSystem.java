package com.assignment.solutions.assignment8.book;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System!");
        System.out.println("Select Book Category");
        System.out.println("1. Software Book");
        System.out.println("2. Hardware Book");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                SoftwareBook softwareBook = new SoftwareBook();
                softwareBook.getBookDetails();
                softwareBook.showBookDetails();
                break;
            case 2:
                HardwareBook hardwareBook = new HardwareBook();
                hardwareBook.getBookDetails();
                hardwareBook.showBookDetails();
                break;
            default:
                System.out.println("Invalid input \n Program is exiting now...");
                System.exit(0);
        }
    }
}