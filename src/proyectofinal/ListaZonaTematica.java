package proyectofinal;

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
    
    public void insertarFinal(ZonaTematica zona){
        NodoZonaTematica nuevoNodo = new NodoZonaTematica();
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
            VentanaZonaTematica.objeto[0] = temporal.getNombre();
            VentanaZonaTematica.objeto[1] = temporal.getDescripcion();
            VentanaZonaTematica.objeto[2] = temporal.getColorAsociado();
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
}