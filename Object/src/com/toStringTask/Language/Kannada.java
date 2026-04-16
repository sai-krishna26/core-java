package com.toStringTask.Language;

public class Kannada extends  Language{
    String firstName;
    double community;

    @Override
    public void communicate() {
        System.out.println("Kannada is used to communicate");
    }

    @Override
    public void write() {
        System.out.println("Kannada can be Written");
    }

    @Override
    public String toString() {
        return "first name:"+firstName+"; community:"+community;
    }
}
