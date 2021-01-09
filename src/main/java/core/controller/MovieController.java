package core.controller;

import core.entity.Movie;
import core.service.MovieService;
import core.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole() {
        System.out.println("What is the name of the movie");

        Scanner sc = new Scanner(System.in);
        String movietitle = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movietitle);
        System.out.println("What is the genre of the movie");
        String moviegenre = sc.nextLine();
        movie.setGenre(moviegenre);
        movieServiceInterface.registerMovie(movie);
    }
}
