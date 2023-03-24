package assignment4;

import java.util.Scanner;

public class EmployeeBook {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("EmployeeBook Menu");
            System.out.println("1. Enter Data");
            System.out.println("2. Display Data");
            System.out.println("3. Exit");

            System.out.print("Select Option: ");
            option = input.nextInt();

            if (option == 1) {
                employeeBook.enterData();
            } else if (option == 2) {
                employeeBook.displayData();
            } else if (option == 3) {
                employeeBook.exitMenu();
            } else {
                System.out.println("\nNot valid Oga");
            }
        }
    }

        private static void enterData() {
            System.out.println("\nTime to enter data...");
        }

        private static void displayData() {
            System.out.println("\nTime to display data...");
        }

        public static void exitMenu() {
            System.out.println("\nExiting app...");

        }
    }

