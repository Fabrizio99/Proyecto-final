package proyectofinal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NodoCLiente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String sexo;
    private DateTimeFormatter fmt;
    private LocalDate fechaNacimiento;
    private NodoCLiente sgte;
    
    public NodoCLiente() {
        this.nombre    = "";
        this.apellidos = "";
        this.DNI       = "";
        this.fechaNacimiento = null;
        this.sgte      = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public NodoCLiente getSgte() {
        return sgte;
    }

    public void setSgte(NodoCLiente sgte) {
        this.sgte = sgte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}