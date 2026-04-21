package com.java.equalsTask.battery;

public class Battery {
    String type;
    String capacity;
    boolean isPortable;

    public Battery(String type, String capacity, boolean isPortable) {
        this.type = type;
        this.capacity = capacity;
        this.isPortable = isPortable;

        System.out.println("Battery type=" + type + ", capacity=" + capacity + ", isPortable=" + isPortable);
    }

    @Override
    public String toString() {
        return "Battery{" +
                "type='" + type + '\'' +
                ", capacity='" + capacity + '\'' +
                ", isPortable=" + isPortable +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Battery leftSide=this;
        if(obj instanceof Battery)
        {
            Battery rightSide=(Battery) obj;
            if(leftSide.type.equals(rightSide.type) && leftSide.capacity.equals(rightSide.capacity) && leftSide.isPortable==rightSide.isPortable)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
