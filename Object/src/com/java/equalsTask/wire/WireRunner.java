package com.java.equalsTask.wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire1=new Wire("V-gaurd",10.0,"Red");
        Wire wire2=new Wire("GM",15.0,"Blue");
        Wire wire3=new Wire("V-gaurd",10.0,"Red");
//        Wire wire3=new Wire("anchor",20.0,"Black");

        boolean check=wire1.equals(wire3);
        System.out.println("check:"+check);
    }
}
