package ru.ruslan.spring.dz1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Dz1Application {

    public static void main(String[] args) {
        SpringApplication.run(Dz1Application.class, args);
    }

}
