package com.atguigu.java;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/10/20 20:11
 * @description TODO
 */
public class PassiveUse {

    @Test
    public void test1() {

        System.out.println(Child.num);
    }
}

class Parent {
    static{
        System.out.println("Parent的初始化过程");
    }

    public static int num = 1;
}

class Child extends Parent {
    static{
        System.out.println("Child的初始化过程");
    }
}
