package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private Series series;
    private int totalViews = 1000;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if(totalViews > 100){
            return 4;
        } else {
            return 2;
        }

    }
}
