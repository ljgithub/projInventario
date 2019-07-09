/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IMarcaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.MarcaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Marca;
import com.uisrael.inventarioproyecto.modelo.IMarcaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class MarcaContrImpl implements IMarcaController{

    @Override
    public void ingresar(Marca m) {
        try {
            IMarcaDao dao = new MarcaDaoImpl();
            dao.ingresar(m);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public Marca actualizar(Marca m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Marca m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Marca> listar(Marca m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
