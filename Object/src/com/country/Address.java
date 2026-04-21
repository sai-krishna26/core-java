package com.country;

public class Address {
    int number;
    int pinCode;
    State state;

    public Address(int number,int pinCode,State state)
    {
       this.number=number;
       this.pinCode=pinCode;
       this.state=state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", pinCode=" + pinCode +
                ", state=" + state +
                '}';
    }
}
