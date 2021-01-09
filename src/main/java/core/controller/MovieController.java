package core.controller;

import core.entity.Movie;
import core.service.MovieService;

import java.util.Scanner;

public class MovieController {
    public void addUsingConsole() {
        System.out.println("What is the name of the movie");

        Scanner sc = new Scanner(System.in);
        String movietitle = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movietitle);
        System.out.println("What is the genre of the movie");
        String moviegenre = sc.nextLine();
        movie.setGenre(moviegenre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
