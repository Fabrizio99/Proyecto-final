package proyectofinal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente{
    private String nombre;
    private String apellidos;
    private String DNI;
    private String sexo;
    private DateTimeFormatter fmt;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String apellido, String DNI, String sexo,String fechaNacimiento) {
        this.nombre    = nombre;
        this.apellidos = apellido;
        this.DNI       = DNI;
        this.sexo      = sexo;
        this.fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,fmt);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
