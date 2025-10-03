package com.anuncios.AutomatAununcios.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDTO {
    @NotBlank(message = "El correo no puede estar vacio")
    private String correo;
    @NotBlank(message = "La contrasenia no puede estar vacia")
    private String contrasenia; 

}
