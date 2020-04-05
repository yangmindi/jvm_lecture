package com.ymd.jvm.classloader;

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak()
    {
        stackLength++;
        long[] longs = new long[6000];
        stackLeak();
    }

    public static void main(String [] args) throws Throwable
    {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch(Throwable e){
            System.out.println("stack length:"+oom.stackLength);
        }
    }
}
