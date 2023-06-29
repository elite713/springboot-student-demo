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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student natasha = new Student(
                    "Natasha",
                    "natasha.doctora@gmail.com",
                    LocalDate.of(2012, Month.JANUARY,5)
            );

            Student elian = new Student(
                    "Elian",
                    "elian.musisian@gmail.com",
                    LocalDate.of(2000, Month.JUNE, 7)
            );

            Student georgio = new Student(
                    "Georgio",
                    "georgio.ceo@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5)
            );

            Student jhoan = new Student(
                    "Jhoan",
                    "jhoan.teacher@gmail.com",
                    LocalDate.of(2000, Month.JUNE, 7)
            );

            repository.saveAll(
                    List.of(natasha, elian, georgio, jhoan)
            );

        };
    }
}
