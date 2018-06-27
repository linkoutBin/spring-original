package com.bin.spring.design.adapter;

import com.bin.spring.design.adapter.computer.Computer;

import java.util.HashMap;
import java.util.Map;

public class Lenovo implements Computer {
    private Map<String, String> disk = new HashMap<>();

    @Override
    public String calculate(String param) {
        String result = "值已存在！";
        if (!disk.containsValue(param)) {
            disk.put(Integer.toString(disk.size()), param);
            result = "已存储至硬盘！";
        }
        return result;
    }

    @Override
    public void setStore(Map<String, String> store) {
        disk.putAll(store);
    }

    @Override
    public Map<String, String> getStore() {
        return disk;
    }
}
