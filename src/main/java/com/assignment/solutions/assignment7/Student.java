package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class Student extends Person {
    String courseEnrolled;
    int studentID;

    public void getDetails() {
        super.getDetail();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Academic Details");
        System.out.println("Enter the Course enrolled");
        courseEnrolled = input.nextLine();
        System.out.println("Enter the Student ID");
        studentID = input.nextInt();
        showDetail();
    }

    public void showDetail() {
        System.out.println("The details entered are: \n");
        System.out.println("First Name: " + super.firstName);
        System.out.println("Last Name: " + super.lastName);
        System.out.println("Age: " + super.age);
        System.out.println("Course Enrolled: " + courseEnrolled);
        System.out.println("Student ID: " + studentID);
    }

}
