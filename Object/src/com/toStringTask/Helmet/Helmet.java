package com.toStringTask.Helmet;

public class Helmet {
    String[] material;
    String use;
    Company company;
    Purpose purpose;
    boolean isPlastic;

    public void wear()
    {
        System.out.println("Helmet is used to wear");
    }

    public void remove()
    {
        System.out.println("Helmet can be remove after use");
    }

    @Override
    public String toString() {
        return "use:"+use+"; purpose:"+Purpose.MILITARY+"; isPlastic:"+isPlastic;
    }
}
