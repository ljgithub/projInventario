/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.ITipoPersonaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.TipoPersonaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;
import com.uisrael.inventarioproyecto.modelo.ITipoPersonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class TipoPersonaContrImpl implements ITipoPersonaController {

    @Override
    public void ingresar(TipoPersona m) {
        try {
            ITipoPersonaDao dao = new TipoPersonaDaoImpl();
            dao.ingresar(m);
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }

    }

    @Override
    public TipoPersona actualizar(TipoPersona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(TipoPersona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoPersona> listar(TipoPersona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
