package com.assignment.solutions.assignment9;

import java.util.Scanner;
 /*Assignment (Week 9)- Exception Handling
Consider the scenario of the EmployeeDetails application.
 In this application, David needs to implement user-defined exceptions for the following cases:
If the menu input entered by the user is less than 1 or greater than 3,
 an appropriate message should be displayed to the user and the application must restart.
The employee id entered does not start with the alphabet “e”.*/

public class EmployeeDetails {
    String firstN;
    String lastN;
    int age;
    double salary;
    String department;
    String designation;
    String employeeId;

    public void employeeDetails() {
        System.out.println("Input your details as follows ".toUpperCase());
        Scanner input = new Scanner(System.in);
        System.out.print("First name: ");
        firstN = input.nextLine();
        System.out.print("Last name: ");
        lastN = input.nextLine();
        System.out.print("Your salary: ");
        salary = input.nextDouble();
        System.out.print("Input your age: ");
        age = input.nextInt();
        System.out.print("Department: ");
        department = input.next();
        System.out.print("Designation: ");
        designation = input.next();
        System.out.print("Please start your employee id with 'e' character\nEmployee id: ");
        employeeId = input.next();
        while (!employeeId.startsWith("e")) {
            System.out.println("Incorrect input\nPlease start your input with letter 'e'");
            employeeId = input.next();
        }
        System.out.println("Details stored successfully");
    }

    public void showDetails() {
        System.out.println("These are your details");
        System.out.println("first name is: " + firstN);
        System.out.println("last name is: " + lastN);
        System.out.println("age is: " + age);
        System.out.println("your salary is: " + salary);
        System.out.println("your department is: " + department);
        System.out.println("your designation is: " + designation);
        System.out.println("your employee id is: " + employeeId);

    }

    public void showMenu() {
        System.out.println("Please select an option\n1: To enter your details\n" +
                "2: To view your details\n3: To exit the app");
    }

    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails();
        int person;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                do {
                    employee.showMenu();
                    person = input.nextInt();
                    if (person < 1 || person > 3) throw new InvalidInputException();
                    switch (person) {
                        case 1:
                            employee.employeeDetails();
                            break;
                        case 2:
                            employee.showDetails();
                            break;
                        case 3:
                            System.out.println("Logging out...");
                            break;
                    }
                } while (person != 3);
            } catch (InvalidInputException e) {
                System.out.println("invalid selection");
            }
        }

    }

}
