package com.ymd.jvm.lean;

public class JavaVMStackOOM {
    public static void main(String[] args) throws InterruptedException {
        int threadNum = 1;

        while (true) {
            new Thread(() -> {
                try {
                    Long long1 = Long.MAX_VALUE;
                    Long long2 = Long.MAX_VALUE;
                    Long long3 = Long.MAX_VALUE;
                    Long long5 = Long.MAX_VALUE;
                    Long long4 = Long.MAX_VALUE;
                    Long long6 = Long.MAX_VALUE;
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "t-" + (threadNum++)).start();
            Thread.sleep(1);
            System.out.println("threadNum = " + threadNum);
        }
    }
}
