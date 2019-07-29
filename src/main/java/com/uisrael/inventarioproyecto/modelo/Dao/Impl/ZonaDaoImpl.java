/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;
import com.uisrael.inventarioproyecto.modelo.IZonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ZonaDaoImpl extends GenericaDaoImpl<Zona> implements IZonaDao{

    @Override
    public void ingresar(Zona m) {
        this.create(m);
    }

    @Override
    public Zona actualizar(Zona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Zona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Zona> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Zona buscarPorid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
