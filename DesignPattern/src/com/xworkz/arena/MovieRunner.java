package com.xworkz.arena;

import com.xworkz.dto.normalClass.MovieDto;

public class MovieRunner
{
    public static void main(String... values) {
        MovieDto movieDto = new MovieDto("SVP", 25, true);
        System.out.println(movieDto.getMovieName());
    }
}
