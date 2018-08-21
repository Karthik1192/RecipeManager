package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.RecipeManager;

public interface RecipeManagerRepository extends CrudRepository<RecipeManager, Long> {

}
