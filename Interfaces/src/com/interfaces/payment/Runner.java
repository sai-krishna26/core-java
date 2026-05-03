package com.interfaces.payment;

public class Runner {
    public static void main(String[] args) {
        PhonePe payment = new PhonePe();

        System.out.println("Mode: " + Payment.MODE);
        System.out.println("Secure: " + Payment.SECURE);

        payment.pay();
        payment.cancel();
        payment.refund();
    }
}
