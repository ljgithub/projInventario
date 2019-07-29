/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IDetallePedidoController;
import com.uisrael.inventarioproyecto.modelo.Entidades.DetallePedido;
import com.uisrael.inventarioproyecto.modelo.IDetallePedidoDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class DetallePedidoDaoImpl extends GenericaDaoImpl<DetallePedido>implements IDetallePedidoDao{

    @Override
    public void ingresar(DetallePedido m) {
        this.create(m);
    }

    @Override
    public DetallePedido actualizar(DetallePedido m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(DetallePedido m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetallePedido> listar() {
        return this.findAll();
    }

    @Override
    public DetallePedido buscarPorid(int id) {
        String sentencia = "select t from DetallePedido t where t.idDetalle = " +id;

        TypedQuery<DetallePedido> typed = this.entityManager.createQuery(sentencia, DetallePedido.class);
                
        DetallePedido resultado = typed.getSingleResult();
                        
        return resultado;
    }
    
    
    
}
