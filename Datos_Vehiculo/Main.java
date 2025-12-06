package Datos_Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int YearU;

        Automovil usuario = new Automovil("BMW", 1999, 100 );

        System.out.println("Ingresa el año actual: ");
        YearU = input.nextInt();
        System.out.println("ENCENDIDO DEL VEHÍCULO: " + usuario.Encendido());
        System.out.println("\nANTIGUEDAD DEL VEHÍCULO: " + usuario.Antiguedad(YearU));
        System.out.println("\nAÑO DE FABRICACIÓN: " + usuario.getYearF());
        System.out.println("\nVELOCIDAD MÁXIMA : " + usuario.getVelocidadM() + "km/h");
    }
}
