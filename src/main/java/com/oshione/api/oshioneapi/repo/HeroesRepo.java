package com.oshione.api.oshioneapi.repo;


import com.oshione.api.oshioneapi.model.heroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HeroesRepo extends JpaRepository <heroes, Integer> {

}
