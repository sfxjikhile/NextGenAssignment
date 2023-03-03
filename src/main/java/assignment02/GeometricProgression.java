package assignment02;

import java.util.Scanner;


// QUESTION 6;
public class GeometricProgression {
    static Scanner sc = new Scanner(System.in);

    // This method was created to easily generate other geometric series
    public static void generateGeometricProgression(){
        System.out.print("Enter the number of terms expected in the series: ");
        int numberOfTerms = sc.nextInt();
        System.out.print("Enter the ratio or multiplier of the geometric series: ");
        int multiplier = sc.nextInt();

        String seriesMembers = "";
        for(int i = 0; i < numberOfTerms; i++){
            int member = (int)(Math.pow(multiplier, i));
            seriesMembers += (member +" ");
        }

        System.out.printf("The first %s members of the series are: %s\n", numberOfTerms, seriesMembers);
    }

    public static void main(String[] args){
        //generateGeometricProgression();

        // Alternative approach that is specific to the series requested for.
        System.out.print("Enter the number of terms expected in the series: ");
        int numberOfTerms = sc.nextInt();

        String seriesMembers = "";
        for(int i = 0; i < numberOfTerms; i++){
            int member = (int)(Math.pow(2, i));
            seriesMembers += (member +" ");
        }

        System.out.printf("The first %s members of the series are: %s\n", numberOfTerms, seriesMembers);
    }
}
