package com.toStringTask.slipper;

public class runner {
    public static void main(String[] args) {
        Slipper slipper=new Slipper();
        slipper.sprint();
        slipper.walk();
        System.out.println(slipper);

//        String mB="delhi";
//        boolean iRL=false;
//        Location location=new Location(mB,iRL);    OR

        Location location=new Location("bengaluru",false);
        String res=location.mainBranch;
        Boolean res1=location.isRemoteLocation;
        System.out.println(res);
        System.out.println(res1);


        Crocs crocs=new Crocs();
        crocs.sprint();
        crocs.walk();
        System.out.println(crocs);
    }
}
