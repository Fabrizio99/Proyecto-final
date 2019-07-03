package proyectofinal;

import java.time.LocalDate;
import java.time.Period;

public class ListaCliente {
    private NodoCLiente top;
    private int tamano;
    
    public ListaCliente(){
        this.top    = null;
        this.tamano = 0;
    }

    public int getTamaño() {
        return tamano;
    }

    public void setTamaño(int tamaño) {
        this.tamano = tamaño;
    }
    
    public boolean esVacia(){
        return top == null;
    }
    
    public void insertarFinal(Cliente persona) {
        NodoCLiente nuevoNodo = new NodoCLiente();
        nuevoNodo.setNombre(persona.getNombre());
        nuevoNodo.setApellidos(persona.getApellidos());
        nuevoNodo.setDNI(persona.getDNI());
        nuevoNodo.setSexo(persona.getSexo());
        nuevoNodo.setFechaNacimiento(persona.getFechaNacimiento());
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            NodoCLiente temporal = top;
            while (temporal.getSgte() != null) {
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    
    public void insertarTabla(){
        NodoCLiente temporal = top;
        while(temporal != null){
            VentanaCliente.objeto[0] = temporal.getNombre();
            VentanaCliente.objeto[1] = temporal.getApellidos();
            VentanaCliente.objeto[2] = temporal.getDNI();
            VentanaCliente.objeto[3] = temporal.getSexo();
            VentanaCliente.objeto[4] = temporal.getFechaNacimiento();
            VentanaCliente.modelo.addRow(VentanaCliente.objeto);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoCLiente elementoPorIndice(int indice) {
        NodoCLiente temporal = top;
        int contador         = 0;
        while (temporal != null && contador != indice) {
            temporal = temporal.getSgte();
            contador++;
        }
        return temporal;
    }
    
    public void EliminarNodo(int indice){
        if(elementoPorIndice(indice) == top){
            top = top.getSgte();
        }else{
            NodoCLiente temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }
    
    // Métodos para validar el DNI en el registro de clientes
    public boolean validarDNI(String DNI){
        NodoCLiente temporal = top;
        boolean validador = false;
        for (int i = 0; i < getTamaño(); i++) {
            if(temporal.getDNI().equals(DNI)){
                validador = true;
                break;
            }
        }
        return validador;
    }
    
    public boolean validarLongitudDNI(String DNI){
        boolean validador=false;
        if(DNI.length()!=8){
            validador=true;
        }
        return validador;
    }
    
    //Métodos para validar si existe el cliente al vender las entradas
    public boolean existeCliente(String DNI){
        boolean validador = false;
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getDNI().equals(DNI)){
                validador = true;
                break;
            }
        }
        return validador;
    }
    
    public NodoCLiente encontrarCliente(String DNI){
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getDNI().equals(DNI))   return elementoPorIndice(i);
        }
        return null;
    }
    
    public boolean cumpleanosCliente(String DNI){
        LocalDate fechaHoy = LocalDate.now();
        boolean validador = false;
        if(encontrarCliente(DNI).getFechaNacimiento().getDayOfMonth()==fechaHoy.getDayOfMonth() &&
            encontrarCliente(DNI).getFechaNacimiento().getMonthValue()==fechaHoy.getMonthValue()){
            Period periodo = Period.between(encontrarCliente(DNI).getFechaNacimiento(), fechaHoy);
            VentanaVentaEntrada.lblMensajeEntrada.setText("<html>Hoy el cliente cumple "+periodo.getYears()+" años, tiene una 10% en toda su compra.</hmtl>");
            validador = true;
        }
        return validador;
    }
}