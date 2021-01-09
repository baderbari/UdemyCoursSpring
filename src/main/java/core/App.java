package core;

import core.controller.MovieController;
import core.entity.Movie;
import core.repository.GoLiveMovieRepository;
import core.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController= new MovieController();
        MovieService movieService=new MovieService();
        movieController.setMovieServiceInterface(movieService);
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();

    }
}
