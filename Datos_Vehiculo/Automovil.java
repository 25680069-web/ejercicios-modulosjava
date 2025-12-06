package Datos_Vehiculo;

public class Automovil {
    private String Marca;
    private int YearF;
    private int VelocidadM;

    public Automovil (String Marca, int YearF, int VelocidadM) {
        this.Marca = Marca;
        this.VelocidadM = VelocidadM;
        this.YearF = YearF;
    }

    public int getVelocidadM() {
        return VelocidadM;
    }
    public int getYearF() {
        return YearF;
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
    public void setVelocidadM(int velocidadM) {
        VelocidadM = velocidadM;
    }
    public void setYearF(int yearF) {
        YearF = yearF;
    }

    // COMPORTAMIENTO 1:

    public String Encendido () {
        String resultado = "";

        if (this.YearF < 2000) {
            resultado = "EL AUTOMOVIL NO ENCENDIO";
        } else {
            resultado = "EL AUTOMOVIL ENCENDIO";
        }
        return resultado;
    }

    // COMPORTAMIENTO 2:

    public int Antiguedad (int YearA) {
        int resultado;

        resultado = YearA - this.YearF;
        return resultado;
    }
}
