package com.example.MovieTicket.MovieBooking.service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInterface {

    public List<Movie> getAllMovies();
    public void addMovie(Movie movie);
    public Movie getMovieById(Integer id);
    public void deleteMovieById(Integer id);
    public void updateMovieData(Movie movie);

}
