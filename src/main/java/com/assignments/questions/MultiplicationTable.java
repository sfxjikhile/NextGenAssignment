package com.assignments.questions;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] multiple = new int[12 + 1][12];
        for (int i = 1; i < multiple.length; i++) {
            for (int j = 1; j <= multiple[i].length; j++) {
                System.out.print((i) + "*" + (j) + "=");
                System.out.println((i) * (j));
            }
            System.out.println("............................\n");
        }
    }
}
