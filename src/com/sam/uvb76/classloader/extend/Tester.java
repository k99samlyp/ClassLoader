package com.sam.uvb76.classloader.extend;

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

        int y = RadioBean.aa;


    }

}
