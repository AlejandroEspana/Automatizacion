package com.anuncios.AutomatAununcios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuncios.AutomatAununcios.entities.RedesSociales;

@Repository
public interface RedesSocialesRepositories extends JpaRepository<RedesSociales, Integer>{
    
}
