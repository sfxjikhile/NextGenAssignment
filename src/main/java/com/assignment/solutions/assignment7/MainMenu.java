package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Student Details");
            System.out.println("2. Employee Details");
            System.out.println("3. Exit Application...");
            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student st = new Student();
                    st.getDetails();
                    break;
                case 2:
                    Employee emp = new Employee();
                    emp.getDetails();
                    break;
                case 3:
                    System.out.println("Exiting Application");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (choice != 3);
    }
}