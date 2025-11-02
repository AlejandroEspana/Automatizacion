package com.anuncios.AutomatAununcios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuncios.AutomatAununcios.entities.Usuario;

@Repository
public interface UsuarioRepositories extends JpaRepository<Usuario, Integer>{
    
}
