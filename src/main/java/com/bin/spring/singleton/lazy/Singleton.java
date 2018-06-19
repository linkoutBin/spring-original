package com.bin.spring.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
    private static Singleton instance;
    private static AtomicInteger count = new AtomicInteger();
    private Singleton() {
        System.out.println(count.getAndIncrement());
    }
    public static Singleton getInstanceUnsafe(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getInstanceSafe(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
