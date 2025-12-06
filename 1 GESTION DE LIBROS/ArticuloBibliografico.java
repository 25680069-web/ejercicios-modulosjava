package Gestion_De_Libros;

public class ArticuloBibliografico {
    private String Identificador;
    private String Autor;
    private String Estado;
    private int Publicacion;


    public ArticuloBibliografico(String Identificador, String Autor, String Estado, int Publicacion) {
        this.Autor = Autor;
        this.Identificador = Identificador;
        this.Estado = Estado;
        this.Publicacion = Publicacion;
    }

    public String getIdentificador() {
        return this.Identificador;
    }
    public String getAutor() {
        return this.Autor;
    }
    public String getEstado() {
        return this.Estado;
    }

    public void setIdentificador(String I) {
        this.Identificador = I;
    }
    public void setAutor(String A) {
        this.Autor = A;
    }
    public void setEstado(String E) {
        this.Estado = E;
    }
    public void setPublicacion(int P) {
        this.Publicacion = P;
    }

    public void ReservaArituculo() {
        if (this.Estado.equals("DISPONIBLE")) {
            this.Estado = "RESERVADO";
            System.out.println("El artículo " + this.Identificador + ", del autor " + this.Autor + ", ha sido reservado");
        } else {
            System.out.println("El artículo " + this.Identificador + ", del autor " + this.Autor + ", se encuentra reservado");
        }
    }

    public String OptimoPrestamo(int periodoActual) {
        String resultado = "";

        int tiempo = periodoActual - this.Publicacion;

        if (tiempo > 5) {
            resultado = "El artículo "+ this.Identificador + ", del autor " + this.Autor + ", es optimo para prestamo";
        } else {
            resultado = "El artículo "+ this.Identificador + ", del autor " + this.Autor + ", NO es optimo para prestamo";
        }

        return resultado;
    }

}







