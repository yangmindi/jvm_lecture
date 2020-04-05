package com.ymd.jvm.classloader;

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("java.lang.String");
        //返回针对于这个类的类加载器
        System.out.println(aClass.getClassLoader());

        Class<?> aClass1 = Class.forName("com.ymd.jvm.classloader.C");
        System.out.println(aClass1.getClassLoader());
    }
}

class C{

}
