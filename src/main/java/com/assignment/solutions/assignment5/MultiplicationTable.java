package com.assignment.solutions.assignment5;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] table = new int[12][12]; // Create a 2D array to hold the table

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                table[i][j] = (j + 1) * (i + 1);
                System.out.print((j + 1) + " * " + (i + 1) + " = " + table[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}

