/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class LIBRO_AUTOR {
    private int ID_LIBRO;
    private int ID_AUTOR;
    
    public LIBRO_AUTOR(int ID_AUTOR) {
        this.ID_AUTOR = ID_AUTOR;
    }
    
    public LIBRO_AUTOR(int ID_LIBRO, int ID_AUTOR) {
        this.ID_LIBRO = ID_LIBRO;
        this.ID_AUTOR = ID_AUTOR;
    }

    public void setID_LIBRO(int ID_LIBRO) {
        this.ID_LIBRO = ID_LIBRO;
    }

    public void setID_AUTOR(int ID_AUTOR) {
        this.ID_AUTOR = ID_AUTOR;
    }

    public int getID_LIBRO() {
        return ID_LIBRO;
    }

    public int getID_AUTOR() {
        return ID_AUTOR;
    }

    
    
            
}
