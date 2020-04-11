package com.ymd.jvm.lean;

public class JavaVMHeapOOM {
    public static void main(String[] args) {
        newObject();
    }

    public static void newObject(){
        Object[] objects = new Object[5000];
        newObject();
    }
}
