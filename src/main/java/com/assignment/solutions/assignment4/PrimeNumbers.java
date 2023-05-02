package com.assignment.solutions.assignment4;

import java.util.Scanner;

public class PrimeNumbers {
    String inputPrime(int input_Number) {

        // String displayPrimeNumbers = "";
        StringBuilder displayPrimeNumbers = new StringBuilder();

        for (int i = 1; i <= input_Number; i++){
            int count = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    count ++;
                }
            }
            if(count == 0) {
                // DisplayPrimeNumbers += i + " ";
                displayPrimeNumbers.append(i).append(" ");
            }
        }

        System.out.println("Prime numbers from 1 to " + input_Number + " are: "  );

        return(displayPrimeNumbers.toString());

    }
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int userInput = sc.nextInt();

        System.out.println(primeNumbers.inputPrime(userInput));
    }
}
