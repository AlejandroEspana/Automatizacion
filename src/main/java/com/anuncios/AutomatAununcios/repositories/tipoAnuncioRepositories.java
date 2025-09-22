package com.anuncios.AutomatAununcios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuncios.AutomatAununcios.entities.TipoAnuncio;

@Repository
public interface tipoAnuncioRepositories extends JpaRepository<TipoAnuncio, Integer> {
    
}
