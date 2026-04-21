package com.toStringTask.chain;

public class GoldChain extends Chain {
    double price;

    @Override
    public void wear() {
        System.out.println("Gold chain is worn");
    }

    @Override
    public void remove() {
        System.out.println("Gold chain is removed");
    }

    @Override
    public String toString() {
        return "price:"+price;
    }
}
