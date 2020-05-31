package com.ymd.jvm.memoryAllocate;

/**
 * VM参数：
 * -verbose:gc -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728（3M）
 */
public class testPretenureSizeThreshold {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        //直接分配在老年代中
        allocation = new byte[4 * _1MB];
    }
}
