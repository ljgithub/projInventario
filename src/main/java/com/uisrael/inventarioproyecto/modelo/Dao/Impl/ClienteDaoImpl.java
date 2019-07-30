/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IClienteController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Cliente;
import com.uisrael.inventarioproyecto.modelo.IClienteDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ClienteDaoImpl extends GenericaDaoImpl<Cliente> implements IClienteDao{

    @Override
    public void ingresar(Cliente m) {
        this.create(m);
        System.out.println("Cliente Creada : " + m);
    }

    @Override
    public Cliente actualizar(Cliente m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cliente m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
