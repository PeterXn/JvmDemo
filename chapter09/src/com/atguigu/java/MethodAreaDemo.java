package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/24 16:06
 * @description: TODO
 *
 * 测试使用方法区大小参数的默认值
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 *
 */
public class MethodAreaDemo {

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
