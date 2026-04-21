package com.country;

public class Collector {
    String name;
    String batchNo;

    public Collector(String name, String batchNo)
    {
        //System.out.println("executing Collector");
        this.name=name;
        this.batchNo=batchNo;
    }

    @Override
    public String toString() {
        return "Collector{" +
                "name='" + name + '\'' +
                ", batchNo='" + batchNo + '\'' +
                '}';
    }
}
