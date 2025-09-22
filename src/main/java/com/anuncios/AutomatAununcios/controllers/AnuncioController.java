package com.anuncios.AutomatAununcios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Anuncios")
public class AnuncioController {
    @GetMapping("/anuncios")
    public String decirHola(){
        return "anuncios";
    }
}
