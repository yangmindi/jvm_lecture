package com.ymd.jvm.lean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class JavaVMHeapOOM {
    public static void main(String[] args) {
        newObject();
    }

    public static void newObject(){
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "Hello";
            while(true){
                list.add(a);
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
