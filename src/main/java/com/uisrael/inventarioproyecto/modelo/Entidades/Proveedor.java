/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProveedor;
    private String descripcion;
    private int estadoProveedor;
    
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<>();
    
    @OneToMany(mappedBy = "proveedorPedido")
    private List<Pedidos> pedido = new ArrayList<Pedidos>();

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String descripcion, int estadoProveedor) {
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
        this.estadoProveedor = estadoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(int estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Pedidos> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedidos> pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", descripcion=" + descripcion + ", estadoProveedor=" + estadoProveedor + ", productos=" + productos + ", pedido=" + pedido + '}';
    }
     
    
    
}
