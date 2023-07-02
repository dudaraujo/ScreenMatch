package br.com.alura.screenmatch.models;

public class Title {

    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double rating;
    private int totalRating;
    private int duration;


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
}
