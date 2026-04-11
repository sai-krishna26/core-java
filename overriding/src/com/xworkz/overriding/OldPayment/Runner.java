package com.xworkz.overriding.OldPayment;

public class Runner {
    public static void main(String[] args) {
        SmartPay smartPay=new SmartPay();
        smartPay.pay();

        OldPayment oldPayment=new OldPayment();
        oldPayment.pay();

        OldPayment oldPayment1=new SmartPay();
        oldPayment1.pay();
    }
}
