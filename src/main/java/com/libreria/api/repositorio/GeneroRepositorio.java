package com.libreria.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.api.modelo.Genero;

@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Long>{
    
}
