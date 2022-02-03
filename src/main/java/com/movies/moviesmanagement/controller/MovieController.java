package com.movies.moviesmanagement.controller;

import com.movies.moviesmanagement.entity.Movie;
import com.movies.moviesmanagement.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String listOfMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "movies";
    }

    @GetMapping("/movies/new")
    public String createMovie(Model model) {
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "create_movie";
    }

    @PostMapping("/movies")
    public String saveMovie(@ModelAttribute("movie") Movie movie) {
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/movies/edit/{id}")
    public String editMovie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        return "edit_movie";
    }

    @PostMapping("/movies/{id}")
    public String updateMovie(@PathVariable Long id, @ModelAttribute("movie") Movie movie, Model model) {
        Movie existingMovie = movieService.getMovieById(id);
        existingMovie.setId(movie.getId());
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setReleaseYear(movie.getReleaseYear());
        existingMovie.setImdbRating(movie.getImdbRating());
        existingMovie.setDirector(movie.getDirector());
        movieService.updateMovie(existingMovie);
        return "redirect:/movies";
    }

    @GetMapping("/movies/{id}")
    public String deleteMovie(@PathVariable Long id){
        movieService.deleteMovieById(id);
        return "redirect:/movies";
    }
}
