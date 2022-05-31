package com.example.demo.student;

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
            Student jungsu = new Student(
                    1L,
                    "Jungsu",
                    "duwjdtn1@gmail.com",
                    LocalDate.of(1994, Month.SEPTEMBER, 12),
                    29
            );

            Student ian = new Student(
                    2L,
                    "ian",
                    "ian.yeo@gmail.com",
                    LocalDate.of(1994, Month.SEPTEMBER, 12),
                    29
            );

            repository.saveAll(
                    List.of(jungsu, ian)
            );
        };
    }
}
