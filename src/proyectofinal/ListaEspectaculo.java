package proyectofinal;

public class ListaEspectaculo {
    private NodoEspectaculo top;
    private int tamano;
    
    public ListaEspectaculo(){
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
    
    public void insertarFinal(Espectaculo espec) {
        NodoEspectaculo nuevoNodo = new NodoEspectaculo();
        nuevoNodo.setNombre(espec.getNombre());
        nuevoNodo.setAforoMax(espec.getAforoMax());
        nuevoNodo.setDuracion(espec.getDuracion());
        nuevoNodo.setTipo(espec.getTipo());
        nuevoNodo.setZonaTematica(espec.getZonaTematica());
        nuevoNodo.setPrecio(espec.getPrecio());
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            NodoEspectaculo temporal = top;
            while (temporal.getSgte() != null) {
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    
    public void insertarTabla(){
        NodoEspectaculo temporal = top;
        while(temporal != null){
            VentanaEspectaculo.objeto[0] = temporal.getNombre();
            VentanaEspectaculo.objeto[1] = temporal.getTipo();
            VentanaEspectaculo.objeto[2] = temporal.getDuracion();
            VentanaEspectaculo.objeto[3] = temporal.getAforoMax();
            VentanaEspectaculo.objeto[4] = temporal.getPrecio();
            VentanaEspectaculo.objeto[5] = temporal.getZonaTematica();
            VentanaEspectaculo.modelo.addRow(VentanaEspectaculo.objeto);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoEspectaculo elementoPorIndice(int indice) {
        NodoEspectaculo temporal = top;
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
            NodoEspectaculo temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }
    
    // Métodos para el registro de compra de pases
    public boolean existeZonaEspectaculo(String zonaTematica){
        boolean validador = false;
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                validador = true;
                break;
            }
        }
        return validador;
    }
    public void anadirEspectaculosCombo(String zonaTematica){
        VentanaVentaEntrada.cmbEspectaculo.removeAllItems();
        VentanaVentaEntrada.cmbEspectaculo.addItem("");
        for (int i = 0; i < getTamaño(); i++) {
            if(elementoPorIndice(i).getZonaTematica().equals(zonaTematica)){
                VentanaVentaEntrada.cmbEspectaculo.addItem(elementoPorIndice(i).getNombre());
            }
        }
    }
}
