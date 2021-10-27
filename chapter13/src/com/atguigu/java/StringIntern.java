package com.atguigu.java;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/27 16:00
 * @description: TODO
 */
public class StringIntern {
    public static void main(String[] args) {
        // 堆空间
        String s1 = new String("1");
        s1.intern();//调用此方法之前，字符串常量池已经存在"1"

        // 常量池
        String s2 = "1";
        System.out.println("s1==s2: " + (s1 == s2));

        // 堆空间
        String s3 = new String("1") + new String("1");
        s3.intern(); //在字符串常量池中生成"11"
        String s4 = "11";
        System.out.println("s3==s4: " + (s3 == s4));

    }
}
