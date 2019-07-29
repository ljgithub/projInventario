/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.PersonaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Persona;
import com.uisrael.inventarioproyecto.modelo.IPersonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class PersonaContrImpl implements IPersonaController{

    @Override
    public void ingresar(Persona m) {
        IPersonaDao idao= new PersonaDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Persona actualizar(Persona m) {
        IPersonaDao idao= new PersonaDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Persona m) {
        IPersonaDao idao= new PersonaDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Persona> listar() {
        IPersonaDao idao= new PersonaDaoImpl();
        return idao.listar();
    }

    @Override
    public Persona buscarPorid(int id) {
        IPersonaDao idao= new PersonaDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
