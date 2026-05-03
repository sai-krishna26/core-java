package com.interfaces.fan;

public interface FanControl {
    String BRAND = "Havells";
    boolean REMOTE = true;

    void on();
    void off();
    void rotate();
}
