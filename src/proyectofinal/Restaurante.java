package proyectofinal;

public class Restaurante{
    private String nombre;
    private String horarioInicio;
    private String horarioCierre;
    private Double precioMedio;
    private String zonaTematica;
    private String id;

    public Restaurante(String nombre, String horarioInicio, String horarioCierre, Double precioMedio, String zonaTematica, String id) {
        this.nombre = nombre;
        this.horarioInicio = horarioInicio;
        this.horarioCierre = horarioCierre;
        this.precioMedio = precioMedio;
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

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horario) {
        this.horarioInicio = horario;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Double getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(Double precioMedio) {
        this.precioMedio = precioMedio;
    }

    public String getZonaTematica() {
        return zonaTematica;
    }

    public void setZonaTematica(String zonaTematica) {
        this.zonaTematica = zonaTematica;
    }
}