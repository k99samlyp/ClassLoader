package com.sam.uvb76.classloader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiYangpan on 2019-03-13  15:41.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:  -XX:MaxPermSize=1M -Xmx20M
 */
public class Tester {

    {
        System.out.println("{MainClass}");

        final byte[] xxx = new byte[1024 * 1024 * 1024];
    }


    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        byte[] aaa = new byte[1 * 1024 * 1024];

        List<String> nnn = new ArrayList<String>();

        int i = 100000;

//        while (true){
//            nnn.add(String.valueOf(i++).intern());
//        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        //classLoader.loadClass("com.sam.uvb76.classloader.RadioBean");

        //new RadioBean();

        Class.forName("com.sam.uvb76.classloader.RadioBean",true,classLoader);
    }

}
