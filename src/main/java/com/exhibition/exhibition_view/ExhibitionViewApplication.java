package com.exhibition.exhibition_view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ExhibitionViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExhibitionViewApplication.class, args);
    }

}
