package proyectofinal;

public class Espectaculo{
    private String nombre;
    private String tipo;
    private String duracion;
    private Double precio;
    private String zonaTematica;
    private int aforoMax;

    public Espectaculo(String nombre, String tipo, String duracion, int aforoMax,String zonaTematica, Double precio) {
        this.nombre       = nombre;
        this.tipo         = tipo;
        this.duracion     = duracion;
        this.aforoMax     = aforoMax;
        this.zonaTematica = zonaTematica;
        this.precio  = precio;
    }

    public String getZonaTematica() {
        return zonaTematica;
    }

    public void setZonaTematica(String zonaTematica) {
        this.zonaTematica = zonaTematica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getAforoMax() {
        return aforoMax;
    }

    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precioMedio) {
        this.precio = precioMedio;
    }
    
    
}