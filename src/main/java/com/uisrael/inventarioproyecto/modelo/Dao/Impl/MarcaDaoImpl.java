/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.Marca;
import com.uisrael.inventarioproyecto.modelo.IMarcaDao;
import com.uisrael.inventarioproyecto.modelo.util.ModelEntityManager;
import java.util.List;
import java.util.logging.LogManager;

/**
 *
 * @author JAVIER
 */
public class MarcaDaoImpl implements IMarcaDao{

    ModelEntityManager model = new ModelEntityManager();
    
    @Override
    public void ingresar(Marca m) {
        try {
            model.getTransaction().begin();
            model.getManager().persist(m);
            model.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Se ha producido un inconveniente al momento de insertar la Marca");
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
