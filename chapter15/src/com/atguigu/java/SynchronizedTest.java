package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/10/18 20:59
 * @description TODO
 */
public class SynchronizedTest {

    private int i = 0;

    public synchronized void add() {
        i++;
    }

    private Object object = new Object();

    public void subtract() {
        synchronized (object) {
            i--;
        }
    }
}
