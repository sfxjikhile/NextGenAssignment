package assignment5;

public class TwelveTimesTable{
    public static void main(String[] args) {
        int[][] table = new int[12][12]; // create an array to store the table

        // populate the array with multiplication values
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                table[i][j] = (i + 1) * (j + 1); // multiply rows and columns elements
            }
        }

        // print out the table
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%10d", table[i][j]); // format output with spaces inbetween
            }
            System.out.println(); // print and move to next line
        }
    }
}