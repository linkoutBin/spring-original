package com.bin.spring.design.adapter.person;

import com.bin.spring.design.adapter.KeyBoard;

import java.util.Map;

public class Person implements Input {
    private KeyBoard keyBoard;

    @Override
    public void input(Map<String, String> input) {
        keyBoard.input(input);
    }
}
