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
@Table(name = "tipo_Persona")
public class TipoPersona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoPersona;
    private String descripcion;
    private int estado;
    
    
    @OneToMany(mappedBy = "tipoPersona")
    List<Usuario> persona = new ArrayList<Usuario>();

    public TipoPersona() {
    }

    public TipoPersona(int idTipoPersona, String descripcion, int estado) {
        this.idTipoPersona = idTipoPersona;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Usuario> getPersona() {
        return persona;
    }

    public void setPersona(List<Usuario> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "TipoPersona{" + "idTipoPersona=" + idTipoPersona + ", descripcion=" + descripcion + ", estado=" + estado + ", persona=" + persona + '}';
    }
    
    
}
