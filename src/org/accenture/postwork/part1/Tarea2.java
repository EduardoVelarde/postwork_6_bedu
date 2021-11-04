package org.accenture.postwork.part1;

import java.time.LocalDate;

public class Tarea2 {
    private String nombre;
    private final LocalDate fecha_de_creacion;
    private LocalDate fecha_de_expiracion;
    private boolean realizada;
    private LocalDate fecha_de_realizacion;

    public LocalDate getFecha_de_expiracion() {
        return fecha_de_expiracion;
    }

    public void setFecha_de_expiracion(LocalDate fecha_de_expiracion) {
        this.fecha_de_expiracion = fecha_de_expiracion;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public LocalDate getFecha_de_realizacion() {
        return fecha_de_realizacion;
    }

    public void setFecha_de_realizacion(LocalDate fecha_de_realizacion) {
        this.fecha_de_realizacion = fecha_de_realizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public Tarea2(String nombre){
        this.nombre=nombre;
    }

    {
        fecha_de_creacion=LocalDate.now();
    }

}
