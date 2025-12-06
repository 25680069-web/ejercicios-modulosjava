package Sistema_Reserva_Avion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int respuesta;

        Vuelo usuario = new Vuelo(2455,55,55);

        System.out.println("CÓDIGO DE REFERENCIA DEL VUELO: "+ usuario.getCodigoV());
        System.out.println("CAPACIDAD MÁXIMA: " + usuario.getCapacidadM());
        System.out.println("ASIENTOS OCUPADOS: " + usuario.getNumAsientos());
        System.out.println("\n¿Deseas reservar un asiento? 1. SI  / 2. NO");
        respuesta = input.nextInt();

        if (respuesta == 1) {
            usuario.Reserva();
        }

        System.out.println("PORCENTAJE DE OCUPACIÓN: " + usuario.PorcentajeOcupacion() + "%");
    }
}
