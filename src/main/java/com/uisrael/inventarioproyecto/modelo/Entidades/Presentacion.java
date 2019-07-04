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
@Table(name = "presentacion")
public class Presentacion implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPresentacion;
    private String descripcionPresentacion;
    
    @OneToMany(mappedBy = "presentacion")
    private List<Producto> productos = new ArrayList<Producto>();

    public Presentacion() {
    }

    public Presentacion(int idPresentacion, String descripcionPresentacion) {
        this.idPresentacion = idPresentacion;
        this.descripcionPresentacion = descripcionPresentacion;
    }

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getDescripcionPresentacion() {
        return descripcionPresentacion;
    }

    public void setDescripcionPresentacion(String descripcionPresentacion) {
        this.descripcionPresentacion = descripcionPresentacion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Presentacion{" + "idPresentacion=" + idPresentacion + ", descripcionPresentacion=" + descripcionPresentacion + ", productos=" + productos + '}';
    }
    
    
}
