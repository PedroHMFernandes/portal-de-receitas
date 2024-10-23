package com.mackenzie.receitas.portal_receitas.config;

import com.mackenzie.receitas.portal_receitas.entities.User;
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

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria", "maria@gmail.com", "9999999", "12345");
        User u2 = new User(null, "Jorge", "jorge@gmail.com", "1111111", "12345");
        User u3 = new User(null, "Robirso", "robirso@gmail.com", "2222222", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
