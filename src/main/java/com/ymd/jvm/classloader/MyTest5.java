package com.ymd.jvm.classloader;

import java.util.Random;

public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

class MyParent5{
//    public static int a  = 5;
    public static int a  = new Random().nextInt();
}

class MyChild5 extends MyParent5{
    public static int b = 6;
//    public static int b = new Random().nextInt();
}