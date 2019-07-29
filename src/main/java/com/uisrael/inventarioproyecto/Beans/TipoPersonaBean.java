/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.TipoPersonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.ITipoPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "tipoPersonaBean")
@ViewScoped
public class TipoPersonaBean implements Serializable {

    private static final ITipoPersonaController controllerTipoPersona = new TipoPersonaContrImpl();

    private int idTipoPersona;
    private String descripcion;
    private int estado;

    private TipoPersona tipo;

    private List<TipoPersona> listaTiposPersona;

    /**
     * Creates a new instance of TipoPersonaBean
     */
    public TipoPersonaBean() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador Cargado");
            poblarListaTipos();
    }

    public void insertar() {
        tipo = new TipoPersona();
        tipo.setDescripcion(descripcion);
        tipo.setEstado(estado);

        controllerTipoPersona.ingresar(tipo);
        poblarListaTipos();
    }

    public void poblarListaTipos() {
        listaTiposPersona = controllerTipoPersona.listar();
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

    public List<TipoPersona> getListaTiposPersona() {
        return listaTiposPersona;
    }

    public void setListaTiposPersona(List<TipoPersona> listaTiposPersona) {
        this.listaTiposPersona = listaTiposPersona;
    }

}
