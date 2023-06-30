import java.sql.SQLOutput;

public class Movie {
    String title;
    int releaseName;
    boolean includedPlan;
    double rating;
    int totalRating;
    int duration;

    void DisplaysDataSheet() {
        System.out.println("Nome do filme: " + title);
        System.out.println("Ano de lançamento: " + releaseName);
    }

    void Rates(double rate) {
        rating += rate;
        totalRating ++;
    }

    double TakeMedia() {
        return rating / totalRating;
    }

}

