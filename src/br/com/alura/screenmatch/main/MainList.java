package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Movie fefeMovie = new Movie("Truque de Mestre", 2016);
        fefeMovie.Rates(9);
        Movie dudaMovie = new Movie("O Diabo veste Prada", 2016);
        dudaMovie.Rates(6);
        var myMovie = new Movie("Harry Potter e o Enígima do Principe", 2016);
        myMovie.Rates(10);
        Series mySeries = new Series("Sandman", 2022);

        ArrayList<Title> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(fefeMovie);
        movieList.add(dudaMovie);
        movieList.add(mySeries);

        for (Title item: movieList) {
            System.out.println(item.getName());
            if(item instanceof Movie movie) {
                System.out.println("Classificação " + movie.getClassification());
            }

        }

    }
}
