package com.example.model;

import java.time.LocalDate;

public class Prestamo{
    private Long idPrestamo; // PK
    private Long idUsuario; // FK que relaciona a la tabla usuario
    private Long idContacto; // FK que relaciona a la tabla contacto
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private int cantidadLibros; 

    public Prestamo(){
    }

    public Prestamo(Long idPrestamo, Long idUsuario, Long idContacto, LocalDate fechaPrestamo, LocalDate fechaEntrega, int cantidadLibros){
        this.idPrestamo = idPrestamo;
        this.idUsuario = idPrestamo;
        this.idContacto = idContacto;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.cantidadLibros = cantidadLibros;
    }

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdContacto() {
        return idContacto;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    
}
