package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/10/10 22:38
 * @description TODO
 */
public class Demo {
    private int num = 1;

    public int add() {
        num = num + 2;
        return num;
    }

    public void pushConstLdc() {
        int i = -1;
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 32767;
        int f = 32768;
    }

    public void constLdc() {
        long a1 = 1;
        long a2 = 2;
        float b1 = 2;
        float b2 = 3;
        double c1 = 1;
        double c2 = 2;
        Date d = null;
    }

    public void method6() {
        int i = 10;
        i++;

        int j = 20;
        ++j;
    }

    @Test
    public void method8() {
        int i = 10;
        i = i++;
        System.out.println(i);
    }

    public void upCast() {
        int i = 10;
        long l = i;
        float f = i;
        double d = i;

        float f1 = l;
        double d1 = l;

        double d2 = f1;
    }

    public void compare1() {
        int a = 0;
        if (a == 0) {
            a = 10;
        } else {
            a = 20;
        }
    }

    public boolean compareNull(String str) {
        if (str == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 结合比较
     */
    public void compare2() {
        float f1 = 1;
        float f2 = 2;
        System.out.println(f1 < f2);
    }

    public void compare3() {
        int i1 = 10;
        long l1 = 20;
        System.out.println(i1 < l1);
    }

    /**
     * 比较条件跳转指令
     */
    public void ifCompare1() {
        int i = 10;
        int j = 20;
        System.out.println(i < j);
    }

    public void ifCompare2() {
        short s1 = 9;
        byte b1 = 10;
        System.out.println(s1 < b1);
    }

    public void ifCompare3() {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);
        System.out.println(o1 != o2);
    }

    /**
     * 多条件跳转
     */
    public void switch1(int select) {
        int num = 0;
        switch (select) {
            case 1:
                num = 10;
                break;
            case 2:
                num = 20;
                break;
            case 3:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    public void switch2(int select) {
        int num = 0;
        switch (select) {
            case 10:
                num = 10;
                break;
            case 50:
                num = 20;
                break;
            case 33:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    /**
     * jdk7新特性
     */
    public void switchStr(String season) {
        switch (season) {
            case "SPRING":
                break;
            case "SUMMER":
                break;
            case "AUTUMN":
                break;
            case "WINTER":
                break;
        }
    }


    /**
     * 比较如下2个方法有何不同？
     */
    public void whileTest() {
        int i = 0;
        while (i <= 100) {
            i++;
        }
    }

    public void forTest() {
        for (int i = 0; i <= 100; i++) {

        }
    }

    public void tryCatch() {
        try {
            File file = new File("d://hello.txt");
            FileInputStream fis = new FileInputStream(file);

            String info = "hello";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static String func() {
        return getString();
    }

    private static String getString() {
        String str = "hello";
        try {
            return str;
        } finally {
            str = "atguigu";

        }
    }

    public static void main(String[] args) {
        System.out.println(func());

        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Demo.main");
        System.out.println("args = " + args);

        System.out.println("hello,world");
        for (int i = 0; i < 200; i++) {
            for (String arg : args) {
                System.out.println("arg = " + arg);
            }
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        String n = "10";
        if (n == null) {

        }
        if (n != null) {

        }
        if (n != null) {

        }
        if (n == null) {

        }

    }

    private static final int num123 = 123;
}
