package com.anuncios.AutomatAununcios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tipoAnuncio")
public class TipoAnuncioController {
    @GetMapping("/tipo")
    public String tipoAnuncio(){
        return "sapoPerro";

    }
    
}
