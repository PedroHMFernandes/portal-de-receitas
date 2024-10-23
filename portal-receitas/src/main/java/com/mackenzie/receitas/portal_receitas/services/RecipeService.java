package com.mackenzie.receitas.portal_receitas.services;

import com.mackenzie.receitas.portal_receitas.entities.Recipe;
import com.mackenzie.receitas.portal_receitas.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {


    private final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    public List<Recipe> findAll() {
        return repository.findAll();
    }

    public Recipe findById(Long id) {
        Optional<Recipe> obj = repository.findById(id);
        return obj.get();
    }
}
