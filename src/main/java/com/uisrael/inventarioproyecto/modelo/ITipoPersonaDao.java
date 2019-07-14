/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo;

import com.uisrael.inventarioproyecto.controlador.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface ITipoPersonaDao {
    public void ingresar(TipoPersona m);
    public TipoPersona actualizar(TipoPersona m);
    public void eliminar(TipoPersona m);
    public List<TipoPersona> listar(TipoPersona m);
}
