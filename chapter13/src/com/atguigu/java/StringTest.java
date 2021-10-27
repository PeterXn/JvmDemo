package com.atguigu.java;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/27 10:42
 * @description: TODO
 */
public class StringTest {

    /**
     * test
     */
    @Test
    public void teset1() {
        String s1 = "a" + "b" + "c";
        // "abc" 一定是放在字符串常量池，将此地址赋给s2
        String s2 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);

        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);


        String s8 = s6.intern();
        System.out.println(s3 == s8);

    }


    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";

        /**
         * 如下s1 + s2的执行细节
         * StringBuilder s = new StringBuilder()
         * s.append("a")
         * s.append("b")
         * s.toString()  -->类似于 new String("ab")
         *
         */
        String s4 = s1 + s2;

        System.out.println(s3 == s4);

    }


    @Test
    public void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";

        String s4 = s1 + s2;

        System.out.println(s3 == s4);

    }

    @Test
    public void test6() {
        Long start = System.currentTimeMillis();

        // String方式
        // 花费的时间为: 5410
        //methodString(100000);

        // StringBuilder方式
        // 花费的时间为: 4
        methodStringBuilder(100000);

        Long end = System.currentTimeMillis();
        System.out.println("花费的时间为: " + (end - start));

    }


    public void methodString(int count) {
        String src = "";
        for (int i = 0; i <= count; i++) {
            src = src + "a";
        }
    }

    public void methodStringBuilder(int count) {
        // 在实际开发中，如果基本确定添加的字符串不超过某个限定值的情况下，
        // 建议使用    public StringBuilder(int capacity)

        StringBuilder src = new StringBuilder(count);
        for (int i = 0; i <= count; i++) {
            src.append("a");
        }
    }
}
