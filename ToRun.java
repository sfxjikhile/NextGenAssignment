package com.nextgen.assignment11b;
public class ToRun {
    public static void main(String[] args) {
        // ThreadTable threadTable = new ThreadTable("thread1");
        Thread thrd = new Thread(new ThreadRunner("thread1", 2));
        thrd.start();
        Thread thrd2 = new Thread(new ThreadRunner("thread2", 4));
        thrd2.start();
    }
}