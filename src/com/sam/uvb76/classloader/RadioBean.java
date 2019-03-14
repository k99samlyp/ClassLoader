package com.sam.uvb76.classloader;

/**
 * Created by LiYangpan on 2019-03-14  15:48.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:  -XX:MaxPermSize=1M -Xmx20M
 */
public class RadioBean {


    {
        System.out.println("bolock ");
    }

    static {
        System.out.println("{RadioBean}");

        byte[] xxx = new byte[1 * 1024 * 1024];
    }




    //byte[] xxx = new byte[1024 * 1024 * 1024];

}
