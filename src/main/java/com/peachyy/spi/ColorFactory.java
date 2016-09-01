package com.peachyy.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by xsTao on 2016/9/1.
 */
public class ColorFactory {
    public static void getColorInstances(){
        ServiceLoader<ColorGenerator> serviceLoader = ServiceLoader.load(ColorGenerator.class);
        Iterator<ColorGenerator> it= serviceLoader.iterator();
        while(it.hasNext()){
            ColorGenerator g=it.next();
            System.out.println(g.getClass().getName()+"=="+g.generator());
        }
    }
    public static ColorGenerator getColorInstances(String service){
        ServiceLoader<ColorGenerator> serviceLoader = ServiceLoader.load(ColorGenerator.class);
        Iterator<ColorGenerator> it= serviceLoader.iterator();
        while(it.hasNext()){
            ColorGenerator g=it.next();
            if(g.isSupport(service))
                return g;
        }
        return null;
    }
}
