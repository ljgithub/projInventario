/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import com.uisrael.inventarioproyecto.modelo.IPedidoDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class PedidoDaoImpl extends GenericaDaoImpl<Pedidos>implements IPedidoDao{

    @Override
    public void ingresar(Pedidos m) {
        this.create(m);
    }

    @Override
    public Pedidos actualizar(Pedidos m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Pedidos m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedidos> listar() {
        return this.findAll();
    }

    @Override
    public Pedidos buscarPorid(int id) {
        String sentencia = "select t from Pedidos t where t.idPedido = " +id;

        TypedQuery<Pedidos> typed = this.entityManager.createQuery(sentencia, Pedidos.class);
                
        Pedidos resultado = typed.getSingleResult();
                        
        return resultado;
    }

   
    
}