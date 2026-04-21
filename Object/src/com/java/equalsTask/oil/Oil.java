package com.java.equalsTask.oil;

public class Oil {
    String oilType;
    String material;
    double rate;

    public Oil(String oilType,String material,double rate)
    {
        this.oilType=oilType;
        this.material=material;
        this.rate=rate;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "oilType='" + oilType + '\'' +
                ", material='" + material + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Oil first=this;
        if (obj instanceof Oil)
        {
            Oil second=(Oil)obj;
            if(first.oilType==second.oilType && first.material==second.material && first.rate==second.rate)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
