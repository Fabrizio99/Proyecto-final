package proyectofinal;

public class NodoEspectaculo {
    private String nombre;
    private String tipo;
    private String duracion;
    private int aforoMax;
    private String zonaTematica;
    private Double precio;
    private NodoEspectaculo sgte;
    
    public NodoEspectaculo(){
        this.nombre = "";
        this.tipo   = "";
        this.duracion="";
        this.aforoMax = 0;
        this.zonaTematica = "";
        this.precio = 0.0;
        this.sgte = null;
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

    public NodoEspectaculo getSgte() {
        return sgte;
    }

    public void setSgte(NodoEspectaculo sgte) {
        this.sgte = sgte;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}