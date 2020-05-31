package com.ymd.jvm.lean.StringTable;

public class Demo23 {
    public static void main(String[] args) {

        String a = "ab";    //  ["ab", "a", "b"]

        String s = new String("a") + new String("b");
        // 将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池， 会把串池中的对象返回
        // 所以 s.intern() 表示把s也放入到串池中
        String intern = s.intern();

//        System.out.println(intern == "ab");
//        System.out.println(s == "ab");

        System.out.println(intern == a);//intern 是串池中的 ab
        System.out.println(s == a);//s 是堆中的 ab，因为 String a = "ab"; 串池中已经有了所以s就不会放入到串池中还是在堆中
    }
}
