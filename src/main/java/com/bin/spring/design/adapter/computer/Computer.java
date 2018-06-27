package com.bin.spring.design.adapter.computer;

public interface Computer extends Input, Output {
    String calculate(String param);
}
