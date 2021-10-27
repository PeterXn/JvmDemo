package com.atguigu.java;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/29 10:39
 * @description TODO
 *
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 *
 */
public class HeapOOM {

    // 1MB
    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Exception exception) {
            System.out.println("count = " + count);
            exception.printStackTrace();
        }
    }

}
