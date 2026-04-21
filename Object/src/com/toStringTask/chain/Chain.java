package com.toStringTask.chain;

public class Chain {
    String[] material;
    Company company;
    String design;
    ChainType type;
    boolean isGold;

    public void wear() {
        System.out.println("Chain is worn");
    }

    public void remove() {
        System.out.println("Chain is removed");
    }

    @Override
    public String toString() {
        return "design:"+design+ "; type:"+type+ "; isGold:"+isGold+ "; company:"+company;
    }
}
