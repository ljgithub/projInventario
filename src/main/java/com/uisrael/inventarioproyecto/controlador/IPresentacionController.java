/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Presentacion;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IPresentacionController {
    public void ingresar(Presentacion m);
    public Presentacion actualizar(Presentacion m);
    public void eliminar(Presentacion m);
    public List<Presentacion> listar(Presentacion m);
}
