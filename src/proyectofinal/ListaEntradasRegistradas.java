package proyectofinal;

public class ListaEntradasRegistradas {
    private NodoEntradasRegistradas top;
    private int tamano;

    public ListaEntradasRegistradas() {
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
    
    public void insertarFinal(EntradasRegistrados entrada) {
        NodoEntradasRegistradas nuevoNodo = new NodoEntradasRegistradas();
        nuevoNodo.setDescripcion(entrada.getDescripcion());
        nuevoNodo.setPrecioUnitario(entrada.getPrecioUnitario());
        nuevoNodo.setCantidad(entrada.getCantidad());
        nuevoNodo.setTotal(entrada.getTotal());
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            NodoEntradasRegistradas temporal = top;
            while (temporal.getSgte() != null) {
                temporal = temporal.getSgte();
            }
            temporal.setSgte(nuevoNodo);
        }
        this.tamano++;
    }
    public void insertarTabla(){
        NodoEntradasRegistradas temporal = top;
        VentanaVentaEntrada.modeloEntradas.setRowCount(0);
        while(temporal != null){
            VentanaVentaEntrada.objetoEntradas[0] = temporal.getDescripcion();
            VentanaVentaEntrada.objetoEntradas[1] = temporal.getPrecioUnitario();
            VentanaVentaEntrada.objetoEntradas[2] = temporal.getCantidad();
            VentanaVentaEntrada.objetoEntradas[3] = temporal.getTotal();
            VentanaVentaEntrada.modeloEntradas.addRow(VentanaVentaEntrada.objetoEntradas);
            temporal = temporal.getSgte();
        }
    }
    
    public NodoEntradasRegistradas elementoPorIndice(int indice) {
        NodoEntradasRegistradas temporal = top;
        int contador                     = 0;
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
            NodoEntradasRegistradas temporal = elementoPorIndice(indice-1);
            temporal.setSgte(temporal.getSgte().getSgte());
        }
        this.tamano--;
    }

    public void eliminarTodo(){
        while(!esVacia()){
            EliminarNodo(0);
        }
    }
    
    //Métodos para registrar la venta de entradas/pases
    public double precioTotal(){
        double precio=0;
        for (int i = 0; i < getTamano(); i++) {
            precio+=elementoPorIndice(i).getTotal();
        }
        return precio;
    }
    
    /*public int entradaSolicitada(int indice){
        int cant=0;
         
        cant=elementoPorIndice(indice).getCantidad();
        return cant;  
    
    }*/
}
