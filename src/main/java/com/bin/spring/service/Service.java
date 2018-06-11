package com.bin.spring.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Service {
    public String showTime() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
