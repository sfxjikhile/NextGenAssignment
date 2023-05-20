package com.assignment.solutions.assignment7.ManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementSystem extends School implements SystemDetails {
    Scanner sc = new Scanner(System.in);

    public void details() {
        try{
            System.out.print("Student enter  1  \nEmployee enter 2 \n>>");
            int opt = sc.nextInt();

            switch (opt) {
                case 1 :
                    studentInput();
                    break;
                case 2 :
                    employeeInput();
                    break;
                default:
                    System.out.println("WRONG INPUT: input should be between 1 and 2....");
            }

        }catch(InputMismatchException exc) {
            System.out.println("SomeThing Went Wrong : Input mismatched  \nReload and try again....");
        }
    }


    public void employeeInput() {
        System.out.print("enter first name:");
        setFirstName(sc.next());

        System.out.print("enter last name:");
        setLastname(sc.next());

        System.out.print("enter age:");
        setAge(sc.next());

        System.out.print("enter salary:");
        setSalary(sc.next());

        System.out.print("enter Department:");
        setDepartmentName(sc.next());

        System.out.print("enter Designation:");
        setDesignation(sc.next());

        System.out.print("enter ID:");
        setID(sc.next());

        message(getFirstName());

        System.out.println(
                "\nFirstName : " + getFirstName() +
                "\nLastName : " + getLastname() +
                "\nAge : " + getAge() +
                "\nSalary : "+ getSalary()+
                "\nDepartment : " + getDepartmentName() +
                "\nDesignation : " + getDesignation() +
                "\nEmployeeID : " + getID()
        );

    }


    public void studentInput () {
        System.out.print("enter first name:");
        setFirstName(sc.next());

        System.out.print("enter last name:");
        setLastname(sc.next());

        System.out.print("enter age:");
        setAge(sc.next());

        System.out.print("enter course enrolled:");
        setCourseEnrolled(sc.next());

        System.out.print("enter id:");
        setID(sc.next());

        message(getFirstName());
        System.out.println(
                "\nFirstName : " + getFirstName() +
                "\nLastName : "+ getLastname() +
                "\nCourseEnrolled : " + getCourseEnrolled() +
                "\nStudent ID : " + getID() +
                "\nAge : " + getAge()
        );
    }

    public void message(String name){
        String messAge = " your details has been successfully uploaded.....";
        System.out.println("\n " + name + messAge);
    }

}
