package com.assignment.solutions.Assignment11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    //int threadNumber;
    public void run() {
        System.out.println("Task 1 started: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 end");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println("Task 2 started: ");
        for (int x = 11; x <= 20; x++) {
            System.out.print(x + " ");
        }
        System.out.println("\nTask 2 end");
    }
}

public class ThreadDisplay {

    public static void main(String[] args) {
        Task1 task1 = new Task1();

        Task2 task2 = new Task2();
        Thread task = new Thread(task2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(task1);
        executorService.execute(task);
        executorService.shutdown();

    }
}
