package com.bin.spring.singleton.doublecheck;

import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
    private static Singleton instance;
    private static AtomicInteger count = new AtomicInteger();
    private Singleton(){
        System.out.println(count.getAndIncrement());
    }
    public static Singleton getInstance(){
        if(null == instance){
            synchronized(Singleton.class){
                if(null == instance)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
