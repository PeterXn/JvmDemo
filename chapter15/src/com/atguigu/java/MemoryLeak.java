package com.atguigu.java;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/10/25 12:26
 * @description TODO
 */
public class MemoryLeak {

    public static void main(String[] args) {
        while (true) {
            ArrayList beanList = new ArrayList();
            for (int i = 0; i < 500; i++) {
                Bean data = new Bean();
                data.list.add(new byte[1024 * 10]);
                beanList.add(data);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Bean {
    int size = 10;
    String info = "hello, world~";
    //static ArrayList list = new ArrayList();
    ArrayList list = new ArrayList();
}
