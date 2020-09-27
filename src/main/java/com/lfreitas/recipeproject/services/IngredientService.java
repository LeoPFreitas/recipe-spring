package com.lfreitas.recipeproject.services;

import com.lfreitas.recipeproject.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
