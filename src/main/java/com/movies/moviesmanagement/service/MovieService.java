package com.movies.moviesmanagement.service;

import com.movies.moviesmanagement.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);
    Movie getMovieById(Long id);
    Movie updateMovie(Movie movie);
    void deleteMovieById(Long id);
}
