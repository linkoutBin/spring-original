package com.bin.spring.service.impl;

import com.bin.spring.service.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceImpl implements Service{
    public String showTime() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
