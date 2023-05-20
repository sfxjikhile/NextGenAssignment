package com.assignment.solutions.assignment11.number2;

public class Main {
    public static void main(String[] args) {
        TableThread thread1 = new TableThread(2, "Thread1");
        Thread t1 = new Thread(thread1);

        TableThread thread2 = new TableThread(4, "Thread2");
        Thread t2 = new Thread(thread2);

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
