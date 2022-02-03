package com.movies.moviesmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_title", nullable = false)
    private String title;

    @Column(name = "movie_release_year")
    private int releaseYear;

    @Column(name = "movie_rating")
    private double imdbRating;

    @Column(name = "movie_director")
    private String director;

    public Movie() {
    }

    public Movie(String title, int releaseYear, double imdbRating, String director) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.imdbRating = imdbRating;
        this.director = director;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
