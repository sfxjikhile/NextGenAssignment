package com.assignment.solutions.assignment11.number1;

public class MyThread implements Runnable{
    String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " starts");

        for (int count = 1; count <= 10; count++) {
            System.out.println(thrdName + " in for loop, i=" + count);
        }
        System.out.println(thrdName + " exits");
        System.out.println(thrdName + " sleeping for 5 seconds");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            System.out.println(thrdName + "Interrupted");
        }

    }
}
