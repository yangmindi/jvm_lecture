package com.ymd.jvm.lean.First;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class Demo1_8 extends ClassLoader {// 用来加载类的二进制字节码
    public static void main(String[] args) {
        int j = 0;
        try {
            Demo1_8 test = new Demo1_8();
            for (int i = 0; i < 10000; i++, j++) {
                //ClassWrite :生成类的二进制字节码
                ClassWriter cw = new ClassWriter(0);
                //版本号，public，类名，报名，父类，接口
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                //返回 byte[]
                byte[] bytes = cw.toByteArray();
                //执行了类的加载
                test.defineClass("Class" + i, bytes, 0, bytes.length); // Class对象
            }
        }finally {
            System.out.println(j);
        }
    }
}
