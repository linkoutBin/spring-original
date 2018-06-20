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
}
