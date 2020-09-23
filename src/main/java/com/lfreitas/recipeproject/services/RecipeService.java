package com.lfreitas.recipeproject.services;

import com.lfreitas.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();

    Recipe findById(Long l);
}
