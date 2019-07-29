/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.UnidadMedidaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IUnidadMedidaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "unidadMedidaBean")
@ViewScoped
public class UnidadMedidaBean implements Serializable{
    private static final IUnidadMedidaController controllerUnidad= new UnidadMedidaContrImpl();
    
    private String unidadMedidaDescrip;
    private String estado;
    
    private UnidadMedida unidadMedida;
    
    /**
     * Creates a new instance of UnidadMedidaBean
     */
    public UnidadMedidaBean() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
    
    public void insertar(){
        unidadMedida= new UnidadMedida();
        unidadMedida.setTipoMedida(unidadMedidaDescrip);
        unidadMedida.setEstado(estado);
        
        controllerUnidad.ingresar(unidadMedida);
    }

    public String getUnidadMedidaDescrip() {
        return unidadMedidaDescrip;
    }

    public void setUnidadMedidaDescrip(String unidadMedidaDescrip) {
        this.unidadMedidaDescrip = unidadMedidaDescrip;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
}
