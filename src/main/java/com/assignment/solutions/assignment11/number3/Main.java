package com.assignment.solutions.assignment11.number3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Display1());
        executorService.execute(new Display2());
        executorService.shutdown();
    }
}
