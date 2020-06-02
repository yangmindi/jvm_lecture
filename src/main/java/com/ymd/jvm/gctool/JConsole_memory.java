package com.ymd.jvm.gctool;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms100M -Xmx100M -XX:+UseSerialGC
 */
public class JConsole_memory {
    /**
     * 内存占位符对象，一个OOMObject大约占64KB，循环1000次，占64MB
     */
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList();
        for (int i = 0; i < num; i++) {
            //稍做延时，令监视曲线的变化更加明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        Thread.sleep(100000000L);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        fillHeap(1000);
        System.gc();
    }
}
