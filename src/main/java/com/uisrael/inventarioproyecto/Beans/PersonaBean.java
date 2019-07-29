/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.PersonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMPL.TipoPersonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.controlador.ITipoPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Persona;
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
@ManagedBean(name = "personaBean")
@Dependent
public class PersonaBean implements Serializable{
    
    private static final ITipoPersonaController controllerTipoPersona = new TipoPersonaContrImpl();
    private static final IPersonaController controllerPersona = new PersonaContrImpl();
    
    private String nombres;
    private String apellidos;
    private int telefono;
    private int celular;
    private String direccion;
    private String ciudad;
    private String email;
    
    private Persona persona;
    
    private int fkIdTipoPersona;
    private TipoPersona tipoPersona;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Personabean Creado");
        fkIdTipoPersona = 351;
    }
    public void insertarPersona(){
        persona = new Persona();
        tipoPersona = controllerTipoPersona.buscarPorid(fkIdTipoPersona);
        persona.setNombres(nombres);
        persona.setApellidos(apellidos);
        persona.setTelefono(telefono);
        persona.setCelular(celular);
        persona.setDireccion(direccion);
        persona.setCiudad(ciudad);
        persona.setEmail(email);
        persona.setTipoPersona(tipoPersona);
        
        controllerPersona.ingresar(persona);
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
