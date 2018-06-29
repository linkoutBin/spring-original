package com.bin.spring.design.proxy;

import com.bin.spring.service.ProxyService;

public class StaticProxy implements ProxyService {
    private ProxyService service;

    public StaticProxy(ProxyService service) {
        this.service = service;
    }

    @Override
    public String showTime() {
        return service.showTime();
    }
}
