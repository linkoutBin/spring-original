package com.bin.spring.service.impl;

import com.bin.spring.service.ProxyService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyServiceImpl implements ProxyService {
    @Override
    public String showTime() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
