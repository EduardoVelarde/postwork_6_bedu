package org.accenture.postwork.part1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private final LocalDate fechaCreacion;
    private final List<Tarea2> tareas = new ArrayList<>();
    public ListaTareas(String nombre) {

        this.nombre = nombre;
    }
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
    public void agregaTarea(Tarea2 tarea){
        tareas.add(tarea);
    }

    public String mostrarLista(){
        String valores="";
        for(Tarea2 t : tareas){
            valores= t.getNombre();
        }
        return valores;
    }
    public Tarea2 eliminaTarea(int indice){
        if(indice > tareas.size()){
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }

        return tareas.remove(indice);
    }
    public List<Tarea2> getTareas() {
        return tareas;
    }

    public int numeroTareas(){
        return tareas.size();
    }

}
