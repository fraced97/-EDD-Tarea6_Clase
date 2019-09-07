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
public class Nodo {
    int codigoProducto;
    int stock;
    int stockMinimo;
    String codigoProveedor;
    Nodo siguiente;
    
    
    public Nodo(int codigoProducto, int stock, int stockMinimo,String codigoProveedor){
        this.codigoProducto = codigoProducto;
        this.stock = stock;
        this.stockMinimo= stockMinimo;
        this.codigoProveedor=codigoProveedor;
        siguiente = null;
    }
}
