package org.accenture.postwork.part1;

import java.util.Scanner;

public class ListaMejorado {
    AccionesLista tarea = new AccionesLista();
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
                    tarea.crearNuevaTarea();
                    break;
                case 2:
                    tarea.mostrarLista();
                    break;
                case 3:
                    tarea.actualizarLista();
                    break;
                case 4:
                    tarea.eliminarLista();
                    break;
                default:
                    System.out.println("NO ha ingresado una opción valida");

            }
    }
}
