package proyectofinal;

public class Espectaculo{
    private String nombre;
    private String tipo;
    private String duracion;
    private Double precio;
    private String zonaTematica;
    private int aforoMax;
    private String id;

    public Espectaculo(String nombre, String tipo, String duracion, Double precio, String zonaTematica, int aforoMax, String id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        this.precio = precio;
        this.zonaTematica = zonaTematica;
        this.aforoMax = aforoMax;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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