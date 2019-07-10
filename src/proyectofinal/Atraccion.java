package proyectofinal;

public class Atraccion{
    private String nombre;
    private Double estaturaMinima;
    private int capacidad;
    private String duracion;
    private Double precio;
    private String zonaTematica;
    private String id;

    public Atraccion(String nombre, Double estaturaMinima, int capacidad, String duracion, Double precio, String zonaTematica, String id) {
        this.nombre = nombre;
        this.estaturaMinima = estaturaMinima;
        this.capacidad = capacidad;
        this.duracion = duracion;
        this.precio = precio;
        this.zonaTematica = zonaTematica;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getEstaturaMinima() {
        return estaturaMinima;
    }

    public void setEstaturaMinima(Double estaturaMinima) {
        this.estaturaMinima = estaturaMinima;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
