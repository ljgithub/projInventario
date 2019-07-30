/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.RolContrImpl;
import com.uisrael.inventarioproyecto.controlador.IRolController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Rol;
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
@ManagedBean(name = "rolBean")
@ViewScoped
public class RolBean implements Serializable{

    private static final IRolController controllerRol = new RolContrImpl();
    
    private String  descripcion;
    private int estado;
    
    private Rol rol;
    private List<Rol> consultaListaRol;
    
    /**
     * Creates a new instance of RolBean
     */
    public RolBean() {
                
    }
    
    @PostConstruct
    public void init(){
        llenarDatos();
    }
    
    public void llenarDatos(){
        consultaListaRol= controllerRol.listar();
    }
    
    public void insertar(){
        rol = new Rol();
        rol.setDescripcionRol(descripcion);
        rol.setEstado(estado);
        controllerRol.ingresar(rol);
        
        llenarDatos();
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

    public List<Rol> getConsultaListaRol() {
        return consultaListaRol;
    }

    public void setConsultaListaRol(List<Rol> consultaListaRol) {
        this.consultaListaRol = consultaListaRol;
    }
    
    
}
