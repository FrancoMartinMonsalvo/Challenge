package com.ccindor.challenge.repository;

import com.ccindor.challenge.entity.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareasRepository extends JpaRepository<Tareas, Long> {

    List<Tareas> findAllByOrderByPrioridadAsc();
}


