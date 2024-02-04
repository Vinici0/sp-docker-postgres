package com.example.monglo;

import com.example.monglo.RestApi.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

    @SpringBootApplication
public class MongloApplication implements CommandLineRunner {

    @Autowired
    @Lazy
    private Rest rest;

    public static void main(String[] args) {
        SpringApplication.run(MongloApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    public void run(String... args) throws Exception {
         rest.consumeApiAndMapToModel();
    }
}
