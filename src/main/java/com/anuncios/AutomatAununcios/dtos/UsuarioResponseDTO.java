package com.anuncios.AutomatAununcios.dtos;

import lombok.Data;

@Data
public class UsuarioResponseDTO {
    private Integer id;
    private String correo;
    private String contrasenia;
}
