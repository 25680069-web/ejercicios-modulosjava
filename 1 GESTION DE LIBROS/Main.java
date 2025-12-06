package Gestion_De_Libros;

public class Main {
    public static void main(String[] args) {

        ArticuloBibliografico articulo = new ArticuloBibliografico("Articulo-01", "Chaeyoung","DISPONIBLE", 2003);

        int periodo = 2025;

        System.out.println("Reservación del libro");
        articulo.ReservaArituculo();
        System.out.println("\nConfirmación de reserva ");
        articulo.ReservaArituculo();
        System.out.println("\nEstado del libro para prestar: " + articulo.OptimoPrestamo(periodo));

    }
}
