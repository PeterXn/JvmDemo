package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/23 20:37
 * @description: TODO
 */
public class HeapSpaceInitial {

    public static void main(String[] args) {
        // 返回java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        // 返回Java虚拟机试图使用的最大堆内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms : " + initialMemory + "M");
        System.out.println("-Xmx : " + maxMemory + "M");

        System.out.println("start...");

        //try {
        //    Thread.sleep(1000000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        System.out.println("end...");
    }
}
