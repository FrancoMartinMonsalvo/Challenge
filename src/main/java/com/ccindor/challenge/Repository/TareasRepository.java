package com.ccindor.challenge.Repository;

import com.ccindor.challenge.Entity.Tareas;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareasRepository extends JpaRepository<Tareas, Long> {

    List<Tareas> findAllByOrderByPrioridadAsc();
}


