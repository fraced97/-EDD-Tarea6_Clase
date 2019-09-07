/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaestructuras6;

/**
 *
 * @author USUARIO
 */
public class Lista {

    Nodo primero;
    Nodo ultimo;
    int tamanio;

    public Lista() {
        primero = null;
        tamanio = 0;
    }

    public void insertarListaOrdenada(int codigoProducto, int stock, int stockMinimo, String codigoProveedor) {
        Nodo nuevo = new Nodo(codigoProducto, stock, stockMinimo, codigoProveedor);
        Nodo auxDato1;
        Nodo auxDato2;
        if (primero == null) {
            primero = nuevo;
            nuevo.siguiente = null;
            tamanio++;
        } else {
            auxDato1 = primero;
            while (auxDato1 != null) {
                auxDato2 = auxDato1.siguiente;
                if (nuevo.codigoProducto < auxDato1.codigoProducto) {
                    nuevo.siguiente = primero;
                    primero = nuevo;
                    tamanio++;
                    break;
                } else {
                    if (nuevo.codigoProducto > auxDato1.codigoProducto && auxDato2 == null) {
                        auxDato1.siguiente = nuevo;
                        nuevo.siguiente = null;
                        tamanio++;
                        break;

                    } else {
                        if (auxDato1.codigoProducto < nuevo.codigoProducto && auxDato2.codigoProducto >= nuevo.codigoProducto) {
                            auxDato1.siguiente = nuevo;
                            nuevo.siguiente = auxDato2;
                            tamanio++;
                            break;
                        } else {
                            auxDato1 = auxDato1.siguiente;
                        }

                    }
                }

            }
        }
    }


    public void stockMinimo() {
        
        boolean condicion = true;
        while (condicion) {
            if (primero.stock < primero.stockMinimo) {

                primero = primero.siguiente;
                
            } else {
                Nodo anterior = primero;
                Nodo temporal = primero.siguiente;
                
                while (temporal != null) {
                    if (temporal.stock < temporal.stockMinimo) {
                        
                        break;
                    }
                    if(temporal.siguiente!=null){
                        anterior = anterior.siguiente;
                        temporal=temporal.siguiente;
                    }else{
                        break;
                    }
                    
                    
                }
                if(temporal.stock < temporal.stockMinimo){
                    if(temporal.siguiente!=null){
                        anterior.siguiente = anterior.siguiente.siguiente;
                    }else{
                        anterior.siguiente=null;
                    }
                    
                }
                if(temporal.siguiente==null){
                   condicion = false; 
                }
               
            }
        }

        
    }

    public void eliminar() {
        boolean condicion = true;
        while (condicion) {
            if (primero.codigoProducto>100) {

                primero = primero.siguiente;
                
            } else {
                Nodo anterior = primero;
                Nodo temporal = primero.siguiente;
                
                while (temporal != null) {
                    if (temporal.codigoProducto >100) {
                        
                        break;
                    }
                    if(temporal.siguiente!=null){
                        anterior = anterior.siguiente;
                        temporal=temporal.siguiente;
                    }else{
                        break;
                    }
                    
                    
                }
                if(temporal.codigoProducto>100){
                    if(temporal.siguiente!=null){
                        anterior.siguiente = anterior.siguiente.siguiente;
                    }else{
                        anterior.siguiente=null;
                    }
                    
                }
                if(temporal.siguiente==null){
                   condicion = false; 
                }
               
            }
        }

    }

    public void mostrar() {
        Nodo aux;
        aux = primero;
        while (aux != null) {
            System.out.println(aux.codigoProducto + ",  ");
            aux = aux.siguiente;
        }
    }
}
