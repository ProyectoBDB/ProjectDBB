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
public class LIBRO {
    private int ID_LIBRO;
    private String ISBN;
    private String NOMBRE;
    private int ID_CATEGORIA;

    public LIBRO(String ISBN, String NOMBRE, int ID_CATEGORIA) {
        this.ISBN = ISBN;
        this.NOMBRE = NOMBRE;
        this.ID_CATEGORIA = ID_CATEGORIA;
    }

    public LIBRO(int ID_LIBRO, String ISBN, String NOMBRE) {
        this.ID_LIBRO = ID_LIBRO;
        this.ISBN = ISBN;
        this.NOMBRE = NOMBRE;
    }

    public int getID_LIBRO() {
        return ID_LIBRO;
    }

    public void setID_LIBRO(int ID_LIBRO) {
        this.ID_LIBRO = ID_LIBRO;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setID_CATEGORIA(int ID_CATEGORIA) {
        this.ID_CATEGORIA = ID_CATEGORIA;
    }

    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }
    
    
    
}
