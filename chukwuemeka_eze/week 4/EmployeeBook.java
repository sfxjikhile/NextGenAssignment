package week4;

import java.util.Scanner;

public class EmployeeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        // display the menu options to the user
        System.out.println("Menu:");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");

        // prompt the user for their choice and read it from the console
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        // switch on the user's choice and invoke the appropriate method
        switch (choice) {
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
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void enterData() {
        System.out.println("Entering Data...");
    }

    public static void displayData() {
        System.out.println("Displaying Data...");
    }

    public static void exitMenu() {
        System.out.println("Exiting Menu...");
    }
}

