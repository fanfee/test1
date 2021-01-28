package com.test;

public class Test implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();//开启线程

        Test test2 = new Test();
        Thread thread2 = new Thread(test2);
        thread2.start();

        System.out.println(Thread.currentThread().getId());



    }

}
