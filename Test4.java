package com.test;

import com.singleton.SingleTon;

public class Test4 extends Thread {

    @Override
    public void run() {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(singleTon);
    }


    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.start();
        Test4 test42 = new Test4();
        test42.start();
    }

}
