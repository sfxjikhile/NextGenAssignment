package com.nextgen.assignment9b;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Sammy is a programmer at NewAxis Technologies. He needs to write a program,
        which will accept the employee details from a user. A user should be able to enter the name,
        contact details, and age. The minimum and maximum ages are 20 and 55, respectively.
        If the age of an employee is less than 20 or greater than 55, a user-defined exception should be thrown.
        Help Sammy to perform this task.*/
public class Employee {
    String name;
    String contact;
    int age;

    public void enterDetails() throws AgeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name: ");
        name = sc.nextLine();
        System.out.print("input your contact: ");
        contact = sc.next();
        System.out.print("input your age: ");
        age = sc.nextInt();

        if (age < 22 || age > 55)
            throw new AgeException();

        else {
            System.out.println("Age accepted\nInformation stored successfully...");
        }

    }
    public void viewDetails() {
        System.out.println("Your details are as follow");
        System.out.println("Your name is: " + name);
        System.out.println("Your contact is: " + contact);
        System.out.println("Your age is: " + age);
    }
    public void exitMenu() {
        System.out.println("Logging out....\nthank you");
    }
    public static void displayMenu() {
        System.out.println("Select an option");
        System.out.println("1: To input your details\n2: To view your details\n3: To exit the application");
    }
    public static void main(String[] args)throws AgeException {
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);
        int selection;
        try {
            do {
                displayMenu();
                selection = input.nextInt();
                switch (selection) {
                    case 1:
                        employee.enterDetails();
                        break;
                    case 2:
                        employee.viewDetails();
                        break;
                    case 3:
                        employee.exitMenu();
                    default:
                        System.out.println("invalid input, try again");
                }
            } while (selection != 3);
        } catch (InputMismatchException exp) {
            System.out.println("invalid input, try again");
        }
    }
}
