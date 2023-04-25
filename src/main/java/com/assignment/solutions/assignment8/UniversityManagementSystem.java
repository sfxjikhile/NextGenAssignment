//package com.assignment.solutions.assignment8;
//
//import java.util.Scanner;
//
//public class UniversityManagementSystem {
//    public void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int choice;
//        boolean validChoice = false;
//
//        while (!validChoice) {
//            System.out.println("Enter: \n1 for Student \n2 for Employee \n3 to exit");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter student details:");
//
//                    System.out.print("First Name: ");
//                    String firstName = scanner.next();
//
//                    System.out.print("Last Name: ");
//                    String lastName = scanner.next();
//
//                    System.out.print("Age: ");
//                    int age = scanner.nextInt();
//
//                    System.out.print("Course Enrolled: ");
//                    String courseEnrolled = scanner.next();
//
//                    System.out.print("Student ID: ");
//                    int studentID = scanner.nextInt();
//
//                    Student student = new Student(firstName, lastName, age, courseEnrolled, studentID);
//                    System.out.println("Student details entered: " + student);
//                    validChoice = true;
//
//                case 2:
//                    System.out.println("Enter employee details:");
//
//                    System.out.print("First Name: ");
//                    firstName = scanner.next();
//
//                    System.out.print("Last Name: ");
//                    lastName = scanner.next();
//
//                    System.out.print("Age: ");
//                    age = scanner.nextInt();
//
//                    System.out.print("Salary: ");
//                    double salary = scanner.nextDouble();
//
//                    System.out.print("Department Name: ");
//                    String departmentName = scanner.next();
//
//                    System.out.print("Designation: ");
//                    String designation = scanner.next();
//
//                    System.out.print("Employee ID: ");
//                    int employeeID = scanner.nextInt();
//
//                    if(employeeID.indexOf("e") !=0) {
//                        System.out.println("Invalid Employee Number, Pls Try Again!!");
//                        continue;
//                    }
//
//                    Employee employee = new Employee(firstName, lastName, age, salary, departmentName, designation, employeeID);
//                    System.out.println("Employee details entered: " + employee);
//                    validChoice = true;
//                    break;
//
//                case 3:
//                    System.out.println("Exiting Menu");
//                    validChoice = true;
//                    break;
//
//                default:
//                    System.out.println("Invalid choice, kindly try again");
//                    break;
//            }
//        }
//    }
//
//    class Person {
//        String firstName;
//        String lastName;
//        int age;
//
//        public Person(String firstName, String lastName, int age) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.age = age;
//        }
//    }
//
//    class Student extends Person { //first use of inheritance method
//        String courseEnrolled;
//        int studentID;
//
//        public Student(String firstName, String lastName, int age, String courseEnrolled, int studentID) {
//            super(firstName, lastName, age);
//            this.courseEnrolled = courseEnrolled;
//            this.studentID = studentID;
//        }
//
//        @Override
//        public String toString() {
//            return "LeanMore University Student: \n First Name=" + firstName + " \n Last Name=" + lastName + "\n Age=" + age + "\n Course Enrolled="
//                    + courseEnrolled + "\n Student ID=" + studentID;
//        }
//    }
//
//    class Employee extends Person { //second use of inheritance method
//        double salary;
//        String departmentName;
//        String designation;
//        String employeeID;
//
//        public Employee(String firstName, String lastName, int age, double salary, String departmentName, String designation, int employeeID) {
//            super(firstName, lastName, age);
//            this.salary = salary;
//            this.departmentName = departmentName;
//            this.designation = designation;
//            this.employeeID = String.valueOf(employeeID);
//        }
//
//        @Override
//        public String toString() {
//            return "LeanMore University Staff: \n First Name=" + firstName + ", \n Last Name=" + lastName + ", \n Age=" + age + ", \n Salary=" + salary
//                    + ", \n Department Name=" + departmentName + ", \n Designation=" + designation + ", \n EmployeeID=" + employeeID;
//        }
//    }
//}
