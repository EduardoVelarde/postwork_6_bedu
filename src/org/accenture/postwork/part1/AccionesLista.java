package org.accenture.postwork.part1;

import java.util.ArrayList;
import java.util.List;

public class AccionesLista {

    private List<ListaTareas> listasTareas = new ArrayList<>();
        public void crearNuevaTarea(ListaTareas lista){
            listasTareas.add(lista);
            System.out.println("Nueva listatarea ha sido creada");
        }
        public void verListaTarea(){
            if (!validaExistenciaLista()) {
                return;
            }
            for (int i = 0; i < listasTareas.size(); i++) {
                System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
            }

        }
        public void verTareasDeLista(){
            validaExistenciaLista();
            System.out.println("Mostrando elementos de la lista");
        }
        public void actualizarLista(){
            validaExistenciaLista();
            System.out.println("La lista se ha actualizado");
        }
        public void eliminarLista(){
            validaExistenciaLista();
            System.out.println("La lista ha sido eliminado");
        }

    private boolean validaExistenciaLista() {
        if (listasTareas == null || listasTareas.isEmpty()) {
            System.out.println("Aún no se ha creado ninguna lista de tareas.");
            return false;
        }
        return true;
    }

}
