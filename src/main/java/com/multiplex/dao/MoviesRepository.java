package com.multiplex.dao;

import org.springframework.data.repository.CrudRepository;

import com.multiplex.entity.Movies;

public interface MoviesRepository extends CrudRepository<Movies, Integer> {

}