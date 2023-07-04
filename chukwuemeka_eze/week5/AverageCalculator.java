package week5;

public class AverageCalculator {
    public static void main(String[] args) {
        // Array of 10 double values
        double[] values = { 12.5, 15.0, 10.2, 8.7, 14.3, 11.1, 9.8, 7.5, 13.6, 16.2 };

        // Calculate sum of values
        double sum = 0.0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // Calculate average
        double average = sum / values.length;

        // Display the average
        System.out.println("Average of the 10 double values: " + average);
    }
}
