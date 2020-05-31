package com.ymd.jvm.memoryAllocate;

public class testAllocation {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：
     * -verbose:gc //在控制台输出GC情况
     * -Xmn10M//年轻代可用大小
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];//出现一次Minor GC

    }
}
