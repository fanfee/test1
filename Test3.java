package com.test;

import com.singleton.SingleTon;

public class Test3 {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();
        System.out.println(singleTon==singleTon1);


    }


}
