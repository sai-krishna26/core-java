package com.interfaces.payment;

public class PhonePe implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment successful");
    }

    @Override
    public void cancel() {
        System.out.println("Payment cancelled");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed");
    }
}
