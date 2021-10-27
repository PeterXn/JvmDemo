package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/24 9:30
 * @description: TODO
 *
 * -Xms10m -Xmx10m -XX:+PrintGCDetails
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;

        try {
            List<String> list = new ArrayList<>();
            String a = "GcTest.com";

            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
