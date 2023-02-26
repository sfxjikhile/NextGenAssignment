package assignment;

import java.util.Scanner;

public class VolOfCylinder{



    public static void main(String[] args){
//Assignment number 4
        Scanner sc = new Scanner(System.in);

        System.out.println("radius is: ");

        int radius = sc.nextInt();
        System.out.println("height is: ");
        int height = sc.nextInt();


        double pie = 22/7;
        double volume = pie * (radius * radius) * height;
        System.out.println("the volume of the cylinder is: " + volume);



    }
}

