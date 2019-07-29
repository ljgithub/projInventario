/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.ZonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IZonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "zonaBean")
@ViewScoped
public class ZonaBean implements Serializable{
    
    private static final IZonaController controllerZona= new ZonaContrImpl();
    
    private String nombreZona;
    private int estado;

    
    private Zona zona;
            
    /**
     * Creates a new instance of ZonaBean
     */
    public ZonaBean() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
    public void insertar(){
        zona.setDescripcion(nombreZona);
        zona.setEstadoZona(estado);
        
        controllerZona.ingresar(zona);
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
}
