package com.mackenzie.receitas.portal_receitas.controllers;

import com.mackenzie.receitas.portal_receitas.entities.Recipe;
import com.mackenzie.receitas.portal_receitas.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeController {

    private final RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    // READ
    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getAll() {
        List<Recipe> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/recipes/{id}")
    public ResponseEntity<Recipe> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

}
