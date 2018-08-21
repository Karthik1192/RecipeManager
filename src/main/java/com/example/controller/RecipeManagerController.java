package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.RecipeManager;
import com.example.service.RecipeManagerService;

@Controller
@RequestMapping(value="/recipeManager")
public class RecipeManagerController {

 @Autowired
 RecipeManagerService recipeManagerService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("recipemanager_list");
  List<RecipeManager> recipeManagerList = recipeManagerService.getAllRecipeManager();
  model.addObject("recipeManagerList", recipeManagerList);
  
  return model;
 }
 
 @RequestMapping(value="/addRecipeManager/", method=RequestMethod.GET)
 public ModelAndView addRecipeManager() {
  ModelAndView model = new ModelAndView();
  
  RecipeManager recipeManager = new RecipeManager();
  model.addObject("recipeManagerForm", recipeManager);
  model.setViewName("recipemanager_form");
  
  return model;
 }
 
 @RequestMapping(value="/updateRecipeManager/{id}", method=RequestMethod.GET)
 public ModelAndView editRecipeManager(@PathVariable long id) {
  ModelAndView model = new ModelAndView();
  
  RecipeManager recipeManager = recipeManagerService.getRecipeManagerById(id);
  model.addObject("recipeManagerForm", recipeManager);
  model.setViewName("recipemanager_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveRecipeManager", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("recipeManagerForm") RecipeManager recipeManager) {
	 recipeManagerService.saveOrUpdate(recipeManager);
  
  return new ModelAndView("redirect:/recipeManager/list");
 }
 
}
