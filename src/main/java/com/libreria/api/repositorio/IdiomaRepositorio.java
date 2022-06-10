package com.libreria.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.api.modelo.Idioma;

@Repository
public interface IdiomaRepositorio extends JpaRepository<Idioma, Long>{

}
