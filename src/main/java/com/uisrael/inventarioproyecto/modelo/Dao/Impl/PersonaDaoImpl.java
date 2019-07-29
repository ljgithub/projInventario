/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Persona;
import com.uisrael.inventarioproyecto.modelo.IPersonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class PersonaDaoImpl extends GenericaDaoImpl<Persona> implements IPersonaDao{

    @Override
    public void ingresar(Persona m) {
        this.create(m);
        System.out.println("Persona Creada : " + m);
    }

    @Override
    public Persona actualizar(Persona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Persona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona buscarPorid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
