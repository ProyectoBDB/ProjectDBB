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
     private String NOMBRE;
     private int ID_AUTOR;
     
     public AUTOR(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
     
    public AUTOR(String NOMBRE, int ID_AUTOR) {
        this.NOMBRE = NOMBRE;
        this.ID_AUTOR = ID_AUTOR;
    }

    public int getID_AUTOR() {
        return ID_AUTOR;
    }

    public void setID_AUTOR(int ID_AUTOR) {
        this.ID_AUTOR = ID_AUTOR;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

   
     
     
     
    
}
