package Procesamiento_Cadenastexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Palabra = "";
        String Identi = "";
        String prefi = "";

        int Longitud = 0;


        System.out.println("------ ENTRADA DE DATOS -------");
        System.out.println("Dame la palabra:");
        Palabra = input.nextLine();
        System.out.println("Dame el prefijo: ");
        prefi = input.next();


        CadenaCaracteres usuario = new CadenaCaracteres(Palabra, "MODULO222", Longitud);

        System.out.println("------- SALIDA DE DATOS -------");
        System.out.println("Palabra: "+ usuario.getTextoActual());
        System.out.println("Identificador: "+ usuario.getIdentificador());
        System.out.println("Longitud del texto: " + usuario.getLongitud());
        System.out.println("Con prefijo: " + usuario.prefijo(prefi));
        System.out.println("Espacios en blanco: " + usuario.EspaciosBlancos());
    }
}


