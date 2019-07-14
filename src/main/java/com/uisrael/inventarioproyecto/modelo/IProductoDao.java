/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.Producto;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IProductoDao {
    public void ingresar(Producto m);
    public Producto actualizar(Producto m);
    public void eliminar(Producto m);
    public List<Producto> listar(Producto m);
}
