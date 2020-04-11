package com.ymd.jvm.lean;

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak()
    {
        stackLength++;
        long[] res = new long[5000];
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
