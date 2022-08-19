package com.example.firstapp;

public class Counter {
    Integer value;

    public Counter() {
        value = 0;
    }

    public Counter(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }
}
