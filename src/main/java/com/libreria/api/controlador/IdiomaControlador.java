package com.libreria.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.api.servicio.IdiomaServicio;
import com.libreria.api.modelo.Idioma;

@RestController
public class IdiomaControlador {

    @Autowired
    private IdiomaServicio idiomaServicio;

    @GetMapping("/idiomas")
    public List<Idioma> obtenerIdiomas(){
        return idiomaServicio.obtenerIdiomas();
    }

}
