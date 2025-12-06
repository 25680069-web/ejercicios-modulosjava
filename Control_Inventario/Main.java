package Control_Inventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Producto carga = new Producto("R-001",500,1200);

        int stockUsuario;

        System.out.println("El stock actual es de: " + carga.getStock());
        System.out.println("\nIngresa la cantidad a agregar al stock");
        stockUsuario = input.nextInt();

        System.out.println("El stock actual es de: " + carga.IncrementoStock(stockUsuario));

        System.out.println("\nEl valor total del stock es de: " + carga.StockTotal());
    }
}
