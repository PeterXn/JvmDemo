package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/23 16:39
 * @description: TODO
 *
 * -Xms20m -Xmx20m
 */
public class HeapDemo1 {

    public static void main(String[] args) {
        System.out.println("start...");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
