/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vista;

import com.uisrael.inventarioproyecto.controlador.IMPL.RolContrImpl;
import com.uisrael.inventarioproyecto.controlador.IRolController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Rol;


/**
 *
 * @author Doc1
 */
public class main {

    public static void main(String [] args){
        
     Rol rol = new Rol();
     rol.setDescripcionRol("Administrador");
     rol.setEstado(1);
     
        IRolController controllerRol = new RolContrImpl();
        controllerRol.ingresar(rol);
     
        
    }
}
