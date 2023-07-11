package br.com.alura.screenmatch.main;

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

        String apiAddress = ("https://www.omdbapi.com/?t=" + search + "&apikey=9d72df40");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiAddress))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
