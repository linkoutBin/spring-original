package com.bin.spring.singleton.eager;

import java.io.ObjectStreamException;
import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
    private static AtomicInteger count = new AtomicInteger();//实例化对象需要依赖此属性，所以需要定义在调用构造函数之前（预先加载此属性）
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println(count.getAndIncrement());
    }

    public static Singleton getInstance() {
        return instance;
    }

    //防止反序列化重新生成对象
    public Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
