package com.solutions.done;

import java.util.Scanner;

public class NetPayableSalary {

    private static double basicSalary;
    float $hra, $specialAllowance, $pf, $totalNetPayableSalary;

    private void hra(double basicSalary1){
        $hra = (float) (basicSalary1 * 0.5);
    }
    private void specialAllowance(double basicSalary1){
        $specialAllowance = (float) (basicSalary1 * 0.75);
    }
    private void pfDeduction(double basicSalary1){
        $pf = (float) (basicSalary1 * 0.12);
    }
    private void netPayableSalary(double basicSalary1){
        $totalNetPayableSalary = (float) ((basicSalary1 + $hra + $specialAllowance)-$pf);
    }

    public static void main(String[] args) {
        Scanner basic = new Scanner(System.in);
        System.out.println("What is your Basic Salary?");
        basicSalary = basic.nextDouble();

        NetPayableSalary payable = new NetPayableSalary();

        //passes user input to methods where calculations take place
        payable.hra(basicSalary);
        payable.specialAllowance(basicSalary);
        payable.pfDeduction(basicSalary);
        payable.netPayableSalary(basicSalary);

        //print out all values of calculations
        System.out.println("Your HRA is: " + payable.$hra);
        System.out.println("Your Special Allowance is: " + payable.$specialAllowance);
        System.out.println("Your PF Deduction is: " + payable.$pf);
        System.out.println("Your Net Payable salary = "+ payable.$totalNetPayableSalary);
    }
}