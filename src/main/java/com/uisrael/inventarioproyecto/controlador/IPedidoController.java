/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import java.util.List;



/**
 *
 * @author JAVIER
 */
public interface IPedidoController {
    public void ingresar(Pedidos m);
    public Pedidos actualizar(Pedidos m);
    public void eliminar(Pedidos m);
    public List<Pedidos> listar(Pedidos m);
    
    public Pedidos buscarPorid(int id);         
}
