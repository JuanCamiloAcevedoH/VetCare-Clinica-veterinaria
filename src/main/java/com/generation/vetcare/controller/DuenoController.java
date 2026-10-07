package com.generation.vetcare.controller;


import com.generation.vetcare.model.Dueno;
import com.generation.vetcare.service.DuenoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/duenos")
public class DuenoController {

    private final DuenoService duenoService;

    public DuenoController(DuenoService duenoService) {
        this.duenoService = duenoService;
    }

    @GetMapping
    public List<Dueno> listar() {
        return duenoService.listarDuenos();
    }

    @PostMapping
    public ResponseEntity<Dueno> crear(@RequestBody Dueno dueno) {
        Dueno creado = duenoService.crearDueno(dueno);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }


}
