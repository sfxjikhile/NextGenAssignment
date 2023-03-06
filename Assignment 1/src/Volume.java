import java.util.Scanner;
public class Volume { // This is the class
    public static void main(String[] args)
    { // This is the method handling the calculation
        Scanner input = new
                Scanner(System.in);

        // This prompts the user to enter the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        // This calculates the volume of the cylinder
        double volume = Math.PI * (radius * radius) * height;
        //double volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("Math.PI " + Math.PI);
        // Display the result to the user
        System.out.println("The volume of the cylinder is " + volume);
    }
}
