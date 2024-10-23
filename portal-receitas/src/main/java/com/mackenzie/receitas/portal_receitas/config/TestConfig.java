package com.mackenzie.receitas.portal_receitas.config;

import com.mackenzie.receitas.portal_receitas.entities.Category;
import com.mackenzie.receitas.portal_receitas.entities.Recipe;
import com.mackenzie.receitas.portal_receitas.entities.User;
import com.mackenzie.receitas.portal_receitas.repositories.CategoryRepository;
import com.mackenzie.receitas.portal_receitas.repositories.RecipeRepository;
import com.mackenzie.receitas.portal_receitas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria", "maria@gmail.com", "12345");
        User u2 = new User(null, "Jorge", "jorge@gmail.com", "12345");
        User u3 = new User(null, "Robirso", "robirso@gmail.com", "12345");

        Category cat1 = new Category(null, "Aves");
        Category cat2 = new Category(null, "Molhos");

        Recipe r1 = new Recipe(null, "Frango com Curry", "imageLink",
                "blablabla", 40, 4, cat2, u2);

        Recipe r2 = new Recipe(null, "Molho pesto", "imageLink",
                "bla", 15, 2, cat1, u3);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        recipeRepository.saveAll(Arrays.asList(r1, r2));
    }
}
