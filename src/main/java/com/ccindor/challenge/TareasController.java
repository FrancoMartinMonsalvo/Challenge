package com.ccindor.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
