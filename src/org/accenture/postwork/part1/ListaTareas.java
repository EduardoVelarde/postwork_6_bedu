package org.accenture.postwork.part1;

import java.time.LocalDate;

public class ListaTareas {
    private String nombre;
    private final LocalDate fechaCreacion;
    
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTareas(String nombre) {
        this.nombre = nombre;
    }

}
