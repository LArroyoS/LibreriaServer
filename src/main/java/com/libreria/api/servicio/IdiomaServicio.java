package com.libreria.api.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.api.modelo.Idioma;
import com.libreria.api.repositorio.IdiomaRepositorio;

@Service
public class IdiomaServicio {
    @Autowired
    private IdiomaRepositorio idiomaRepositorio;

    public List<Idioma> obtenerIdiomas(){
        return (List<Idioma>)idiomaRepositorio.findAll();
    }

}
