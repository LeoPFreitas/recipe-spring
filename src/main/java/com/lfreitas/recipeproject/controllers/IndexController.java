package com.lfreitas.recipeproject.controllers;

import com.lfreitas.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }



    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndexPage(Model model) {
        log.debug("getting index page");

        model.addAttribute("recipes", recipeService.getRecipe());

        return "index";
    }

}
