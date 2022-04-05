package com.nmscinemas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmscinemas.entities.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer>{

}
