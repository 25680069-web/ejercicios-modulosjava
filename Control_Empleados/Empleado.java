package Control_Empleados;

public class Empleado {

    private int CEmpleado;
    private int SMensual;
    private double PorcentajeRI;

    public Empleado (int CEmpleado, int SMensual, double PorcenatejRI) {
        this.CEmpleado = CEmpleado;
        this.SMensual = SMensual;
        this.PorcentajeRI = PorcenatejRI;
    }

    public int getCEmpleado() {
        return CEmpleado;
    }
    public int getSMensual() {
        return SMensual;
    }
    public double getPorcentajeRI() {
        return PorcentajeRI;
    }

    public void setCEmpleado(int CEmpleado) {
        this.CEmpleado = CEmpleado;
    }
    public void setPorcentajeRI(double porcentajeRI) {
        PorcentajeRI = porcentajeRI;
    }
    public void setSMensual(int SMensual) {
        this.SMensual = SMensual;
    }


    // COMPORTAMIENTO 1:

    public double SalarioNeto () {
        double resultado;
        double mDescuento;

        mDescuento = this.SMensual * (this.PorcentajeRI / 100);

        resultado = this.SMensual - mDescuento;
        return resultado;
    }

    // COMPORTAMIENTO 2:

    public double AumentoSalario (double Porcentaje) {
        double resultado;
        double mAumento;

        mAumento = SalarioNeto() * (Porcentaje / 100);
        System.out.println("MONTO DEL AUMENTO: " + "$"+ mAumento);
        resultado = SalarioNeto() + mAumento;
        return resultado;
    }
}
