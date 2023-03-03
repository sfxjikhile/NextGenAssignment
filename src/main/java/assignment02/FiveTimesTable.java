package assignment02;

import java.util.Scanner;


// QUESTION 4
public class FiveTimesTable {
    static Scanner sc = new Scanner(System.in);

    public static void generateFiveTimesTable(){
        System.out.print("Enter terminal value (ie value at which to end the table): ");
        int terminalValue = sc.nextInt();

        for(int i = 0; i <= terminalValue; i++){
            int result = i * 5;
            System.out.printf("5 times %s: %s\n", i, result);
        }
    }

    public static void main(String[] args){
        generateFiveTimesTable();
    }
}

