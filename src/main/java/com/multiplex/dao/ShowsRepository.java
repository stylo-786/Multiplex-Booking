package com.multiplex.dao;

import org.springframework.data.repository.CrudRepository;

import com.multiplex.entity.Shows;

public interface ShowsRepository extends CrudRepository<Shows, Integer> {

}