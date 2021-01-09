package core.service;

import core.entity.Movie;
import core.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository= new MovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
