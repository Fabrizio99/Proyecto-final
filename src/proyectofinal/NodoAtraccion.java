package proyectofinal;

public class NodoAtraccion {
    private String nombre;
    private Double estaturaMinima;
    private int capacidad;
    private String duracion;
    private String zonaTematica;
    private Double precio;
    private NodoAtraccion sgte;
    private String id;

    public NodoAtraccion() {
        this.nombre = "";
        this.estaturaMinima = 0.0;
        this.capacidad = 0;
        this.duracion = "";
        this.zonaTematica = "";
        this.precio = 0.0;
        this.id = "";
        this.sgte = null;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEstatura() {
        return estaturaMinima;
    }

    public void setEstatura(Double estatura) {
        this.estaturaMinima = estatura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getZonaTematica() {
        return zonaTematica;
    }

    public void setZonaTematica(String zonaTematica) {
        this.zonaTematica = zonaTematica;
    }

    public NodoAtraccion getSgte() {
        return sgte;
    }

    public void setSgte(NodoAtraccion sgte) {
        this.sgte = sgte;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
