package Gestion_Tareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String PrioridadU;
        String DescripcionU;

        System.out.println("INGRESA LA DESCRIPCIÓN DE LA TAREA: ");
        DescripcionU = input.next();
        System.out.println("INGRESA LA PRIORIDAD: (ALTA/ MEDIA/ BAJA");
        PrioridadU = input.next();

        TareaPendiente usuario = new TareaPendiente(DescripcionU, PrioridadU, "NO COMPLETADA");


        System.out.println("DESCRPCIÓN DE LA TAREA: " + usuario.getDescripcionT());
        System.out.println("PRIORIDAD DE LA TAREA: " +usuario.getPrioridad());

        System.out.println("\n¿Deseas marcar como COMPLETADA la tarea? SI/NO");
        String respuesta = input.next();

        if (respuesta.equals("SI")) {
            usuario.EstadoCompleto();
        }

        System.out.println("ESTADO DE LA TAREA: " + usuario.getIndicador());
        System.out.println("ESTADO DE URGENCIA DE LA TAREA: " + usuario.EstadoUrgente());
    }
}
