package week7;

import java.util.Scanner;

class Person {
    String firstName;
    String lastName;
    int age;

    public void acceptPersonDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    }

    public void displayPersonDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String courseEnrolled;
    int studentID;

    public void acceptStudentDetails() {
        acceptPersonDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Enrolled: ");
        courseEnrolled = scanner.nextLine();
        System.out.println("Enter Student ID: ");
        studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    }

    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Course Enrolled: " + courseEnrolled);
        System.out.println("Student ID: " + studentID);
    }
}

class Employee extends Person {
    double salary;
    String departmentName;
    String designation;
    int employeeID;

    public void acceptEmployeeDetails() {
        acceptPersonDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Department Name: ");
        departmentName = scanner.nextLine();
        System.out.println("Enter Designation: ");
        designation = scanner.nextLine();
        System.out.println("Enter Employee ID: ");
        employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Designation: " + designation);
        System.out.println("Employee ID: " + employeeID);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("University Management System");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Enter Employee Details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    System.out.println("Enter Student Details:");
                    Student student = new Student();
                    student.acceptStudentDetails();
                    System.out.println("Student Details Entered:");
                    student.displayStudentDetails();
                    break;
                case 2:
                    System.out.println("Enter Employee Details:");
                    Employee employee = new Employee();
                    employee.acceptEmployeeDetails();
                    System.out.println("Employee Details Entered:");
                    employee.displayEmployeeDetails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
