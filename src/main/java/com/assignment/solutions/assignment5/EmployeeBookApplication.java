package com.assignment.solutions.assignment5;

import java.util.Scanner;

public class EmployeeBookApplication {
    private static final int MAX_EMPLOYEES = 100; // Maximum number of employees that can be stored
    private static int numEmployees = 0; // Number of employees currently stored
    private static Employee[] employees = new Employee[MAX_EMPLOYEES]; // Array to store employee data

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Enter data");
            System.out.println("2. View data");
            System.out.println("3. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    enterData();
                    break;
                case 2:
                    viewData();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (option != 3);
    }

    private static void enterData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter employee name: ");
        String name = sc.next();
        System.out.println("Enter department: ");
        String department = sc.next();
        System.out.println("Enter designation: ");
        String designation = sc.next();
        System.out.println("Enter date of joining (dd/mm/yyyy): ");
        String dateOfJoining = sc.next();
        System.out.println("Enter date of birth (dd/mm/yyyy): ");
        String dateOfBirth = sc.next();
        System.out.println("Enter marital status (married/unmarried): ");
        String maritalStatus = sc.next();
        String dateOfMarriage = "";
        if (maritalStatus.equalsIgnoreCase("married")) {
            System.out.println("Enter date of marriage (dd/mm/yyyy): ");
            dateOfMarriage = sc.next();
        }
        Employee employee = new Employee(id, name, department, designation, dateOfJoining, dateOfBirth, maritalStatus, dateOfMarriage);
        employees[numEmployees++] = employee; // Add the new employee to the array
    }

    private static void viewData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID to view details: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getId() == id) {
                retrieveDetails(employees[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No employee found with the given ID."); // Display error message
        }
    }

    private static void retrieveDetails(Employee em) {
        System.out.println("ID: " + em.getId());
        System.out.println("Name: " + em.getName());
        System.out.println("Department: " + em.getDepartment());
        System.out.println("Designation: " + em.getDesignation());
        System.out.println("Date Of Joining: " + em.getDateOfJoining());
        System.out.println("Date Of Birth: " + em.getDateOfBirth());
        System.out.println("Marital Status: " + em.getMaritalStatus());
        System.out.println("Date Of Marriage: " + em.getDateOfMarriage());
    }
}


