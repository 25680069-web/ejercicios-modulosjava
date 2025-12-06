package Geometria_Basica;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangulo usuario = new Rectangulo(25,10,0);
        double lado1;
        double lado2;

        System.out.println("El área del Rectangulo es de: " + usuario.CalcularArea());
        System.out.println("\n Ingresa un lado del Rectangulo:");
        lado1 = input.nextDouble();
        System.out.println("Ingresa el otro lado del Rectangulo:");
        lado2 = input.nextDouble();
        System.out.println("El perimetro del Rectángulo es de: "+ usuario.Perimetro(lado1,lado2));
    }
}
