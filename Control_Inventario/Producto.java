package Control_Inventario;

public class Producto {

    private String Referenfia;
    private int Stock;
    private double PrecioUnitario;

    public Producto(String R, int S, double PU) {
        this.PrecioUnitario = PU;
        this.Referenfia = R;
        this.Stock = S;
    }

    public String getReferenfia() {
        return Referenfia;
    }
    public int getStock() {
        return Stock;
    }
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }
    public void setReferenfia(String referenfia) {
        Referenfia = referenfia;
    }
    public void setStock(int stock) {
        Stock = stock;
    }

    // COMPORTAMIENTOS

    public int IncrementoStock (int newStock) {
        this.Stock = this.Stock + newStock;
        return this.Stock;
    }

    public double StockTotal () {
        double Preciototal;

        Preciototal= this.Stock * this.PrecioUnitario;
        return Preciototal;
    }
}
