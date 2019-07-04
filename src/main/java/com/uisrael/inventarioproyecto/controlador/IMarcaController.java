/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Marca;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IMarcaController {
    public void ingresar(Marca m);
    public Marca actualizar(Marca m);
    public void eliminar(Marca m);
    public List<Marca> listar(Marca m);
}
