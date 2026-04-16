package com.toStringTask.Concert;

public class runner {
    public static void main(String[] args) {
        String[] artists = {"Arijit","Shreya"};
        Concert concert = new Concert();
        concert.artistName = artists;
        concert.type = ConcertType.LIVE;
        concert.start();
        concert.end();
        System.out.println(concert);

        System.out.println("---------------------------------");
        Organizer organizer = new Organizer("ABC Events",500000);
        System.out.println("---------------------------------");

        LiveConcert liveConcert = new LiveConcert();
        liveConcert.ticketPrice = 3000;
        liveConcert.start();
        liveConcert.end();
        System.out.println(liveConcert);
    }
}
