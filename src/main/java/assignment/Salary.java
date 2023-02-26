package assignment;

import java.util.Scanner;
//Assignment number 1
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("salary is: ");
        double salary = sc.nextDouble();

        double hra;
        double speAll;
        double pfDed;

        hra = 50 * salary / 100;
        speAll = 75 * salary / 100;
        pfDed = 12 * salary / 100;

        double netPayableSalary;
        netPayableSalary = salary + hra + speAll - pfDed;
        System.out.println("the net payable salary is: " + netPayableSalary);
    }
}

