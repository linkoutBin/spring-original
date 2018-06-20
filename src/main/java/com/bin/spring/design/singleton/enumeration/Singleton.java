package com.bin.spring.design.singleton.enumeration;

import java.util.concurrent.atomic.AtomicInteger;

public enum Singleton {
    SINGLETON("test");
    private String name;
    private AtomicInteger count = new AtomicInteger();

    Singleton(String name) {
        this.name = name;
        System.out.println(count.getAndIncrement());
    }

}
