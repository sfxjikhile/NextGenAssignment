package assignment5;

public class RandomNumberAvg{
    public static void main(String[] args) {
        double[] values = {0.5, 1.5, 2.5, 3.5, 4.5, 6.5, 7.5, 8.5, 9.5}; // array of 10 random numbers

        double sum = 0; // variable to store the sum of the values
        for (int i = 0; i < values.length; i++) {
            sum += values[i]; // add each value to the sum
        }

        double average = sum / values.length; // calculate the average

        System.out.println("The average of the values is: " + average); // print out the average
    }
}