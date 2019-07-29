/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.controlador.ITipoPersonaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.TipoPersonaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;


import com.uisrael.inventarioproyecto.modelo.ITipoPersonaDao;

import java.util.List;

/**
 *
 * @author JAVIER
 */
public class TipoPersonaContrImpl implements ITipoPersonaController{

    @Override
    public void ingresar(TipoPersona m) {
        ITipoPersonaDao idao= new TipoPersonaDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public TipoPersona actualizar(TipoPersona m) {
        ITipoPersonaDao idao= new TipoPersonaDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(TipoPersona m) {
        ITipoPersonaDao idao= new TipoPersonaDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<TipoPersona> listar() {
        ITipoPersonaDao idao= new TipoPersonaDaoImpl();
        return idao.listar();
    }

    @Override
    public TipoPersona buscarPorid(int id) {
        ITipoPersonaDao idao= new TipoPersonaDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
