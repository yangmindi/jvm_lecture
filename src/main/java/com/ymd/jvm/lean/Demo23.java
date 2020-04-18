package com.ymd.jvm.lean;

public class Demo23 {
    public static void main(String[] args) {

        String a = "ab";

        String s = new String("a") + new String("b");
        String intern = s.intern();

//        System.out.println(intern == "ab");
//        System.out.println(s == "ab");

        System.out.println(intern == a);//intern 是串池中的 ab
        System.out.println(s == a);//s 是堆中的 ab
    }
}
