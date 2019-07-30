/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.PersonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "usuarioBean")
@Dependent
public class UsuarioBean implements Serializable{
       
    private static final IPersonaController controllerPersona = new PersonaContrImpl();
    
    private String nombres;
    private String apellidos;
    private int telefono;
    private int celular;
    private String direccion;
    private String ciudad;
    private String email;
    
    private Usuario usuario;
    
    private int fkIdTipoPersona;
    private TipoPersona tipoPersona;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public UsuarioBean() {
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Personabean Creado");
        fkIdTipoPersona = 351;
    }
    public void insertarPersona(){
        usuario = new Usuario();        
        usuario.setNombres(nombres);
        usuario.setApellidos(apellidos);
        usuario.setTelefono(telefono);
        usuario.setCelular(celular);
        usuario.setDireccion(direccion);
        usuario.setCiudad(ciudad);
        usuario.setEmail(email);
        
        
        controllerPersona.ingresar(usuario);
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

    public int getFkIdTipoPersona() {
        return fkIdTipoPersona;
    }

    public void setFkIdTipoPersona(int fkIdTipoPersona) {
        this.fkIdTipoPersona = fkIdTipoPersona;
    }
    
    
}
