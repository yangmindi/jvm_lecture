package com.ymd.jvm.lean.First;

public class Demo1_4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1......");
        Thread.sleep(30000);
        byte[] bytes = new byte[1024 * 1024 * 10];//10MB
        System.out.println("2......");
        Thread.sleep(30000);
        bytes = null;
        System.gc();
        System.out.println("2......");
        Thread.sleep(100000L);
    }
}
