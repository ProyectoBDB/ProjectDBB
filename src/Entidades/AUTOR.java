/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author danny
 */
public class AUTOR {
    private int ID_AUTOR;
     private String NOMBRE;
     
     
     public AUTOR(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
     
    

  

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

   
     
     
     
    
}
