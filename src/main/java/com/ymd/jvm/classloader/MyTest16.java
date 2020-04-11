package com.ymd.jvm.classloader;

import java.io.*;

public class MyTest16 extends ClassLoader {
    private String classLoaderName;

    public final String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        super(); // 将系统类加载器当做该类的父类加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent); // 显示指定该类的父加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String className) {
        byte[] data = null;
        try {
            data = this.loadClassData(className);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String name) throws IOException {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            is = new FileInputStream(new File(name + this.fileExtension));
            byteArrayOutputStream = new ByteArrayOutputStream();

            int ch = 0;

            while (-1 != (ch = is.read())) {
                byteArrayOutputStream.write(ch);
            }
            data = byteArrayOutputStream.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                byteArrayOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return data;
    }


    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> clazz = classLoader.loadClass("com.ymd.jvm.classloader.MyTest1");
        Object o = clazz.newInstance();
        System.out.println(o.getClass().getClassLoader());
    }

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        ClassLoader.getSystemClassLoader();
        test(loader1);
    }
}
