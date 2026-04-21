package com.java.equalsTask.crown;

public class CrownRunner
{
    public static void main(String[] args) {
        Crown crown=new Crown("Diamond","Sri Rama","Ayodhya");
        Crown crown1=new Crown("Gold","Krishna Devaraya","Vijayanagara");
        Crown crown2=new Crown("Gold","Immadi pulakeshi","Chalukya");

        boolean equalsCheck=crown.equals(crown1);
        System.out.println("equalsCheck:"+equalsCheck);
    }
}
