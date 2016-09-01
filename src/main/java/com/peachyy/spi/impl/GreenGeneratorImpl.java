package com.peachyy.spi.impl;

import com.peachyy.spi.ColorGenerator;

/**
 * Created by xsTao on 2016/9/1.
 */
public class GreenGeneratorImpl  implements ColorGenerator {
    public String generator() {
        return "GREEN";
    }

    public boolean isSupport(String c) {

        return c!=null&&c.equals("GREEN");
    }
}