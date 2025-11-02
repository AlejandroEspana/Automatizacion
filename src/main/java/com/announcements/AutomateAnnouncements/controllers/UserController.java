package com.anuncios.AutomatAununcios.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuncios.AutomatAununcios.dtos.UsuarioRequestDTO;
import com.anuncios.AutomatAununcios.dtos.UsuarioResponseDTO;
import com.anuncios.AutomatAununcios.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> crearUsuario(@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO){
        UsuarioResponseDTO nuevoUsuario = usuarioService.crearUsuario(usuarioRequestDTO);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> ObtenerUsuario(){
        List<UsuarioResponseDTO> usuario = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuario);
    }
    
}
