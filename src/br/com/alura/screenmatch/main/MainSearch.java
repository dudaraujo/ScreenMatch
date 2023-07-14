package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.ReleaseYearConversionException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);

        System.out.println("O que você quer assistir hoje?");
        var search = read.nextLine();

        try{
            String apiAddress = ("https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=9d72df40");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiAddress))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println(myTitleOmdb);


            Title myTitle = new Title(myTitleOmdb);
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Existe um argumento ilegal na URI");
        } catch (ReleaseYearConversionException e) {
            System.out.println(e.getMessage());
        }



    }
}
