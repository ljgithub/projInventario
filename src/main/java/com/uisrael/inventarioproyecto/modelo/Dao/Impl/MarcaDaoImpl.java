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
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author JAVIER
 */
public class MarcaDaoImpl implements IMarcaDao{

    ModelEntityManager model;

      //1.- Creamos en ManagerFactory
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Inventario_Proj_PU");                                                                               
            //2.- Creamos en EntityManager
            EntityManager em = emf.createEntityManager();
            //3.- Creamos la transacción es decir el objeto que conlleva la transaccion (EntityTransaction)
            EntityTransaction et = em.getTransaction();
    
    @Override
    public void ingresar(Marca m) {
        try {
            /**
             * Iniciamos primero la transacción
             */
            et.begin();
            /**
             * Luego Guardamos pero con el MANAGER  
             */
            em.persist(m);
            /**
             * Y ultimo paso nos aseguramos que el cambio realizado se encuentre en base de datos
             * con la TRANSACCION
             */
            et.commit();
            
            System.out.println("DAO:  Se inserto Colaborador con los siguientes params " + m);
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
