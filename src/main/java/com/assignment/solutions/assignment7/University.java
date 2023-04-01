package com.assignment.solutions.assignment7;

import java.util.Scanner;

public class University {
    static void exitMenu() {
        System.out.println();
        System.out.println("logging out...\nthank you");
    }

    public static void main(String[] args) {
        Employee generate = new Employee();
        Students giveStudent = new Students();
        Scanner put = new Scanner(System.in);
        int select;
        do {
            System.out.println("1: to register as a student\n2: to register as staff\n3: exit".toUpperCase());
            System.out.print("Please select an option to continue: ".toUpperCase());
             select = put.nextInt();
            if (select == 1) {
                giveStudent.details();
                giveStudent.studentD();

            } else if (select == 2) {
                generate.details();
                generate.employeeId();
            } else if(select == 3){
                exitMenu();
            }else {
                System.out.println("invalid input, try again".toUpperCase());
                System.out.println();
            }
        }
        while (select != 3);
    }
}