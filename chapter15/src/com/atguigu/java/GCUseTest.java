package com.atguigu.java;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/30 22:15
 * @description TODO
 *
 *
 * -XX:+PrintCommandLineFlags
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while (true) {
            byte[] arr = new byte[100];
            list.add(arr);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
