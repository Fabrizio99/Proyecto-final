package proyectofinal;

public class ZonaTematica{
    private String nombre;
    private String descripcion;
    private String colorAsociado;

    public ZonaTematica(String nombre, String descripcion, String colorAsociado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.colorAsociado = colorAsociado;
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
}