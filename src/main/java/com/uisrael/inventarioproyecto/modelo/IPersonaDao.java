/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.Persona;
import java.util.List;


/**
 *
 * @author JAVIER
 */
public interface IPersonaDao {
    public void ingresar(Persona m);
    public Persona actualizar(Persona m);
    public void eliminar(Persona m);
    public List<Persona> listar(Persona m);
}
