/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vista;

import com.uisrael.inventarioproyecto.controlador.IMPL.TipoPersonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.ITipoPersonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoPersona;


/**
 *
 * @author Doc1
 */
public class main {

    public static void main(String [] args){
        
        TipoPersona tipoPersona = new TipoPersona();
        tipoPersona.setDescripcion("Usuario");
        tipoPersona.setEstado(1);
        
        ITipoPersonaController itc = new TipoPersonaContrImpl();
        itc.ingresar(tipoPersona);
        
    }
}
