package com.sam.uvb76.classloader.extend;

/**
 * Created by LiYangpan on 2019-03-14  15:48.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:  -XX:MaxPermSize=1M -Xmx20M
 */
public class RadioBean extends SubRadioBean {

    static {
        System.out.println("{RadioBean}");

        byte[] xxx = new byte[1024 * 1024 * 1024];
    }

    static int a;


    //byte[] xxx = new byte[1024 * 1024 * 1024];

}
