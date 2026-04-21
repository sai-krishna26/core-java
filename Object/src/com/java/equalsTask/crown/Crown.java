package com.java.equalsTask.crown;

public class Crown {
    String metal;
    String crownOwnerName;
    String kingdomName;

    public Crown(String metal, String crownOwnerName, String kingdomName) {
        this.metal = metal;
        this.crownOwnerName = crownOwnerName;
        this.kingdomName = kingdomName;
    }

    @Override
    public String toString() {
        return "Crown{" +
                "metal='" + metal + '\'' +
                ", crownOwnerName='" + crownOwnerName + '\'' +
                ", kingdomName='" + kingdomName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Crown leftSide=this;
        if(obj instanceof Crown)
        {
            Crown rightSide=(Crown)obj;
            if (leftSide.metal==rightSide.metal && leftSide.crownOwnerName==rightSide.crownOwnerName && leftSide.kingdomName==rightSide.kingdomName)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
