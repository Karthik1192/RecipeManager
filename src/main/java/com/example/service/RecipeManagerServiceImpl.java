package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.RecipeManager;
import com.example.repository.RecipeManagerRepository;

@Service
@Transactional
public class RecipeManagerServiceImpl implements RecipeManagerService {
 
 @Autowired
 RecipeManagerRepository recipeManagerRepository;

 @Override
 public List<RecipeManager> getAllRecipeManager() {
  return (List<RecipeManager>) recipeManagerRepository.findAll();
 }

 @Override
 public RecipeManager getRecipeManagerById(long id) {
  return recipeManagerRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(RecipeManager recipeManager) {
	 recipeManagerRepository.save(recipeManager);
 }

 //Didn't use this option, but possible here.
 @Override
 public void deleteRecipeManager(long id) {
	 recipeManagerRepository.deleteById(id);
 }

}
