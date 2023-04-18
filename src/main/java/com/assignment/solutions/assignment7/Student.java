package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class Student extends Person {
    String[] coursesEnrolled;
    int studentID;
    int noOfCourses;

    public void getDetails() {
        super.getDetail();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Academic Details");
        System.out.println("Enter the number of courses enrolled");
        noOfCourses = input.nextInt();
        coursesEnrolled = new String[noOfCourses];
        System.out.println("Enter the Courses names");
        for (int i = 0; i < noOfCourses; i++) {
            coursesEnrolled[i] = input.next();
        }

        System.out.println("Enter the Student ID");
        studentID = input.nextInt();
        showDetail();
    }

    public void showDetail() {
        System.out.println("The details entered are: \n");
        System.out.println("First Name: " + super.firstName);
        System.out.println("Last Name: " + super.lastName);
        System.out.println("Age: " + super.age);
        for (int i = 0; i < noOfCourses; i++) {
            System.out.println("Course Enrolled: " + coursesEnrolled[i]);
        }
        System.out.println("Student ID: " + studentID);
    }

}
