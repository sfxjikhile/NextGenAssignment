package com.assignment.solutions.assignment3;
import java.util.Scanner;

public class VolumeOfCylinder {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get input from the user for radius and height
            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();

            // Calculate the volume of the cylinder using the formula
            double volume = (22.0/7.0) * radius * radius * height;

            // Display the result
            System.out.println("The volume of the cylinder is: " + volume);

        }
}
