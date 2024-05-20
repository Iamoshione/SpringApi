package com.oshione.api.oshioneapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

@RestController
public class OshioneApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OshioneApiApplication.class, args);
    }

}
