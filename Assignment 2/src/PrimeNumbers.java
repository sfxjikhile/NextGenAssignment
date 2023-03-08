import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

        // check all numbers between 1 and n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // check if i is a prime number
            for (int j = 2; j <= Math.sqrt(i);
                 j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                }

            // if i is a prime number, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}