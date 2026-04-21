package com.toStringTask.language;

public class About {

    String stateName;
    boolean hasFlag;

    public About(String stateName, boolean hasFlag) {
        this.stateName = stateName;
        this.hasFlag = hasFlag;

        System.out.println("state name: "+this.stateName);
        System.out.println("has Flag: "+this.hasFlag);
    }
}
