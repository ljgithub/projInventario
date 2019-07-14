/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import com.uisrael.inventarioproyecto.modelo.IProveedorDao;
import com.uisrael.inventarioproyecto.modelo.util.ModelEntityManager;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author JAVIER
 */
public class ProveedorDaoImpl implements IProveedorDao{

    ModelEntityManager emf;

    public ProveedorDaoImpl() throws NamingException {
        this.emf = new ModelEntityManager();
    }
    
    @Override
    public void ingresar(Proveedor m) {
        this.emf.getTransaction();
        this.emf.getManager().persist(m);
        this.emf.getTransaction().commit();
    }

    @Override
    public Proveedor actualizar(Proveedor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Proveedor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proveedor> listar(Proveedor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
