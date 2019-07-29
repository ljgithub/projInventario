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
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class TipoPersonaDaoImpl extends GenericaDaoImpl<TipoPersona>implements ITipoPersonaDao{

    @Override
    public void ingresar(TipoPersona m) {
       this.create(m);
        System.out.println("Tipo Persona creado " + m);
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
    public List<TipoPersona> listar() {
        
        String sentencia = "select t from TipoPersona t";

        TypedQuery<TipoPersona> typed = this.entityManager.createQuery(sentencia, TipoPersona.class);
                
        List<TipoPersona> resultado = typed.getResultList();
                        
        return resultado;        
        
    
    }

    @Override
    public TipoPersona buscarPorid(int id) {
        String sentencia = "select t from TipoPersona t where t.idTipoPersona = " +id;

        TypedQuery<TipoPersona> typed = this.entityManager.createQuery(sentencia, TipoPersona.class);
                
        TipoPersona resultado = typed.getSingleResult();
                        
        return resultado;
    }
    
}
