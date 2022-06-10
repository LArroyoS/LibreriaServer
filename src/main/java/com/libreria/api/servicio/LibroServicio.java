package com.libreria.api.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.api.modelo.Libro;
import com.libreria.api.repositorio.LibroRepositorio;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<Libro> obtenerLibros(){
        return (List<Libro>)libroRepositorio.findAll();
    }

    public List<Libro> obtenerLibrosPorTitulo(String titulo){
        return (List<Libro>)libroRepositorio.findByTitulo(titulo);
    }
    public List<Libro> obtenerLibrosPorEditorial(int editorial){
        return (List<Libro>)libroRepositorio.findByEditorial(editorial);
    }
    public List<Libro> obtenerLibrosPorGenero(int genero){
        return (List<Libro>)libroRepositorio.findByGenero(genero);
    }
    public List<Libro> obtenerLibrosPorAutor(String autor){
        return (List<Libro>)libroRepositorio.findByAutor(autor);
    }
    public List<Libro> obtenerLibrosPorIdioma(int idioma){
        return (List<Libro>)libroRepositorio.findByIdioma(idioma);
    }
    public List<Libro> obtenerLibrosPorPublicacion(Date publicacion){
        return (List<Libro>)libroRepositorio.findByPublicacion(publicacion);
    }
    public List<Libro> obtenerLibrosPorEdicion(int edicion){
        return (List<Libro>)libroRepositorio.findByEdicion(edicion);
    }

    public List<Libro> crearLibros(List<Libro> libros){
        List<Libro> guardarTodo = new ArrayList<Libro>(); 
        Libro aux = null;
        for (Libro libro : libros) {
            aux = crearLibro(libro);
            if(aux!=null){
                guardarTodo.add(aux);
            }
        }
        return guardarTodo.isEmpty()? null:guardarTodo;
    }

    public Libro crearLibro(Libro libro){
        Libro buscar;
        buscar = libroRepositorio.findById(libro.getId()).orElse(null);
        if(buscar==null){
            return libroRepositorio.save(libro);
        }else{
            return null;
        }

    }

    public Libro modificar(Libro libro){
        Libro buscar;
        buscar = libroRepositorio.findById(libro.getId()).orElse(null);
        if(buscar!=null){
            return libroRepositorio.save(libro);
        }else{
            return buscar;
        }
    }

    public boolean eliminarLibro(Long id){
        try{
            libroRepositorio.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean eliminarLibros(List<Long> ids){
        boolean completado = true;
        for (Long id : ids) {
            completado = (eliminarLibro(id)==false)? false: completado;
        }
        return completado;
    }

}
