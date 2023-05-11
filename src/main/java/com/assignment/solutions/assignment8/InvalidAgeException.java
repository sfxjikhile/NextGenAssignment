package com.assignment.solutions.assignment8;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

class Employee {
    private String name;
    private String contact;
    private int age;

    public Employee(String name, String contact, int age) throws InvalidAgeException {
        if (age < 20 || age > 55) {//age out of bounds of 20-55
            throw new InvalidAgeException("You do not meet the age requirements of this company");
        }
        this.name = name;
        this.contact = contact;
        this.age = age;
    }

    public void display() {
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Age: " + age);
    }
}

class NewAxisTechnologies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details:");

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Contact: ");
        String contact = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        try {
            Employee employee = new Employee(name, contact, age);
            employee.display();
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age entered: " + e.getMessage());
        }
    }
}
