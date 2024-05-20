package com.oshione.api.oshioneapi.controller;


import com.oshione.api.oshioneapi.model.heroes;
import com.oshione.api.oshioneapi.repo.HeroesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroesControllers {

      @Autowired
    public HeroesRepo heroesRepo;

    @GetMapping(value = "/")
    public String hero(){
        return "Heroes";
    }

    @GetMapping(value = "/heroes")
    public List<heroes> GetHeroes(){
        return heroesRepo.findAll();
    }

}
