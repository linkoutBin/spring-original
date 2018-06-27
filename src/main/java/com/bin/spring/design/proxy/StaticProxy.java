package com.bin.spring.design.proxy;

import com.bin.spring.service.Service;

public class StaticProxy implements Service {
    private Service service;

    public StaticProxy(Service service) {
        this.service = service;
    }

    @Override
    public String showTime() {
        return service.showTime();
    }

    @Override
    public String sayHello(String name) {
        return service.sayHello(name);
    }
}
