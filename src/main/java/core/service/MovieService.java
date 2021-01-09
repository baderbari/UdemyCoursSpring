package core.service;

import core.entity.Movie;
import core.repository.GoLiveMovieRepository;
import core.repository.MovieRepository;

public class MovieService {

    private GoLiveMovieRepository movieRepository= new GoLiveMovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
