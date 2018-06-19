package com.bin.spring.singleton.staticinner;

import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
    private static Singleton instance;
    private static AtomicInteger count = new AtomicInteger();
    private Singleton(){
        System.out.println(count.getAndIncrement());
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
}
