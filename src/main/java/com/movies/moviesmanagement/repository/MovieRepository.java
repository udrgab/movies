package com.movies.moviesmanagement.repository;

import com.movies.moviesmanagement.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
