package com.ccindor.challenge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@Configuration
public class TareasConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            TareasRepository repository){
        return args -> {
            Tareas tarea1 = new Tareas(
                    LocalDate.of( 2023, Month.JULY, 25 ),
                    1,
                    "Comprar mousepad para pegar mas balas en el valorant"
            );
            Tareas tarea2 = new Tareas(
                    LocalDate.of(2023, Month.JULY,29),
                    2,
                    "Caerle al mati para repasar springboot"
            );
            repository.saveAll(
                    List.of(tarea1, tarea2)
            );
        };
    }
}