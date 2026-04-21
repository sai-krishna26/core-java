package com.java.equalsTask.wire;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Objects;

public class Wire {
        String companyName;
        double length;
        String color;

        public Wire(String companyName,double length,String color)
        {
            this.companyName=companyName;
            this.length=length;
            this.color=color;
        }

    @Override
    public String toString() {
        return "Wire{" +
                "length=" + length +
                ", companyName='" + companyName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
            Wire leftSide=this;
            if(obj instanceof Wire)
            {
                Wire rightSide=(Wire)obj;
                if(leftSide.companyName==rightSide.companyName && leftSide.length==rightSide.length && leftSide.color==rightSide.color)
                {
                    return true;
                }
            }
            return super.equals(obj);
    }
}
