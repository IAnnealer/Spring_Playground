package com.example.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ian = new Student(
                    1L,
                    "ian",
                    "duwjdtn1@gmail.com",
                    LocalDate.of(1994, Month.SEPTEMBER, 12)
                    );

            Student alex = new Student(
                    1L,
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 12)
                    );

            repository.saveAll(
                    List.of(ian, alex)
            );
        };
    }
}
