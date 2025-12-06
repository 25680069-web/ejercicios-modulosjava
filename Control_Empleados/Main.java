package Control_Empleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PorcentajeAu;

        Empleado usuario = new Empleado(2131231, 1500, 16);

        System.out.println("CLAVE DEL EMPLEADO: " + usuario.getCEmpleado());
        System.out.println("SALARIO MENSUAL: " + "$" + usuario.getSMensual());
        System.out.println("PORCENTAJE DE RETENCIÓN DE IMPUESTOS: "+ usuario.getPorcentajeRI()+"%");

        System.out.println("\nSALARIO NETO: " + "$"+usuario.SalarioNeto());
        System.out.println("INGRESA EL PORCENTAJE DE AUMENTO DE SALARIO: ");
        PorcentajeAu = input.nextDouble();
        System.out.println("SALARIO CON AUMENTO: \n" +  "$" + usuario.AumentoSalario(PorcentajeAu));
    }
}
