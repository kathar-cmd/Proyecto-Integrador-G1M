package com.example.model;

public class Usuario {
    private Long idUsuario; //PK
    private String nombre; //VARCHAR(70)
    private String email; //VARCHAR(50)
    private int telefono; // int
    private String rol; // VARCHAR(20)
    private Long idContacto; //Fk desde la tabla contacto

    public Usuario(){
    }

    public Usuario (Long idUsuario, String nombre, String email, int telefono, String rol, Long idContacto){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
        this.idContacto = idContacto;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getIdContacto() {
        return idContacto;
    }

}
