package com.assignment.solutions.assignment11.number2;


public class TableThread implements Runnable{
    private static Object lock = new Object();

    int num;
    String name;

    public TableThread(int num, String name) {
        this.num = num;
        this.name = name;
    }


    public void run(){
       synchronized (lock) {
           System.out.println( name + " has started running");
           try{
               for (int i = 1; i <= 10; i++) {
                   System.out.println(num + " * " + i  + " = " + i * num);
                   Thread.sleep(1000);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println();
       }

    }
}
