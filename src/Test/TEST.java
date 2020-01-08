/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entidades.USUARIO;
import Negocio.NEGOCIO_OBJETOS;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danny
 */
public class TEST {
    
    USUARIO miusuario = new USUARIO(1,"carlos","trigales","890");
    NEGOCIO_OBJETOS minegocio = new NEGOCIO_OBJETOS();
    
    public void modificar (){
        try {
            String[] args = {"AUTOR","carlos"};
            String[] argsc = {"CATEGORIA","carlos"};
            String[] argse = {"EDISION","1","ingreso tipo"};
            String[] argsl = {"LIBRO","0104301338","un nombre grande"};
            //minegocio.insertarRegistro(args);
            //minegocio.insertarRegistro(argsc);
            minegocio.insertarRegistro(argse);
             //minegocio.insertarRegistro(argsl);
            //minegocio.ModificarRegistro(args);
            System.out.println("------------------------------");
           // minegocio.EliminarRegistro(args);
        } catch (Exception ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main (String[] args){
        TEST mitest = new TEST();
        mitest.modificar();
    }
    
    
}
