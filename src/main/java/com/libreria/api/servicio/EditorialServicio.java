package com.libreria.api.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.api.modelo.Editorial;
import com.libreria.api.repositorio.EditorialRepositorio;

@Service
public class EditorialServicio {
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    public List<Editorial> obtenerEditorials(){
        return (List<Editorial>)editorialRepositorio.findAll();
    }

}
