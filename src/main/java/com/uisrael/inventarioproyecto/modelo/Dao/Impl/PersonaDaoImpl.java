/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import com.uisrael.inventarioproyecto.modelo.IPersonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class PersonaDaoImpl extends GenericaDaoImpl<Usuario> implements IPersonaDao{

    @Override
    public void ingresar(Usuario m) {
        this.create(m);
        System.out.println("Persona Creada : " + m);
    }

    @Override
    public Usuario actualizar(Usuario m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Usuario m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscarPorid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
