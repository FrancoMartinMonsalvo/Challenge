package com.ccindor.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareasService {


    private final TareasRepository tareasRepository;

    @Autowired
    public TareasService(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }
    public List<Tareas> getTareas() {
        return tareasRepository.findAll();}

}
