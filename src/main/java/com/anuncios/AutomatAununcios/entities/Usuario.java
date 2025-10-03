package com.anuncios.AutomatAununcios.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String correo;
    private String contrasenia; 

    @OneToMany(mappedBy= "usuario", cascade = CascadeType.ALL)
    private List<RedesSociales> redesSociales;
}

