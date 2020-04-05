package com.ymd.jvm.classloader;

import java.util.Random;

class FinalTest{
    public final static int x = new Random().nextInt(3);
    static {
        System.out.println("FinalTest static Block");
    }
}

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}
