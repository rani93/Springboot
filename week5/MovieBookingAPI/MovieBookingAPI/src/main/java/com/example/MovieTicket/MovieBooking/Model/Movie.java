package com.example.MovieTicket.MovieBooking.Model;

import java.util.ArrayList;
import java.util.List;


public class Movie {
   public String id;
   public String movieName;
   public String movieDirector;
   public long movieRating;
   public String movieLanguage;
   public List<String> writers = new ArrayList<>();
   public List<String> actors= new ArrayList<>();
   public List<String> genre= new ArrayList<>();
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getMovieName() {
    return movieName;
}
public void setMovieName(String movieName) {
    this.movieName = movieName;
}
public String getMovieDirector() {
    return movieDirector;
}
public void setMovieDirector(String movieDirector) {
    this.movieDirector = movieDirector;
}
public long getMovieRating() {
    return movieRating;
}
public void setMovieRating(long movieRating) {
    this.movieRating = movieRating;
}
public String getMovieLanguage() {
    return movieLanguage;
}
public void setMovieLanguage(String movieLanguage) {
    this.movieLanguage = movieLanguage;
}
public List<String> getWriters() {
    return writers;
}
public void setWriters(List<String> writers) {
    this.writers = writers;
}
public List<String> getActors() {
    return actors;
}
public void setActors(List<String> actors) {
    this.actors = actors;
}
public List<String> getGenre() {
    return genre;
}
public void setGenre(List<String> genre) {
    this.genre = genre;
}
public void createMovie() {
    // TODO Auto-generated method stub
    
    
}
public Movie(String id, String movieName, String movieDirector, long movieRating, String movieLanguage) {
    this.id = id;
    this.movieName = movieName;
    this.movieDirector = movieDirector;
    this.movieRating = movieRating;
    this.movieLanguage = movieLanguage;
}

}
