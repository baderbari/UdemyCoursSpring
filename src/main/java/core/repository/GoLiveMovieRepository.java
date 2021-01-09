package core.repository;

import core.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoLiveMovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void add (Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.gettitle() +";" +movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
