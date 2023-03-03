package assignment02;

import java.util.Scanner;

// QUESTION 2
public class PrimesFinder {
    // Made Scanner a static instance variable so that I can call it inside the static method "findPrimes()"
    static Scanner sc = new Scanner(System.in);

    public static void findPrimes(){
        System.out.print("Enter the terminal value(ie number at which the search should end): ");
        // Accept the user's input
        int terminalValue = sc.nextInt();
        String primeNumbers = ""; // For storing the prime numbers found
        int counter = 0; // For counting the prime numbers found

        for(int i = 2; i <= terminalValue; i++){     // Loop has to start from 2, as 1 is not considered for determining primes
            if(i == 2){     // Edge case for when "terminalVale" is 2. 2 as a special prime.
                primeNumbers += (i +" ");
                counter++;
            }else{

                /* Loop from 2 to the square root of the i. The square root of i is a good terminal point for checking if
                    is a prime.
                */
                for(int j = 2; j <= Math.round(Math.sqrt(i)); j++){
                    if(i % j == 0) break;  // Break out of the loop if i is divisible by j.

                    // Number is a prime is the end of the loop is reached yet (i % j) is not 0.
                    if(j == Math.round(Math.sqrt(i)) && i % j != 0){
                        primeNumbers += (i + " ");
                        counter++;
                    }
                }
            }
        }

        if(counter == 0){
            System.out.printf("There are no prime numbers between 1 and %s", terminalValue);
        }else if(counter == 1){
            System.out.printf("%s is the only prime number between 1 and %s", primeNumbers, terminalValue);
        }else{
            System.out.printf("There are %s prime numbers between 1 and %s. They are: %s", counter, terminalValue, primeNumbers);
        }
    }

    public static void main(String[] args){
        findPrimes();
    }
}
