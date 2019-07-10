package proyectofinal;

import javax.swing.JOptionPane;

public class ListaZonaTematica {
    private NodoZonaTematica top;
    private int tamano;
    
    public ListaZonaTematica(){
        this.top      = null;
        this.tamano = 0;
    }
    
    public boolean esVacia(){
        return top==null;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
   
    public boolean  validaRepetidos(String nombre, String ID){
    NodoZonaTematica temporal = top;
        boolean validador = true;
        for (int i = 0; i < getTamano(); i++) {
            if(temporal.getId().equals(ID) || (temporal.getNombre().equals(nombre) && !temporal.getId().equals(ID))){
                validador = false;
                break;
                
            }
            temporal=temporal.getSgte();
        }
        return validador;
    }
    
    public void insertarFinal(ZonaTematica zona){
        NodoZonaTematica nuevoNodo = new NodoZonaTematica();
        nuevoNodo.setId(zona.getId());
        nuevoNodo.setNombre(zona.getNombre());
        nuevoNodo.setDescripcion(zona.getDescripcion());
        nuevoNodo.setColorAsociado(zona.getColorAsociado());
        
        if(esVacia()){
            top = nuevoNodo;
        }else{
            NodoZonaTematica temporal = top;
            while(temporal.getSgte()!= null){
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    
    public void insertarTabla(){
        NodoZonaTematica temporal = top;
        while(temporal != null){
            VentanaZonaTematica.objeto[0] = temporal.getId();
            VentanaZonaTematica.objeto[1] = temporal.getNombre();
            VentanaZonaTematica.objeto[2] = temporal.getDescripcion();
            VentanaZonaTematica.objeto[3] = temporal.getColorAsociado();
            VentanaZonaTematica.modelo.addRow(VentanaZonaTematica.objeto);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoZonaTematica elementoPorIndice(int indice){
        NodoZonaTematica temporal = top;
        int contador              = 0;
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
            NodoZonaTematica temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }
    
    
     public boolean validaNombre(String nombre,String ID){
      NodoZonaTematica temporal = top;
        boolean validador = true;
        for (int i = 0; i < getTamano(); i++) {
            if(temporal.getNombre().equals(nombre) && !temporal.getId().equals(ID)){
            validador = false;
            }
                
            temporal=temporal.getSgte();
        }
        return validador;}
     
     public void comprobar(String ID,String nombre){
     NodoZonaTematica temporal = top;
     for (int i = 0; i < getTamano(); i++) {
         if(temporal.getNombre().equals(nombre) && temporal.getId().equals(ID)){
         JOptionPane.showMessageDialog(null, "Nombre e ID ya existe ");
         }else if(temporal.getNombre().equals(nombre)){
             JOptionPane.showMessageDialog(null, "Existe una zona temática con ese nombre");
            }else if(temporal.getId().equals(ID)){
                
                JOptionPane.showMessageDialog(null, "El ID ya ha sido registrado");
            }
     
     }
                
            temporal=temporal.getSgte();
     }
    
}