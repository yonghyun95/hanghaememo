package com.example.hanghaememo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Embeddable;

@EnableJpaAuditing
@SpringBootApplication
public class HanghaememoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanghaememoApplication.class, args);
    }

}
