package NextGenAssignments;

import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        double volume = 22.0/7 * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);

        input.close();
    }
}
