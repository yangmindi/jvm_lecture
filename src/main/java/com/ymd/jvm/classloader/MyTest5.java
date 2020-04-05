package com.ymd.jvm.classloader;

import java.util.Random;

public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

class Grandpa{
    public static Thread thread = new Thread(){
        {
            System.out.println("Grandpa invoked");
        }
    };
}

interface MyParent5{
//    public static int a  = 6;
//    public static int a  = new Random().nextInt();

    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

class MyChild5 implements MyParent5{
    public static int b = new Random().nextInt(5);
//    public static final int b = new Random().nextInt();
}