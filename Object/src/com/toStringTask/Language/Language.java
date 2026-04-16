package com.toStringTask.Language;

public class Language {
    String name;
    Location location;
    About about;
    boolean hasLiterature;
    double communitySize;

    public void communicate()
    {
        System.out.println("Language is use to communicate()");
    }

    public void write()
    {
        System.out.println("Language is used to Write()");
    }

    @Override
    public String toString() {
        return "name:"+name+" community:"+communitySize+"; hasLiterature:"+hasLiterature+"; location:"+Location.SOUTH;
    }
}
