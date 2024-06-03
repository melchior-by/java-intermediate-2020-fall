package com.ekids.javaintermediate2020fall.lesson11;

public class Main {

    public static void main(String[] args) {
        //createMultithreaded();
        //showBenefitsOfSync();
    }

    public static void createMultithreaded() {
        //два способа работать с потоком
        //способ 1 - implements Runnable
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();

        //способ 2 - extends Thread
        ThreadDemo t1 = new ThreadDemo( "Thread-3");
        t1.start();

        ThreadDemo t2 = new ThreadDemo( "Thread-4");
        t2.start();
    }

    public static void showBenefitsOfSync() {
        Line obj = new Line();

        // creating the threads that are
        // sharing the same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);

        // threads start their execution.
        train1.start();
        train2.start();
    }
}
