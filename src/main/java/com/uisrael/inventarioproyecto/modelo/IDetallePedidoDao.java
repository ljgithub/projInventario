/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.DetallePedido;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IDetallePedidoDao
{
    public void ingresar(DetallePedido m);
    public DetallePedido actualizar(DetallePedido m);
    public void eliminar(DetallePedido m);
    public List<DetallePedido> listar();
    
    public DetallePedido buscarPorid(int id);         
}
