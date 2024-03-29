package proyectofinal;

public class ZonaTematica{
    private String nombre;
    private String descripcion;
    private String colorAsociado;
    private String id;

    public ZonaTematica(String nombre, String descripcion, String colorAsociado, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.colorAsociado = colorAsociado;
        this.id = id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}