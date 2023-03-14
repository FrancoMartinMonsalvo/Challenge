package com.ccindor.challenge.Controller;

import com.ccindor.challenge.Entity.Tareas;
import com.ccindor.challenge.Service.TareasService;
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
    @PostMapping("nueva")
    public void registerNewTask(@RequestBody Tareas tareas){
        tareasService.addNewTask(tareas);
    }
}
