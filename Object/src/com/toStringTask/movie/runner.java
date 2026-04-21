package com.toStringTask.movie;

public class runner {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.play();
        movie.stop();
        System.out.println(movie);

        System.out.println("---------------------------------");
        Actor actor=new Actor("Rishab shetty",40);
        System.out.println("---------------------------------");


        ActionMovie actionMovie = new ActionMovie();
        actionMovie.collection = 1200;
        actionMovie.language="Kannada";
        actionMovie.play();
        actionMovie.stop();
        System.out.println(actionMovie);
    }
}
