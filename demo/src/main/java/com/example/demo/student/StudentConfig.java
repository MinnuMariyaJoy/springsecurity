package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration //used ton classes which contain bean
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args ->{

            Student mariam=new Student(
                    "Minnu",
                    "minnu1678@gmail.com",
                    LocalDate.of(1995,Month.JANUARY,31)

            );

            Student alex=new Student(
                    "Alex",
                    "alex678@gmail.com",
                    LocalDate.of(2004,Month.MARCH,31)

            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }


}




