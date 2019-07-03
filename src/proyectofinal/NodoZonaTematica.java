package proyectofinal;

public class NodoZonaTematica {
    private String nombre;
    private String descripcion;
    private String colorAsociado;
    private NodoZonaTematica sgte;
    
    public NodoZonaTematica(){
        this.nombre        = "";
        this.descripcion   = "";
        this.colorAsociado = "";
        this.sgte          = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColorAsociado() {
        return colorAsociado;
    }

    public void setColorAsociado(String colorAsociado) {
        this.colorAsociado = colorAsociado;
    }

    public NodoZonaTematica getSgte() {
        return sgte;
    }

    public void setSgte(NodoZonaTematica sgte) {
        this.sgte = sgte;
    }
}