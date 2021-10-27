package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/10/22 15:32
 * @description TODO
 */
public class ThreadSleepTest {
    public static void main(String[] args) {
        System.out.println("hello - 1");
        try {
            Thread.sleep(1000 * 60 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello - 2");
    }
}
