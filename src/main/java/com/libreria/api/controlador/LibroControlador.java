package com.libreria.api.controlador;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.api.servicio.LibroServicio;
import com.libreria.api.modelo.Libro;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PATCH,RequestMethod.DELETE})
public class LibroControlador {

    @Autowired
    LibroServicio libroServicio;

    @GetMapping("/Libros")
    public List<Libro> obtenerLibros(){
        return libroServicio.obtenerLibros();
    }

    @PostMapping("/Libro")
    public Libro crearLibro(@RequestBody Libro libro){
        return libroServicio.crearLibro(libro);
    }
    
    @GetMapping("/Libro/{id}")
    public Optional<Libro> obtenerLibrosPorId(@PathVariable("id") Long id){
        return libroServicio.obtenerLibrosPorId(id);
    }
    @GetMapping("/Libros/buscar/titulo/{titulo}")
    public List<Libro> obtenerLibrosPorTitulo(@PathVariable("titulo") String titulo){
        return libroServicio.obtenerLibrosPorTitulo(titulo);
    }
    @GetMapping("/Libros/buscar/editorial/{editorial}")
    public List<Libro> obtenerLibrosPorEditorial(@PathVariable("editorial") int editorial){
        return libroServicio.obtenerLibrosPorEditorial(editorial);
    }
    @GetMapping("/Libros/buscar/genero/{genero}")
    public List<Libro> obtenerLibrosPorGenero(@PathVariable("genero") int genero){
        return libroServicio.obtenerLibrosPorGenero(genero);
    }
    @GetMapping("/Libros/buscar/autor/{autor}")
    public List<Libro> obtenerLibrosPorAutor(@PathVariable("autor") String autor){
        return libroServicio.obtenerLibrosPorAutor(autor);
    }
    @GetMapping("/Libros/buscar/idioma/{idioma}")
    public List<Libro> obtenerLibrosPorIdioma(@PathVariable("idioma") int idioma){
        return libroServicio.obtenerLibrosPorIdioma(idioma);
    }
    @GetMapping("/Libros/buscar/publicacion/{publicacion}")
    public List<Libro> obtenerLibrosPorPublicacion(@PathVariable("publicacion") Date publicacion){
        return libroServicio.obtenerLibrosPorPublicacion(publicacion);
    }
    @GetMapping("/Libros/buscar/edicion/{edicion}")
    public List<Libro> obtenerLibrosPorEdicion(@PathVariable("edicion") int edicion){
        return libroServicio.obtenerLibrosPorEdicion(edicion);
    }

    @PostMapping("/Libros")
    public List<Libro> crearLibros(@RequestBody List<Libro> libros){
        return libroServicio.crearLibros(libros);
    }

    @PatchMapping("/Libro/{id}")
    public Libro modificar(@PathVariable("id") Long id,@RequestBody Libro libro){
        return libroServicio.modificar(libro);
    }

    @DeleteMapping("/Libro/{id}")
    public boolean eliminarLibro(@PathVariable("id") Long id){
        return libroServicio.eliminarLibro(id);
    }

    @PostMapping("/Libros/Eliminar")
    public List<Long> eliminarLibros(@RequestBody List<Long> ids){
        return libroServicio.eliminarLibros(ids);
    }

}
