package com.assignments.questions;

public class CalcAverage {
    double calc(double [] array) {
        double sum = 0;
        for (double arr : array)
            sum += arr;
        return sum / array.length;
    }
    public static void main(String[] args) {
        CalcAverage calcAverage = new CalcAverage();

        System.out.println(calcAverage.calc(new double[]{10.0, 2.0, 1.3, 7.3, 9.0,10.0, 2.0, 1.3, 7.3, 5.0}));
    }

}
