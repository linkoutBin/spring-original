package com.bin.spring.service;

import com.bin.spring.domain.User;

public interface Service {
    String showTime();

    String sayHello(String name);

    int add(User user);

    void addByJpa(User user);
}
