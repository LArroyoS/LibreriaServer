package com.libreria.api.modelo;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String titulo;
    private String editorial;
    private int genero;
    private String autor;
    private int idioma;
    private Date publicacion;
    private int edicion;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getGenero() {
        return genero;
    }
    public void setGenero(int genero) {
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIdioma() {
        return idioma;
    }
    public void setIdioma(int idioma) {
        this.idioma = idioma;
    }
    public Date getPublicacion() {
        return publicacion;
    }
    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }
    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

}
