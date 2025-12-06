package Gestion_Tareas;

public class TareaPendiente {
    private String DescripcionT;
    private String Prioridad;
    private String Indicador;

    public TareaPendiente (String DescrupcionT, String Prioridad, String Indicador) {
        this.DescripcionT = DescrupcionT;
        this.Indicador = Indicador;
        this.Prioridad = Prioridad;
    }

    public String getDescripcionT() {
        return DescripcionT;
    }
    public String getIndicador() {
        return Indicador;
    }
    public String getPrioridad() {
        return Prioridad;
    }

    public void setDescripcionT(String descripcionT) {
        DescripcionT = descripcionT;
    }
    public void setIndicador(String indicador) {
        Indicador = indicador;
    }
    public void setPrioridad(String prioridad) {
        Prioridad = prioridad;
    }

    // COMPORTAMIENTO 1:

    public void EstadoCompleto () {
        this.Indicador = "COMPLETADA";
    }

    // COMPORTAMIENTO 2:

    public String EstadoUrgente () {
        String resultado = "";

        if (this.Prioridad.equals("ALTA")  && this.Indicador.equals("NO COMPLETADA")) {
            resultado = "LA TAREA ES URGENTE";
        } else {
            resultado = "LA TAREA NO ES URGENTE";
        }

        return resultado;
    }
}
