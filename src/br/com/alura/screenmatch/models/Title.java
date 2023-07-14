package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exception.ReleaseYearConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    //@SerializedName("Title")
    private String name;

    private int releaseYear;
    private boolean includedPlan;
    private double rating;
    private int totalRating;
    private int duration;

    public Title(String name, int releaseYear) {
        this.setName(name);
        this.setReleaseYear(releaseYear);
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if(myTitleOmdb.year().length() > 4) {
            throw new ReleaseYearConversionException("Ano contém mais de 4 caracteres");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.duration = Integer.valueOf(myTitleOmdb.runtime().substring(0, 3));
    }


    public String getName() {
        return name;
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


    public void setName(String name) {
        this.name = name;
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
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void Rates(double rate) {
        rating += rate;
        totalRating ++;
    }

    public double TakeMedia() {
        return rating / totalRating;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", ano de lançamento: " + releaseYear + ", duração: " + duration;
    }
}

