package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    private final StudentRepository repository;

    public studentConfig(StudentRepository repository) {
        this.repository = repository;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args->{
            Student dhana = new Student(
                  "Dhana",
                    "dhanalakshmi@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER,1)

            );
            Student lakshmi = new Student(
                    "lakshmi",
                    "dhanalakshmi@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER,1)

            );

            repository.saveAll(
                    List.of(dhana,lakshmi)
            );
        };
    }
}
