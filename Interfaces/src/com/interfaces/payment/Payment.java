package com.interfaces.payment;

public interface Payment {
    String MODE = "UPI";
    boolean SECURE = true;

    void pay();
    void cancel();
    void refund();
}
