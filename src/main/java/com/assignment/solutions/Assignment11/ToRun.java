package com.assignment.solutions.Assignment11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTable extends Thread {

    public ThreadTable(String name) {
        super(name);
    }

    public void run() {
        int num = 2;
        System.out.println(getName() + " starting");
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
        System.out.println(getName() + " ending");
    }
}

class Thread2 extends Thread {
    public Thread2(String name) {
        super(name);
    }

    public void run() {
        int num = 4;
        System.out.println(getName() + " starting");
        for (int x = 1; x <= 10; ++x) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d * %d = %d \n", num, x, num * x);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
        System.out.println(getName() + " ending");
    }
}

public class ToRun {
    public static void main(String[] args) {
        ThreadTable threadTable = new ThreadTable("thread1");
        Thread2 thread2 = new Thread2("thread2");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(threadTable);
        executorService.execute(thread2);
        executorService.shutdown();
    }
}


