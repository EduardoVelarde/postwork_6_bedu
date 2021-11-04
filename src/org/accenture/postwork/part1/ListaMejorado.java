package org.accenture.postwork.part1;

import java.util.Scanner;

public class ListaMejorado {
    AccionesLista tarea = new AccionesLista();
    ListaTareas lista = new ListaTareas("primera lista");
    public ListaMejorado() {
        System.out.println(" Inicializando menu ");
    }
    public void desplegar_menu(){
        System.out.println(" Lista de opciones: ");
        System.out.println("1.- Crear una nueva lista de tareas");
        System.out.println("2.- Ver lista de tareas");
        System.out.println("3.- Actualizar lista de tareas");
        System.out.println("4.- Eliminar lista de tareas");
        }
        public void elegir_opcion(){
            Scanner entrada = new Scanner(System.in);
            int opcion = entrada.nextInt();
            System.out.println(" Opción elegida: ");
            switch (opcion){
                case 1:
                    tarea.crearNuevaTarea(lista);
                    break;
                case 2:
                    tarea.verListaTarea();
                    break;
                case 3:
                    tarea.verTareasDeLista();
                    break;
                case 4:
                    tarea.actualizarLista();
                    break;
                case 5:
                    tarea.eliminarLista();
                    break;
                case 6:
                    System.out.println("Guardar");
                    break;
                default:
                    System.out.println("NO ha ingresado una opción valida");

            }
    }
}
