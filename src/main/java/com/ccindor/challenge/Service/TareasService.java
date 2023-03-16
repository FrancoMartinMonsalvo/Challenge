package com.ccindor.challenge.Service;

import com.ccindor.challenge.Entity.Tareas;
import com.ccindor.challenge.Repository.TareasRepository;
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
        return tareasRepository.findAllByOrderByPrioridadAsc();}

    public void addNewTask(Tareas tareas) {
        tareasRepository.save(tareas);
    }

    public Tareas getTareasById(Long id) {
      return  tareasRepository.findById(id).get();
    }

    public Tareas editTask(Long id, Tareas tarea) {
        if (tareasRepository.findById(id).isPresent()) {
            tarea.setId(id);
            return tareasRepository.save(tarea);
        }
        throw new IllegalStateException("Tarea no existe");
    }
}
