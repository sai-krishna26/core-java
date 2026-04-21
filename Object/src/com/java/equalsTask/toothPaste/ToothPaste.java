package com.java.equalsTask.toothPaste;

public class ToothPaste {
    String companyName;
    String type;
    double rate;

    public  ToothPaste(String companyName, String type, double rate)
    {
        this.companyName=companyName;
        this.type=type;
        this.rate=rate;

        System.out.println("companyName=" + companyName +
                ", type=" + type +
                ", rate=" + rate);
    }

    @Override
    public String toString() {
        return "ToothPaste{" +
                "companyName='" + companyName + '\'' +
                ", type='" + type + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        ToothPaste left=this;
        if(obj instanceof  ToothPaste)
        {
            ToothPaste right=(ToothPaste) obj;
            if (left.companyName.equals(right.companyName) && left.type.equals(right.type) && left.rate==right.rate)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
