/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IDetallePedidoController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.DetallePedidoDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.DetallePedido;
import com.uisrael.inventarioproyecto.modelo.IDetallePedidoDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class DetallePedidoContrImpl implements IDetallePedidoController{

    @Override
    public void ingresar(DetallePedido m) {
        IDetallePedidoDao idao= new DetallePedidoDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public DetallePedido actualizar(DetallePedido m) {
        IDetallePedidoDao idao= new DetallePedidoDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(DetallePedido m) {
        IDetallePedidoDao idao= new DetallePedidoDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<DetallePedido> listar(DetallePedido m) {
        IDetallePedidoDao idao= new DetallePedidoDaoImpl();
        return idao.listar();
    }

    @Override
    public DetallePedido buscarPorid(int id) {
        IDetallePedidoDao idao= new DetallePedidoDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
