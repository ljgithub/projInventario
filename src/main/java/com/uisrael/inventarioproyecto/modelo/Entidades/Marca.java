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
@Table(name = "marca")
public class Marca implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMarca;
    private String descripcionMarca;
    private int estadoMarca;
    
    @OneToMany(mappedBy = "marca")
    private List<Producto> productos = new ArrayList<>();

    public Marca() {
    }

    public Marca(int idMarca, String descripcionMarca, int estadoMarca) {
        this.idMarca = idMarca;
        this.descripcionMarca = descripcionMarca;
        this.estadoMarca = estadoMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    public int getEstadoMarca() {
        return estadoMarca;
    }

    public void setEstadoMarca(int estadoMarca) {
        this.estadoMarca = estadoMarca;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", descripcionMarca=" + descripcionMarca + ", estadoMarca=" + estadoMarca + ", productos=" + productos + '}';
    }
        
    
}
