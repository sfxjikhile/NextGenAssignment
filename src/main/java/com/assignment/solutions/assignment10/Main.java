package com.assignment.solutions.assignment10;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread A starts");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread A in for loop, i=" + i);
                }
                System.out.println("Thread A exits");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread A sleeping for 5 seconds");
                System.out.println("Thread A starts");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread A in for loop, i=" + i);
                }
                System.out.println("Thread A exits");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread B starts");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread B in for loop, i=" + i);
                }
                System.out.println("Thread B exits");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread B sleeping for 5 seconds");
                System.out.println("Thread B starts");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread B in for loop, i=" + i);
                }
                System.out.println("Thread B exits");
            }
        });

        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        System.out.println("Exit from the main thread.");
    }
}
