/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;
    private String codigoProducto;
    private String descripcionProducto;
    private double valorUnitario;
    private char stock;
    private int iva;
    private double peso;
    private int estadoProducto;
    
    @ManyToOne
    @JoinColumn(name = "fk_IdProveedor")
    private Proveedor proveedor;
    
    @ManyToOne
    @JoinColumn(name = "fk_IdPresentacion")
    private Presentacion presentacion;
    
    @ManyToOne
    @JoinColumn(name = "fk_IdMarca")
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name = "fk_IdZona")
    private Zona zona;

    public Producto() {
    }

    public Producto(int idProducto, String codigoProducto, String descripcionProducto, double valorUnitario, char stock, int iva, double peso, int estadoProducto, Proveedor proveedor, Presentacion presentacion, Marca marca, Zona zona) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.valorUnitario = valorUnitario;
        this.stock = stock;
        this.iva = iva;
        this.peso = peso;
        this.estadoProducto = estadoProducto;
        this.proveedor = proveedor;
        this.presentacion = presentacion;
        this.marca = marca;
        this.zona = zona;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public char getStock() {
        return stock;
    }

    public void setStock(char stock) {
        this.stock = stock;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", descripcionProducto=" + descripcionProducto + ", valorUnitario=" + valorUnitario + ", stock=" + stock + ", iva=" + iva + ", peso=" + peso + ", estadoProducto=" + estadoProducto + ", proveedor=" + proveedor + ", presentacion=" + presentacion + ", marca=" + marca + ", zona=" + zona + '}';
    }
    
    
    
}
