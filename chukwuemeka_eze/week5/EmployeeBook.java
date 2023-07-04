package week5;

import java.util.Scanner;

public class EmployeeBook {
    private int employeeId;
    private String employeeName;
    private String department;
    private String designation;
    private String dateOfJoining;
    private String dateOfBirth;
    private boolean isMarried;
    private String dateOfMarriage;

    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Employee Name:");
        employeeName = scanner.nextLine();

        System.out.println("Enter Department:");
        department = scanner.nextLine();

        System.out.println("Enter Designation:");
        designation = scanner.nextLine();

        System.out.println("Enter Date of Joining (DD/MM/YYYY):");
        dateOfJoining = scanner.nextLine();

        System.out.println("Enter Date of Birth (DD/MM/YYYY):");
        dateOfBirth = scanner.nextLine();

        System.out.println("Is Employee Married? (true/false):");
        isMarried = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline character

        if (isMarried) {
            System.out.println("Enter Date of Marriage (DD/MM/YYYY):");
            dateOfMarriage = scanner.nextLine();
        }
    }

    public void viewData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID to view data:");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (empId == employeeId) {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department: " + department);
            System.out.println("Designation: " + designation);
            System.out.println("Date of Joining: " + dateOfJoining);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Is Married: " + isMarried);
            if (isMarried) {
                System.out.println("Date of Marriage: " + dateOfMarriage);
            }
        } else {
            System.out.println("Error: Invalid Employee ID.");
        }
    }

    public void exit() {
        System.out.println("Exiting EmployeeBook application...");
        System.exit(0);
    }

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("EmployeeBook Application");
            System.out.println("1. Enter Data");
            System.out.println("2. View Data");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    employeeBook.enterData();
                    break;
                case 2:
                    employeeBook.viewData();
                    break;
                case 3:
                    employeeBook.exit();
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please enter a valid choice.");
            }
        }
    }
}

