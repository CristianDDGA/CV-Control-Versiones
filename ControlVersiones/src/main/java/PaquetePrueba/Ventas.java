/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePrueba;

/**
 *
 * @author Matius
 */
public class Ventas {
    String costo;
    String factura;
    String producto;
    String Cliente;

    public Ventas(String costo, String factura, String producto, String Cliente) {
        this.costo = costo;
        this.factura = factura;
        this.producto = producto;
        this.Cliente = Cliente;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    
    
}
