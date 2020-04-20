package com.ymd.jvm.lean.StringTable;

import java.util.ArrayList;
import java.util.List;

public class Demo1_6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        try {
            for(int j=0; j<260000; j++){
                list.add(String.valueOf(j).intern());
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }
    }
}
