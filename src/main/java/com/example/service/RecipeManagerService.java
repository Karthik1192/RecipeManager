package com.example.service;

	import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.*;

	@Service
	public interface RecipeManagerService {

	 public List<RecipeManager> getAllRecipeManager();
	 
	 public RecipeManager getRecipeManagerById(long id);
	 
	 public void saveOrUpdate(RecipeManager recipeManager);
	 
	 public void deleteRecipeManager(long id);
	}

