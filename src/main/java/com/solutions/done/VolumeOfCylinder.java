package com.solutions.done;

import java.util.Scanner;

public class VolumeOfCylinder {
    static double $radius, $height;
    float $pi;
    float $voc;

    public VolumeOfCylinder() {
        $pi = 3.14F;
    }
    private void radius(double radius){
        $radius = Math.pow(radius, 2);
    }
    private void volume(double $radius, double $height){
        $voc = (float) ($pi*$radius*$height);
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the radius?");
        $radius = userInput.nextDouble();
        System.out.println("What is the height?");
        $height = userInput.nextDouble();

        VolumeOfCylinder $calculate = new VolumeOfCylinder();

        $calculate.radius($radius);
        $calculate.volume($radius, $height);

        System.out.println("Volume of cylinder = "+$calculate.$voc);
    }
}
