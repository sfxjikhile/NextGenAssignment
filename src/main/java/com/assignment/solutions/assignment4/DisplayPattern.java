package com.assignment.solutions.assignment4;

public class DisplayPattern {
        public static void main(String[] args) {
            int n = 5;

            // loop for rows
            for (int i = 1; i <= n; i++) {
                // loop for columns
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

