package com.assignment.solutions.assignment11.number1;

public class main {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Thread A");
        Thread newThrd1 = new Thread(mt);

        MyThread mc = new MyThread("Thread B");
        Thread newThrd2 = new Thread(mc);

        try{
            newThrd1.start();
            newThrd1.join();

            newThrd2.start();
            newThrd2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exit from the main thread");


    }
}
