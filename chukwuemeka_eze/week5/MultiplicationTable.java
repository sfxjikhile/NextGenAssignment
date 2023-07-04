package week5;
public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 12; // Size of the multiplication table
        int[][] table = new int[size][size]; // Create a 2D array to store the multiplication table

        // Populate the multiplication table
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1); // Multiply row index by column index to get the value
            }
        }

        // Print out the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]); // Print each value with 4 spaces
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
