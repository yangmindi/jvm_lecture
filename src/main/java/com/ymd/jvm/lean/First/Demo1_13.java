package com.ymd.jvm.lean.First;

import java.util.ArrayList;
import java.util.List;

public class Demo1_13 {
    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        for(int i=0; i<200; i++){
            students.add(new Student());
        }
        Thread.sleep(100000L);
    }
}

class Student{
    private byte[] bytes = new byte[1024 * 1024];
}
