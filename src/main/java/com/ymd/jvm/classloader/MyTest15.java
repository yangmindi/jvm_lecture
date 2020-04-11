package com.ymd.jvm.classloader;

public class MyTest15 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        MyTest15[] myTest15s = new MyTest15[3];
        int[] a = new int[5];
        System.out.println(strings.getClass().getClassLoader());
        System.out.println(myTest15s.getClass().getClassLoader());
        System.out.println(a.getClass().getClassLoader());
    }
}
