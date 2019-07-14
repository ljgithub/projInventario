/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;
import com.uisrael.inventarioproyecto.modelo.ITipoPersonaDao;
import com.uisrael.inventarioproyecto.modelo.util.ModelEntityManager;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author JAVIER
 */
public class TipoPersonaDaoImpl implements ITipoPersonaDao{

    ModelEntityManager emf = new ModelEntityManager();

  
    @Override
    public void ingresar(TipoPersona m) {
        emf.getTransaction().begin();
        emf.getManager().persist(m);
        emf.getTransaction().commit();
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
