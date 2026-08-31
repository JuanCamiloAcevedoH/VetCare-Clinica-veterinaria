package com.generation.vetcare.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/saludo")
    public String saludar() {
        return "Bienvenido a VetCare, el backend de la clínica veterinaria";
    }

    @GetMapping("/chao")
    public String despedida() {
        return "hasta la proxima";
    }
}