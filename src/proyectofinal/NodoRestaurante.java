package proyectofinal;

public class NodoRestaurante {
    private String nombre;
    private String horarioInicio;
    private String horarioCierre;
    private Double precioMedio;
    private String zonaTematica;
    private String id;
    private NodoRestaurante sgte;
    
    public NodoRestaurante(){
        this.nombre = "";
        this.horarioInicio = "";
        this.horarioCierre = "";
        this.precioMedio = 0.0;
        this.zonaTematica = "";
        this.id="";
        this.sgte = null;
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

    public NodoRestaurante getSgte() {
        return sgte;
    }

    public void setSgte(NodoRestaurante sgte) {
        this.sgte = sgte;
    }
}
