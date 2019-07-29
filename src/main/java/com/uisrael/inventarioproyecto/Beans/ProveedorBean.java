/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.ProveedorContrImpl;
import com.uisrael.inventarioproyecto.controlador.IProveedorController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "proveedorBean")
@ViewScoped
public class ProveedorBean  implements Serializable{

    private static final IProveedorController controllerProveedor = new ProveedorContrImpl();
               
    private String nombres;
    private String apellidos;
    private int telefono;
    private int celular;
    private String direccion;
    private String ciudad;
    private String email;
    private int estadoProveedor;
    
    
   private Proveedor proveedor;
    
    /**
     * Creates a new instance of ProveedorBean
     */
    public ProveedorBean() {
    }

    @PostConstruct
    public void init(){
        
    }
    
    
    public void insertarProveedor(){
        proveedor = new Proveedor();
        proveedor.setNombres(nombres);
        proveedor.setApellidos(apellidos);
        proveedor.setTelefono(telefono);
        proveedor.setCelular(celular);
        proveedor.setDireccion(direccion);
        proveedor.setCiudad(ciudad);
        proveedor.setEmail(email);
        controllerProveedor.ingresar(proveedor);
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(int estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }
    
     
    
}
