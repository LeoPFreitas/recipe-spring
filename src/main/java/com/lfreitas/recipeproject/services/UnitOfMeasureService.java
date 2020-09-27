package com.lfreitas.recipeproject.services;

import com.lfreitas.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
