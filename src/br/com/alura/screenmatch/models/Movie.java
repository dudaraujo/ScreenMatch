package br.com.alura.screenmatch.models;

import java.sql.SQLOutput;

public class Movie {
    private String title;
    private int releaseYear;
    private boolean includedPlan;
    private double rating;
    private int totalRating;
    private int duration;


    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public int getDuration() {
        return duration;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public void DisplaysDataSheet() {
        System.out.println("Nome do filme: " + title);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void Rates(double rate) {
        rating += rate;
        totalRating ++;
    }

    public double TakeMedia() {
        return rating / totalRating;
    }

}

