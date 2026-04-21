package com.java.equalsTask.diamond;

public class Diamond {
    String origin;
    String color;
    boolean isOriginal;

    public Diamond(String origin, String color, boolean isOriginal) {
        this.origin = origin;
        this.color = color;
        this.isOriginal = isOriginal;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                ", isOriginal=" + isOriginal +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Diamond L=this;
        if(obj instanceof Diamond)
        {
            Diamond R=(Diamond) obj;
            if(L.origin==R.origin && L.color==R.color && L.isOriginal==R.isOriginal)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
