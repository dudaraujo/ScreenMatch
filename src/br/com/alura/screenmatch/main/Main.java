package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.Recommendation;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Harry Potter e o Enígima do Principe", 2016);
        myMovie.setDuration(205);

        Movie dudaMovie = new Movie("O Diabo veste Prada", 2016);
        dudaMovie.setDuration(205);

        Movie fefeMovie = new Movie("Truque de Mestre", 2016);
        fefeMovie.setDuration(205);

        myMovie.DisplaysDataSheet();
        myMovie.Rates(4.5);
        myMovie.Rates(10);
        myMovie.Rates(8.9);

        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.TakeMedia());

        Series mySeries = new Series("Sandman", 2022);
        mySeries.setSeasons(2);
        mySeries.setEpisodesPerSeason(11);
        mySeries.setMinutesPerEpisode(50);
        System.out.println("Duração em minutos para maratonar: " + mySeries.getDuration());

        TimeCalculator calculator = new TimeCalculator();
        calculator.Includes(myMovie);
        calculator.Includes(mySeries);
        calculator.getTotalTime();
        System.out.println(calculator.getTotalTime());

        Episode myepisode = new Episode();

        Recommendation recommendation = new Recommendation();
        recommendation.Filters(myMovie);
        recommendation.Filters(myepisode);


        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(fefeMovie);
        movieList.add(dudaMovie);
        System.out.println("Tamanho da Lista: " + movieList.size());
        System.out.println("Primeiro filme: " + movieList.get(0));
        System.out.println(movieList);


    }
}