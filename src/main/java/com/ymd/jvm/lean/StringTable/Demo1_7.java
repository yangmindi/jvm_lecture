package com.ymd.jvm.lean.StringTable;

public class Demo1_7 {
    public static void main(String[] args) {
        int i = 0;
        try {
            for (int j = 0; j < 20000; j++) {
                String.valueOf(j).intern();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }
}
