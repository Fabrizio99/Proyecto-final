package proyectofinal;

public class ListaAtraccion {
    private NodoAtraccion top;
    private int tamano;

    public ListaAtraccion() {
        this.top = null;
        this.tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public boolean esVacia(){
        return top == null;
    }
    
    public void insertarFinal(Atraccion atrac) {
        NodoAtraccion nuevoNodo = new NodoAtraccion();
        nuevoNodo.setNombre(atrac.getNombre());
        nuevoNodo.setEstatura(atrac.getEstatura());
        nuevoNodo.setCapacidad(atrac.getCapacidad());
        nuevoNodo.setDuracion(atrac.getDuracion());
        nuevoNodo.setPrecio(atrac.getPrecio());
        nuevoNodo.setZonaTematica(atrac.getZonaTematica());
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            NodoAtraccion temporal = top;
            while (temporal.getSgte() != null) {
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    
    public void insertarTabla(){
        NodoAtraccion temporal = top;
        while(temporal != null){
            VentanaAtraccion.objeto[0] = temporal.getNombre();
            VentanaAtraccion.objeto[1] = temporal.getCapacidad();
            VentanaAtraccion.objeto[2] = temporal.getEstatura();
            VentanaAtraccion.objeto[3] = temporal.getPrecio();
            VentanaAtraccion.objeto[4] = temporal.getDuracion();
            VentanaAtraccion.objeto[5] = temporal.getZonaTematica();
            VentanaAtraccion.modelo.addRow(VentanaAtraccion.objeto);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoAtraccion elementoPorIndice(int indice) {
        NodoAtraccion temporal = top;
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
            NodoAtraccion temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }
    
    // Métodos para el registro de compra de pases
    public boolean existeZonaAtraccion(String zonaTematica){
        boolean validador = false;
        for (int i = 0; i < getTamano(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                validador = true;
                break;
            }
        }
        return validador;
    }
    public void anadirAtraccionCombo(String zonaTematica){
        VentanaVentaEntrada.cmbAtraccion.removeAllItems();
        VentanaVentaEntrada.cmbAtraccion.addItem("");
        for (int i = 0; i < getTamano(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                VentanaVentaEntrada.cmbAtraccion.addItem(elementoPorIndice(i).getNombre());
            }
        }
    }
}
