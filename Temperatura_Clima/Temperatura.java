package Temperatura_Clima;

public class Temperatura {
    private double VTemp;
    private String Umedida;
    private String FechaR;

    public Temperatura (double VTemp, String Umedida, String FechaR) {
        this.FechaR = FechaR;
        this.Umedida = Umedida;
        this.VTemp = VTemp;
    }

    public double getVTemp() {
        return VTemp;
    }
    public String getFechaR() {
        return FechaR;
    }
    public String getUmedida() {
        return Umedida;
    }

    public void setFechaR(String fechaR) {
        FechaR = fechaR;
    }
    public void setUmedida(String umedida) {
        Umedida = umedida;
    }
    public void setVTemp(double VTemp) {
        this.VTemp = VTemp;
    }


    // COMPORTAMIENTO 1:

    public void Conversor () {
        double resultado;

        if (this.Umedida.equals("Celsius")) {
            this.VTemp = (this.VTemp * 1.8) + 32;
            this.Umedida = "Fahrenheit";

        } else if (this.Umedida.equals("Fahrenheit")) {
            this.VTemp = (this.VTemp - 32) / 1.8;
            this.Umedida = "Celsius";
        }
    }

    // COMPORTAMIENTO 2:

    public String EvaluarTemp () {
        String resultado = "";

        if (this.Umedida.equals("Celsius") && this.VTemp > 40) {
            resultado = "TEMPERATURA EXTREMA";

        } else if (this.Umedida.equals("Fahrenheit") && this.VTemp > 104) {
            resultado = "TEMPERATURA EXTREMA";
        } else {
            resultado = "TEMPERATURA OPTIMA";
        }

        return resultado;
    }
}
