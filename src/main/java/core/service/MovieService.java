package core.service;

import core.entity.Movie;
import core.repository.GoLiveMovieRepository;
import core.repository.MovieRepository;
import core.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{

    MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
