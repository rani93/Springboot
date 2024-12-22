package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;


import com.example.MovieTicket.MovieBooking.Model.Movie;

public class MovieService implements MovieServiceInterface {
    public List<Movie> list = new ArrayList<>();
    public Map<Integer ,Movie> MovieList = new HashMap<>();
    
    @Override
    public void addMovie(Movie movie) {
        
        if(ObjectUtils.isEmpty(MovieList.get(movie.getId()))){
            
        }
    }
    @Override
    public void deleteMovieById(Integer id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public List<Movie> getAllMovies() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Movie getMovieById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void updateMovieData(Movie movie) {
        // TODO Auto-generated method stub
        
    }

}
