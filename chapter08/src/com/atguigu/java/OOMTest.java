package com.atguigu.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * -Xms610m -Xmx610m
 *
 * @author Peter
 * @date 2021/9/23 21:06
 * @description: TODO
 *
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 	at com.atguigu.java.Picture.<init>(OOMTest.java:35)
 * 	at com.atguigu.java.OOMTest.main(OOMTest.java:26)
 */
public class OOMTest {

    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();

        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
