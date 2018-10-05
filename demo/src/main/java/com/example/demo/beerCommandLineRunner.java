package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
public class beerCommandLineRunner implements CommandLineRunner {

    private final beerRepository repository;

    public beerCommandLineRunner(beerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception 
    {   
        Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                repository.save(new beer(name))
        );
        repository.findAll().forEach(System.out::println);
    }
}

