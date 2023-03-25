package assignment4;

public class GeometricProgression {
    public static void main(String[] args) {
        int n = 6; // number of terms in the sequence
        int a = 1; // first term
        int r = 2; // common ratio

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
