package com.peachyy.spi.impl;

import com.peachyy.spi.ColorGenerator;

/**
 * Created by xsTao on 2016/9/1.
 */
public class RedGeneratorImpl implements ColorGenerator {
    public String generator() {
        return "RED";
    }

    public boolean isSupport(String c) {

        return c!=null&&c.equals("RED");
    }
}
