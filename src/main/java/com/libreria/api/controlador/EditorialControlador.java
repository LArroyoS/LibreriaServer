package com.libreria.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.api.servicio.EditorialServicio;
import com.libreria.api.modelo.Editorial;

@RestController
public class EditorialControlador {

    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/editorials")
    public List<Editorial> obtenerEditorials(){
        return editorialServicio.obtenerEditorials();
    }

}
