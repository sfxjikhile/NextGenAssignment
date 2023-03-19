package com.assignment.solutions.assignment5;

public class Average {
    public static void main(String[] args) {
        // Define an array of 10 int values
        double[] values = {9.3, 8.1, 5.0, 9.8, 19.2, 2.4, 78.1, 32.3, 12.1};

        // Calculate the sum of the array elements
        double sum =0.0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // Calculate the average of the array elements
        double average = sum / values.length;

        // Print the average to the console
        System.out.println("The average of the values is: " + average);
    }
}
