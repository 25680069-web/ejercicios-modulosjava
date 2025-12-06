package Geometria_Basica;

public class Rectangulo {
    private double Altura;
    private double Base;
    private double Identificacion;

    public Rectangulo (double A, double B, double I) {
        this.Altura = A;
        this.Base = B;
        this.Identificacion = I;
    }

    public double getAltura() {
        return Altura;
    }
    public double getBase() {
        return Base;
    }
    public double getIdentificacion() {
        return Identificacion;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
    public void setBase(double base) {
        Base = base;
    }
    public void setIdentificacion(double identificacion) {
        Identificacion = identificacion;
    }

    // COMPORTAMIENTOS

    public double CalcularArea () {
        double resultado;
        resultado = (this.Altura*this.Base)/2;
        return resultado;
    }

    public double Perimetro (double a, double c) {
        double resultado;

        resultado = a+this.Base+c;
        return resultado;
    }
}
