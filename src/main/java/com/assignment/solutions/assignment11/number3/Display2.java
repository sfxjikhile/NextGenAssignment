package com.assignment.solutions.assignment11.number3;

public class Display2 implements Runnable{
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("second display : " + i);
        }
    }
}
