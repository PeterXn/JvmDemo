package com.atguigu.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 * <p>
 * -Xms610m -Xmx610m
 *
 * @author Peter
 * @date 2021/9/24 8:39
 * @description: TODO
 */
public class HeapInstanceTest {

    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();

        while (true) {
            list.add(new HeapInstanceTest());

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
