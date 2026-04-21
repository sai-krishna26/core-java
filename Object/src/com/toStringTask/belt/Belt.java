
package com.toStringTask.belt;

public class Belt {
    String[] brand;
    Company company;
    String color;
    BeltSize size;
    boolean isLeather;

    public void wear() {
        System.out.println("Belt is worn");
    }

    public void remove() {
        System.out.println("Belt is removed");
    }

    @Override
    public String toString() {
        return "color:"+color+ "; size:"+size+ "; isLeather:"+isLeather+ "; company:"+company;
    }
}