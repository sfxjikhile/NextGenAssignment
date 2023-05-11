package com.assignment.solutions.assignment10;

public class MainThread {
    private static Object lock = new Object();

    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                printTable(2, "Thread1");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                printTable(4, "Thread2");
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void printTable(int num, String threadName) {
        synchronized(lock) {
            System.out.println(threadName + " is printing table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + num + " x " + i + " = " + (num * i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//y
