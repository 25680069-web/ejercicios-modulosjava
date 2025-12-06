package Sistema_Reserva_Avion;

public class Vuelo {
    private int CodigoV;
    private int CapacidadM;
    private int NumAsientos;

    public Vuelo (int CodigoV, int CapacidadM, int NumAsientos) {
        this.CapacidadM = CapacidadM;
        this.CodigoV = CodigoV;
        this.NumAsientos = NumAsientos;
    }

    public int getCapacidadM() {
        return CapacidadM;
    }
    public int getCodigoV() {
        return CodigoV;
    }
    public int getNumAsientos() {
        return NumAsientos;
    }

    public void setCapacidadM(int capacidadM) {
        CapacidadM = capacidadM;
    }
    public void setCodigoV(int codigoV) {
        CodigoV = codigoV;
    }
    public void setNumAsientos(int numAsientos) {
        NumAsientos = numAsientos;
    }


    // COMPORTAMIENTO 1:

    public void Reserva () {

        if (this.NumAsientos != this.CapacidadM) {
            this.NumAsientos = this.NumAsientos + 1;
            System.out.println("RESERVA EXITOSA");
        } else if (this.NumAsientos == this.CapacidadM) {
            System.out.println("RESERVA NO REALIZADA, SE LLEGO A LA CAPACIDAD MAXIMA DE PASAJEROS");
        }
    }

    public double PorcentajeOcupacion () {
        double resultado;

        resultado = (this.NumAsientos*100) / this.CapacidadM;

        return resultado;
    }
}
