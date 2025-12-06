package Temperatura_Clima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int UTemp;
        String Unidad;
        String Fecha;

        System.out.println("Ingresa el valor de la temperatura: ");
        UTemp = input.nextInt();
        System.out.println("Ingresa la unidad: Celsius o Fahrenheit");
        Unidad = input.next();
        System.out.println("Ingresa la fecha de registro: (dd-mm-aaaa)");
        Fecha = input.next();

        Temperatura usuario = new Temperatura(UTemp, Unidad, Fecha);

        System.out.println("\nVALOR DE LA TEMPERATURA: " + usuario.getVTemp());
        System.out.println("UNIDAD DE LA TEMPERATURA: " + usuario.getUmedida());
        System.out.println("FECHA DE REGISTRO: " + usuario.getFechaR());
        System.out.println("\n CONVERSOR DE UNIDAD: ");
        usuario.Conversor();
        System.out.println("\nVALOR DE LA TEMPERATURA: " + usuario.getVTemp());
        System.out.println("UNIDAD DE LA TEMPERATURA: " + usuario.getUmedida());
        System.out.println("EVALUACIÓN DE LA TEMPERATURA: " + usuario.EvaluarTemp());
    }
}
