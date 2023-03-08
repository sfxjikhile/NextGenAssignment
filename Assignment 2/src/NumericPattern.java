public class NumericPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            // This starts the coun for number of digits
            for (int j = 1; j<= i; j++) {
                // This prints the digits based on the count above
                System.out.print(j);
            }
            System.out.println();
            }
    }
}
