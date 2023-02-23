package com.assignments.questions;

import java.util.Scanner;


public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius, height");
        // input Radius
        int radius = sc.nextInt();
        // input Height
        int height = sc.nextInt();

        System.out.println("The Radius: " + radius);
        System.out.println("The Height: " + height);

        // Calculating Volume of a Cylinder
        double volume = 3.143 * (radius * radius) * height;

        // Displaying Volume of a Cylinder
        System.out.println("Volume: " + volume);

    }
}
