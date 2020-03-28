package com.ymd.jvm.classloader;

/**
 * 在编译阶段，常量会被存入调用这个常量的方法的类所在的常量池中（str放在MyTest2的常量池中）
 * 助记符：
 * ldc：将int、float、String类型的常量值从常量池中推送至栈顶
 * bipush:表示将单字节（-128，127）的常量值推送至栈顶
 * sipush：表示将一个短整型常量池（-32768，32767）推送至栈顶
 * iconst_1:表示将1推送至栈顶（iconst_1 ~ 5）
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.a);
    }
}

class MyParent2{
    public static final String str = "hello world";
    public static final short a = 7;
    public static final int i = 128;
    public static final int m = 1;
    static {
        System.out.println("MyParent2 static block");
    }
}
