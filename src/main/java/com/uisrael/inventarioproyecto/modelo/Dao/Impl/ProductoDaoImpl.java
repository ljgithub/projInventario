/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;

import com.uisrael.inventarioproyecto.modelo.Entidades.Producto;
import com.uisrael.inventarioproyecto.modelo.IProductoDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ProductoDaoImpl extends GenericaDaoImpl<Producto>implements IProductoDao{

    public ProductoDaoImpl() {
    }

    public ProductoDaoImpl(Class<Producto> entityClass) {
        super(entityClass);
    }
    
    @Override
    public void ingresar(Producto m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto actualizar(Producto m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> listar() {
        return this.findAll();
    }

    @Override
    public Producto buscarPorid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
