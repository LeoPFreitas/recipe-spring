package com.lfreitas.recipeproject.repositories;

import com.lfreitas.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
