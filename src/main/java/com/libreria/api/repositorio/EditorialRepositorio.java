package com.libreria.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.api.modelo.Editorial;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, Long>{

}
