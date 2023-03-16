package com.ccindor.challenge.Config;

import com.ccindor.challenge.Entity.Tareas;
import com.ccindor.challenge.Repository.TareasRepository;
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
                    5,
                    "Comprar mousepad para pegar mas balas en el valorant"
            );
            Tareas tarea2 = new Tareas(
                    LocalDate.of(2023, Month.JULY,29),
                    2,
                    "Caerle al mati para repasar springboot"
            );
            Tareas tarea3 = new Tareas(
                    LocalDate.of(2023, Month.MARCH ,16),
                    1,
                    "Comprarme algo para gular"
            );
            Tareas tarea4 = new Tareas(
                    LocalDate.of(2023, Month.MARCH,16),
                    4,
                    "Ir a tomar mates a lo de Zeme"
            );
            Tareas tarea5 = new Tareas(
                    LocalDate.of(2023, Month.MARCH,17),
                    3,
                    "Hacerme una riqui pajita"
            );
            repository.saveAll(
                    List.of(tarea1, tarea2, tarea3, tarea4, tarea5)
            );
        };
    }
}