/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vista;

import com.uisrael.inventarioproyecto.controlador.IMPL.MarcaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMarcaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Marca;

/**
 *
 * @author Doc1
 */
public class main {

    public static void main(String [] args){
        
        Marca m = new Marca();
        m.setIdMarca(1);
        m.setDescripcionMarca("Genius");
        m.setEstadoMarca(1);
                
        IMarcaController imc =  new MarcaContrImpl();
        imc.ingresar(m);
    }
}
