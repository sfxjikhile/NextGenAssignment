package week4;
public class NumericPattern {
    public static void main(String[] args) {
        int n = 5;

        // loop through each row
        for (int i = 1; i <= n; i++) {
            // loop through each column
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
