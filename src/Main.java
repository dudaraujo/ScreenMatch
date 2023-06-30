// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "Harry Potter e o Enígima do Principe";
        myMovie.releaseName = 2016;
        myMovie.duration = 205;

        myMovie.DisplaysDataSheet();
        myMovie.Rates(4.5);
        myMovie.Rates(10);
        myMovie.Rates(8.9);

        System.out.println(myMovie.totalRating);
        System.out.println(myMovie.rating);
        System.out.println(myMovie.TakeMedia());

    }
}