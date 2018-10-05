package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class beerController {
	private beerRepository repository;

    public beerController(beerRepository repository) 
    {
        this.repository = repository;
    }

    @GetMapping("/good-beers")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<beer> goodBeers() {
        return repository.findAll().stream().filter(this::isGreat).collect(Collectors.toList());
    }

    private boolean isGreat(beer beer1) 
    {
        return !beer1.getName().equals("Budweiser") &&
                !beer1.getName().equals("Coors Light") &&
                !beer1.getName().equals("PBR");
    }

}
