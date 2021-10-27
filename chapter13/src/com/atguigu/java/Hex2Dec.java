package com.atguigu.java;

import java.math.BigInteger;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/9/28 9:56
 * @description: TODO
 */
public class Hex2Dec {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        System.out.println("uuid: " + uuid);

        String dest = uuid.substring(uuid.length() - 20);

        System.out.println("dest: " + dest);

        BigInteger bigInteger = new BigInteger(dest, 16);

        System.out.println("bigInteger: " + bigInteger);

    }

}
