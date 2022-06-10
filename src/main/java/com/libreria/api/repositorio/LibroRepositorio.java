package com.libreria.api.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.api.modelo.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long>{
    public abstract List<Libro> findByTitulo(String titulo);
    public abstract List<Libro> findByEditorial(int editorial);
    public abstract List<Libro> findByGenero(int genero);
    public abstract List<Libro> findByAutor(String autor);
    public abstract List<Libro> findByIdioma(int idioma);
    public abstract List<Libro> findByPublicacion(Date publicacion);
    public abstract List<Libro> findByEdicion(int edicion);
}
