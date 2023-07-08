package com.nextgen.assignment11b;
class ThreadRunner implements Runnable{
    String name;
    int num;
    public ThreadRunner(String name, int num) {
        this.name = name;
        this.num = num;
    }
    @Override
    public void run() {
        synchronized (ThreadRunner.class) {
            System.out.println(Thread.currentThread().getName() + " starting");
            for (int x = 1; x <= 10; ++x) {
                try {
                    Thread.sleep(1000);
                    System.out.printf("%d * %d = %d \n", num, x, num * x);
                } catch (InterruptedException exp) {
                    exp.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ending");
        }
    }
}