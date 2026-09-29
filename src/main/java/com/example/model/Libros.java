package com.example.model;

public class Libros {
    private Long id;
    private String nombre;
    private String genero;
    private String seccion;
    
    public Libros(Long id, String nombre, String genero, String seccion) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.seccion = seccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
}
