package com.ymd.jvm.classloader;

class CL{
    static {
        System.out.println("Class CL");
    }
}

/**
 * 调用classLoader类的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
 */
public class MyTest12 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = classLoader.loadClass("com.ymd.jvm.classloader.CL");
        System.out.println(aClass);

        System.out.println("------");

        Class<?> aClass1 = Class.forName("com.ymd.jvm.classloader.CL");
        System.out.println(aClass1);
    }
}
