package com.ymd.jvm.lean.First;

public class Demo1_1 {
    public static void main(String[] args) {
        int i = method1(1, 2);
        System.out.println(i);
    }

    public static int method1(int a, int b) {
        return method2(a, b);
    }

    public static int method2(int a, int b) {
        int c = a + b;
        return c;
    }
}
