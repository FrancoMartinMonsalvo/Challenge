package com.ccindor.challenge.controller;

import com.ccindor.challenge.entity.Tareas;
import com.ccindor.challenge.service.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path ="/tareas")
public class TareasController {

    @Autowired
    private TareasService tareasService;

    @GetMapping("/")
    public List<Tareas> getTareas() {
        return tareasService.getTareas();
    }

    @PostMapping("/")
    public void registerNewTask(@RequestBody Tareas tareas) {
        tareasService.addNewTask(tareas);
    }

    @GetMapping("/{id}")
    public Tareas getTareasById(@PathVariable Long id) {
        return tareasService.getTareasById(id);
    }

    @PutMapping("/{id}")
    public Tareas editTaskById(@PathVariable Long id, @RequestBody Tareas tarea) {
        return tareasService.editTask(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id) {
       tareasService.deleteTaskById(id);

    }

}
