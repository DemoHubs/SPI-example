package com.peachyy.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by xsTao on 2016/9/1.
 */
public class MainRun {
  // static ServiceLoader<ColorGenerator> serviceLoader = ServiceLoader.load(ColorGenerator.class);

    public static void main(String[] args) {
        ColorFactory.getColorInstances();

       String rst= ColorFactory.getColorInstances("RED").generator();
        System.out.println("SPI RESULT:"+rst);
    }
}
