package Sistema_Cuentas_Bancarias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int CuentaU;
        String TitulasN;
        double Saldo;
        int respuesta;
        int DR;

        System.out.println("Ingresa el número de cuenta:");
        CuentaU = input.nextInt();
        System.out.println("Ingresa el nombre del titular:");
        TitulasN = input.next();

        CuentaAhorros usuario = new CuentaAhorros(CuentaU, TitulasN, 500);

        System.out.println("¿Qué acción necesitas realizar?\n 1.Deposito\n 2.Retiro");
        respuesta = input.nextInt();

        if (respuesta == 1) {
            System.out.println("Tu saldo actual es de: $" + usuario.getSActual());
            System.out.println("Ingresa la cantidad a depositar: ");
            DR = input.nextInt();
            System.out.println("Saldo actualizado: $" + usuario.Deposito(DR));

        } else {
            System.out.println("Tu saldo actual es de: $" + usuario.getSActual());
            System.out.println("Ingresa la cantidad a retirar: ");
            DR = input.nextInt();
            System.out.println("Saldo actualizado: $" + usuario.Retiro(DR));
        }

    }
}
