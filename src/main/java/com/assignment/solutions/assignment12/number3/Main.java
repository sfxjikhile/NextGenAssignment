package com.assignment.solutions.assignment12.number3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessDetails<MonthlySalary> month = new ProcessDetails<>(new MonthlySalary());
        ProcessDetails<HourlySalary> hour = new ProcessDetails<>(new HourlySalary());

        while(true){
            System.out.println("WELCOME TOO FLEXI SELECT FROM THE OPTIONS BELOW \n1. Enter Details \n2. Display Details \n3. Exit");
            System.out.print(">>");

            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("\nEnter 1 or 2 below...... ");
                    System.out.println("1. Hourly Paid Employee \n2. Monthly Paid Employee" );
                    System.out.print(">>");
                    int select = sc.nextInt();
                    if (select == 1) hour.enterDetails();
                    if (select == 2) month.enterDetails();
                    break;
                case 2:
                    System.out.println("\nEnter 1 or 2 ...... ");
                    System.out.println("1. Hourly Paid Employee \n2. Monthly Paid Employee" );
                    System.out.print(">>");
                    int check = sc.nextInt();
                    if (check == 1) hour.displayAllDetails();
                    if (check == 2) month.displayAllDetails();
                    break;
                case 3:
                    System.out.println("Exiting...... ");
                    System.exit(0);
                    break;
                default:
                    System.out.println( "invalid input\n");
            }
        }
    }

}
