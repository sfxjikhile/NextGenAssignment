package com.assignment.solutions.Assignment11;

public class ThreadLoop extends Thread {
    public ThreadLoop(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println(getName() + " starting");
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(getName() + " in for loop i " + "= " + i);
            }
            System.out.println(getName() + " exits");
            System.out.println(getName() + " sleeping for 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException exp) {
            System.out.println("Error occurred " + exp);
        }
    }
}

class Running {
    public static void main(String[] args) throws InterruptedException {
        ThreadLoop loop1 = new ThreadLoop("Thread A");
        ThreadLoop loop2 = new ThreadLoop("Thread B");
        synchronized (loop1) {
            loop1.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
            loop2.start();
        }
        try {
            loop1.join();
            loop2.join();
        } catch (InterruptedException exp) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exit main thread");
    }
}
