package core;

import core.controller.MovieController;
import core.entity.Movie;
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
        movieController.addUsingConsole();

    }
}
