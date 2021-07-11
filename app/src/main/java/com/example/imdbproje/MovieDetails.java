package com.example.imdbproje;

import org.json.JSONException;
import org.json.JSONObject;

public class MovieDetails {
    public String movieName,movieYear,genre,director,writer,actors,plot,language,imdbRating,posterUri;

    public void mapJson(String jsonData) throws JSONException {
        JSONObject movieData = new JSONObject(jsonData);
        movieName = "Film Adı: " + movieData.getString("Title");
        movieYear = "Yıl: " + movieData.getString("Year");
        genre = "Film Türü: " + movieData.getString("Genre");
        director = "Yönetmen: " + movieData.getString("Director");
        writer = "Yazar:" + movieData.getString("Writer");
        actors = "Oyuncular: " + movieData.getString("Actors");
        plot = "Konu: " + movieData.getString("Plot");
        language = "Dil: " + movieData.getString("Language");
        imdbRating = "IMDB Puanı: " + movieData.getString("imdbRating");
        posterUri=movieData.getString("Poster");
    }
}