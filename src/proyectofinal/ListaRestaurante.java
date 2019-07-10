package proyectofinal;

import javax.swing.JOptionPane;

public class ListaRestaurante {
    private NodoRestaurante top;
    private int tamano;
    
    public ListaRestaurante(){
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
    
    public void insertarFinal(Restaurante restaur) {
        NodoRestaurante nuevoNodo = new NodoRestaurante();
        nuevoNodo.setNombre(restaur.getNombre());
        nuevoNodo.setHorarioInicio(restaur.getHorarioInicio());
        nuevoNodo.setHorarioCierre(restaur.getHorarioCierre());
        nuevoNodo.setPrecioMedio(restaur.getPrecioMedio());
        nuevoNodo.setZonaTematica(restaur.getZonaTematica());
        nuevoNodo.setId(restaur.getId());
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            NodoRestaurante temporal = top;
            while (temporal.getSgte() != null) {
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    
    public void insertarTabla(){
        NodoRestaurante temporal = top;
        while(temporal != null){
            VentanaRestaurante.objeto[0] = temporal.getId();
            VentanaRestaurante.objeto[1] = temporal.getNombre();
            VentanaRestaurante.objeto[2] = temporal.getHorarioInicio();
            VentanaRestaurante.objeto[3] = temporal.getHorarioCierre();
            VentanaRestaurante.objeto[4] = temporal.getPrecioMedio();
            VentanaRestaurante.objeto[5] = temporal.getZonaTematica();
            VentanaRestaurante.modelo.addRow(VentanaRestaurante.objeto);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoRestaurante elementoPorIndice(int indice) {
        NodoRestaurante temporal = top;
        int contador             = 0;
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
            NodoRestaurante temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }
    
    // Métodos para el registro de compra de pases
    public boolean existeZonaRestaurante(String zonaTematica){
        boolean validador = false;
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                validador = true;
                break;
            }
        }
        return validador;
    }
    public void anadirRestauranteCombo(String zonaTematica){
        VentanaVentaEntrada.cmbRestaurante.removeAllItems();
        VentanaVentaEntrada.cmbRestaurante.addItem("");
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                VentanaVentaEntrada.cmbRestaurante.addItem(elementoPorIndice(i).getNombre());
            }
        }
    }
    
    public boolean validarRepetidos(String nombre,String zona, String ID){
        NodoRestaurante temporal = top;
        boolean validador = true;
        for (int i = 0; i < getTamaño(); i++) {
            if(temporal.getNombre().equals(nombre) && temporal.getZonaTematica().equals(zona) || temporal.getId().equals(ID) && temporal.getZonaTematica().equals(zona)){
                validador = false;
                break;
                
            }
            temporal=temporal.getSgte();
        }
        return validador;
    }
     public boolean validarNombre(String nombre,String ID,String zona){
        NodoRestaurante temporal = top;
        boolean validador = true;
        for (int i = 0; i < getTamaño(); i++) {
            if(temporal.getNombre().equals(nombre) && temporal.getId().equals(ID) && temporal.getZonaTematica().equals(zona)){
                validador = true;
                break; 
            }else if(temporal.getNombre().equals(nombre) && !(temporal.getId().equals(ID)) && temporal.getZonaTematica().equals(zona)){
            validador=false;
            break;
            }else{
            validador=true;
            }
                
            temporal=temporal.getSgte();
        }
        return validador;
    }
     
   public void comprobar(String ID,String nombre,String zona){
     NodoRestaurante temporal = top;
     for (int i = 0; i < getTamaño(); i++) {
            if(temporal.getNombre().equals(nombre) && temporal.getId().equals(ID) && temporal.getZonaTematica().equals(zona))
            {
               JOptionPane.showMessageDialog(null, "Nombre e ID ya existe ");
            }else if(temporal.getNombre().equals(nombre) && temporal.getZonaTematica().equals(zona)){
             JOptionPane.showMessageDialog(null, "Nombre ya existe en la zona tematica");
            }else if(temporal.getId().equals(ID) && temporal.getZonaTematica().equals(zona)){
                
                JOptionPane.showMessageDialog(null, "ID ya existe en la zona tematica");
           
     
     }  
}
   }
}