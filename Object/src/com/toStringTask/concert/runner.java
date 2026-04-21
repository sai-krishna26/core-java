package com.toStringTask.concert;

public class runner {
    public static void main(String[] args) {
        String[] artists = {"Arijit","Shreya"};
        Concert concert = new Concert();
        concert.artistName = artists;
        concert.type = Type.LIVE;
        concert.start();
        concert.end();
        System.out.println(concert);

        System.out.println("---------------------------------");
        Mananger mananger = new Mananger("ABC Events",500000);
        System.out.println("---------------------------------");

        RecordedConcert recordedConcert = new RecordedConcert();
        recordedConcert.price = 3000;
        recordedConcert.range=4000;
        recordedConcert.start();
        recordedConcert.end();
        System.out.println(recordedConcert);
    }
}
