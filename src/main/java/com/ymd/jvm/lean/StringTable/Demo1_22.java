package com.ymd.jvm.lean.StringTable;

public class Demo1_22 {
    public static void main(String[] args) {
        //懒惰的
        String s = "a";
        String s1 = "b";
        String s2 = "ab";
        String s4 = s1 + s2;

        System.out.println(s2 == s4);

        String s5 = "a" + "b";
    }
}
