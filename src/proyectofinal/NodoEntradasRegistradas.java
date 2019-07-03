package proyectofinal;

public class NodoEntradasRegistradas {
    private String descripcion;
    private double precioUnitario;
    private int cantidad;
    private double total;
    private NodoEntradasRegistradas sgte;
    
    public NodoEntradasRegistradas(){
        this.descripcion = "";
        this.precioUnitario = 0.0;
        this.cantidad = 0;
        this.total = 0.0;
        this.sgte = null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public NodoEntradasRegistradas getSgte() {
        return sgte;
    }

    public void setSgte(NodoEntradasRegistradas sgte) {
        this.sgte = sgte;
    }
    
}
