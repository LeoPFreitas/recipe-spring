package com.lfreitas.recipeproject.repositories;

import com.lfreitas.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
