package com.ccindor.challenge;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public LocalDate fecha;
    public Integer prioridad;
    public String descripcion;

    public Tareas(LocalDate fecha, Integer prioridad, String descripcion) {
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                "fecha=" + fecha +
                ", prioridad=" + prioridad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
