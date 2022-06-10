package com.libreria.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.api.servicio.GeneroServicio;
import com.libreria.api.modelo.Genero;

@RestController
public class GeneroControlador {

    @Autowired
    private GeneroServicio generoServicio;

    @GetMapping("/generos")
    public List<Genero> obtenerGeneros(){
        return generoServicio.obtenerGeneros();
    }

}
