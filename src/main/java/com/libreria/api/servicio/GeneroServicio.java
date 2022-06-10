package com.libreria.api.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.api.modelo.Genero;
import com.libreria.api.repositorio.GeneroRepositorio;

@Service
public class GeneroServicio {
    @Autowired
    private GeneroRepositorio generoRepositorio;

    public List<Genero> obtenerGeneros(){
        return (List<Genero>)generoRepositorio.findAll();
    }

}