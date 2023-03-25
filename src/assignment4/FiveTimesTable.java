package assignment4;

public class FiveTimesTable {
    public static void main(String[] args) {
        int[] first5multiplesOfFive = new int[5];

        for (int i = 0; i < first5multiplesOfFive.length; i++) {
            first5multiplesOfFive[i] = (i + 1) * 5;
        }

        System.out.println("The first 5 multiples of 5 are:");

        for (int j : first5multiplesOfFive) {
            System.out.println(j);
        }
    }
}