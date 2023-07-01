import br.com.alura.screenmatch.models.Movie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Harry Potter e o Enígima do Principe") ;
        myMovie.setReleaseYear(2016);
        myMovie.setDuration(205);

        myMovie.DisplaysDataSheet();
        myMovie.Rates(4.5);
        myMovie.Rates(10);
        myMovie.Rates(8.9);

        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.TakeMedia());

    }
}