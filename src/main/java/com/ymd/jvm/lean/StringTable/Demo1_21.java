package com.ymd.jvm.lean.StringTable;

public class Demo1_21 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b"; // 编译器优化为 ab
        String s4 = s1 + s2; // 运行期间 StringBuilder拼接，在堆中
        String s5 = "ab";
        String s6 = s4.intern();

        //问题：
        System.out.println(s3 == s4); // s4在堆中
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);

        String x2 = new String("c") + new String("d");
//        String x1 = "cd";
//        x2.intern();

        // 反过来的话结果如何？
        x2.intern();
        String x1 = "cd";

        System.out.println(x1 == x2);
    }
}
