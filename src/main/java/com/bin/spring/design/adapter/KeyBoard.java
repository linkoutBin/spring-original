package com.bin.spring.design.adapter;

import com.bin.spring.design.adapter.computer.Computer;
import com.bin.spring.design.adapter.person.Input;

import java.util.Map;

public class KeyBoard implements Input {
    private Computer computer;

    public KeyBoard(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void input(Map<String, String> input) {
        computer.setStore(input);
    }
}
