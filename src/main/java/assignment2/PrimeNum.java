package assignment2;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 0;
        int b;
        int a;
        int num;
        Scanner count = new Scanner(System.in);
        System.out.print("input number: ");
        num = count.nextInt();
        while(n <= num) {
            a = 1;
            b = 0;
            while (a <= n) {
                if (n % a == 0)
                    b = b + 1;
                a++;
            }
        if(b ==2)
    System.out.println(n + " is a prime number");
n++;
        }
    }
}
