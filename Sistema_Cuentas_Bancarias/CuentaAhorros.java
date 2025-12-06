package Sistema_Cuentas_Bancarias;

public class CuentaAhorros {
    private  int NCuenta;
    private String NTitular;
    private double SActual;

    public CuentaAhorros (int NCuenta, String NTitular, double SActual) {
        this.NCuenta = NCuenta;
        this.NTitular = NTitular;
        this.SActual = SActual;
    }

    public int getNCuenta() {
        return NCuenta;
    }

    public double getSActual() {
        return SActual;
    }
    public String getNTitular() {
        return NTitular;
    }

    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }
    public void setNTitular(String NTitular) {
        this.NTitular = NTitular;
    }
    public void setSActual(double SActual) {
        this.SActual = SActual;
    }

    // COMPORTAMIENTO 1:

    public double Deposito (int Efectivo) {
        double resultado;

        resultado = this.SActual + Efectivo;
        return resultado;
    }

    // COMPORTAMIENTO 2:

    public double Retiro (int Efectivo) {
        double resultado = 0;

        if (Efectivo > this.SActual) {
            System.out.println("ERROR: EXCEDISTE TU SALDO");
        } else {
            resultado = this.SActual - Efectivo;
        }

        return resultado;
    }
}
