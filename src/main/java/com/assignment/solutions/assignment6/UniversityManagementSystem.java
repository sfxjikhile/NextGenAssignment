package com.assignment.solutions.assignment6;

import java.util.Scanner;

public class UniversityManagementSystem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("Enter 1 for student details or 2 for employee details: ");
            choice = scanner.nextInt();

            if (choice == 1) { //continuously prompt in new line to get details of students
                System.out.println("Enter student details:");

                System.out.print("First Name: ");
                String firstName = scanner.next();

                System.out.print("Last Name: ");
                String lastName = scanner.next();

                System.out.print("Age: ");
                int age = scanner.nextInt();

                System.out.print("Course Enrolled: ");
                String courseEnrolled = scanner.next();

                System.out.print("Student ID: ");
                int studentID = scanner.nextInt();

                Student student = new Student(firstName, lastName, age, courseEnrolled, studentID);
                System.out.println("Student details entered: " + student);
                validChoice = true;

            } else if (choice == 2) { //continuously prompt in new line to get details of employee
                System.out.println("Enter employee details:");

                System.out.print("First Name: ");
                String firstName = scanner.next();

                System.out.print("Last Name: ");
                String lastName = scanner.next();

                System.out.print("Age: ");
                int age = scanner.nextInt();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();

                System.out.print("Department Name: ");
                String departmentName = scanner.next();

                System.out.print("Designation: ");
                String designation = scanner.next();

                System.out.print("Employee ID: ");
                int employeeID = scanner.nextInt();

                Employee employee = new Employee(firstName, lastName, age, salary, departmentName, designation, employeeID);
                System.out.println("Employee details entered: " + employee);
                validChoice = true;

            } else {
                System.out.println("Invalid choice entered! Please try again.");
            }
        }
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

class Student extends Person { //first use of inheritance method
    String courseEnrolled;
    int studentID;

    public Student(String firstName, String lastName, int age, String courseEnrolled, int studentID) {
        super(firstName, lastName, age);
        this.courseEnrolled = courseEnrolled;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "LeanMore University Student: \n First Name=" + firstName +" \n Last Name=" + lastName + "\n Age=" + age + "\n Course Enrolled="
                + courseEnrolled + "\n Student ID=" + studentID;
    }
}

class Employee extends Person { //second use of inheritance method
    double salary;
    String departmentName;
    String designation;
    int employeeID;

    public Employee(String firstName, String lastName, int age, double salary, String departmentName, String designation, int employeeID) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.departmentName = departmentName;
        this.designation = designation;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "LeanMore University Staff: \n First Name=" + firstName + ", \n Last Name=" + lastName + ", \n Age=" + age + ", \n Salary=" + salary
                + ", \n Department Name=" + departmentName + ", \n Designation=" + designation + ", \n EmployeeID=" + employeeID;
    }
}
