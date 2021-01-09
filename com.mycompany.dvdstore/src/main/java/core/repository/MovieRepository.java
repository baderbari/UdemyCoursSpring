package core.repository;

import core.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void add (Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.gettitle()+" has been added.");
    }


}
