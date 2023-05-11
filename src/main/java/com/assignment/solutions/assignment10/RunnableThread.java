package com.assignment.solutions.assignment10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Display1to10());
        executor.execute(new Display11to20());
        executor.shutdown();
    }
}

class Display1to10 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Display1to10: " + i);
        }
    }
}

class Display11to20 implements Runnable {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Display11to20: " + i);
        }
    }
}

