package assignment4;

import java.util.Scanner;

public class PrimeNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            System.out.print("Prime numbers between 1 and " + number + ": ");
            for (int i = 2; i <= number; i++) {
                boolean isItPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isItPrime = false;
                        break;
                    }
                }
                if (isItPrime) {
                    System.out.print(i + "\n ");
                }
            }
        }
    }