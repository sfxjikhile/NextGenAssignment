package com.nextgen.assignment12b;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name: ");
        String input2 = sc.next();
        while (!input2.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input (name should only contain alphabets), try again");
            input2 = sc.next();
            if (input2.matches("[a-zA-Z]+")) {
                System.out.println("Information successfully stored");
            }
        }
        System.out.print("input your number: ");
        String input1 = sc.next();
        while (!input1.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
            System.out.println("invalid input (your contact should only contain digits), try again");
            input1 = sc.next();
        }
        if (input1.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
            System.out.println("Information successfully stored");
        }
    }
}
