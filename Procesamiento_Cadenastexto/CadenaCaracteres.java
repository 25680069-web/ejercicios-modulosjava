package Procesamiento_Cadenastexto;

public class CadenaCaracteres {

    private String textoActual;
    private String Identificador;
    private int Longitud;

    public CadenaCaracteres (String txt, String FR, int Long){
        this.Identificador = FR;
        this.textoActual = txt;
        this.Longitud = this.textoActual.replace(" ","").length();;
    }

    public String getTextoActual() {
        return textoActual;
    }
    public int getLongitud() {
        return Longitud;
    }
    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }
    public void setLongitud(int longitud) {
        Longitud = longitud;
    }
    public void setTextoActual(String textoActual) {
        this.textoActual = textoActual;
    }



    // COMPORTAMIENTO 1:

    public String prefijo (String pre) {
        String resultado = "";

        resultado = pre+"_"+this.textoActual;

        return resultado;
    }

   // COMPORTAMIENTO 2:

    public int EspaciosBlancos () {
        int contador = 0;
        for (int i=0; i<this.textoActual.length(); i++) {
            char letra = this.textoActual.charAt(i);

            if (letra == ' ') {
                contador++;
            }
        }
        return contador;
    }


}


