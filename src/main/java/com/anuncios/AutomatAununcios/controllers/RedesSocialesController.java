package com.anuncios.AutomatAununcios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/redes")
public class RedesSocialesController {
    @GetMapping("/redes")
    public String redes(){
        return "redes";
    }
}
