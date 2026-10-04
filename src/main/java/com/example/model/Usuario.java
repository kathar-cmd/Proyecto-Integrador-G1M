package com.example.model;

import java.time.LocalDateTime;

public class Usuario {
    
    private Long idusuario; // para que sea autogenerado por la BD
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private String direccion;
    private String rol; // 'admin', 'usuario', etc.

    // ===================
    // Constructor completo
    // ===================
    public Usuario(Long idusuario, String nombre, String apellido, String email, int telefono, String direccion, String rol) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol = rol;
    }

    // ===================
    // Constructor sin ID
    // (para insertar nuevos usuarios sin ID)
    // ===================
    public Usuario(String nombre, String apellido, String email, int telefono,
            String direccion, String rol, String estado, LocalDateTime fechaRegistro) {
        this(null, nombre, apellido, email, telefono, direccion, rol);
    }

    // ===================
    // Constructor vacío
    // ===================

    // ===================
    // Getters y setters
    // ===================
    public Long getId() {
        return idusuario;
    }

    public void setId(Long id) {
        this.idusuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + idusuario + ", nombre=" + nombre + ", email=" + email + ", rol=" + rol + "]";
    }
}
