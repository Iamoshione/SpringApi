package com.oshione.api.oshioneapi.model;


import jakarta.persistence.*;

@Entity
public class heroes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(unique=true)
    public String name;
    @Column(unique=true)
    public String alias;

}
