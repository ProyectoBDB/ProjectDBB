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
public class EDISION {
    private int ID_EDISION;
    private int ID_LIBRO;
    private String ANIO;

    public EDISION(int ID_LIBRO, String TIPO) {
        this.ID_LIBRO = ID_LIBRO;
        this.ANIO = TIPO;
    }

    public EDISION(int ID_EDISION, int ID_LIBRO, String TIPO) {
        this.ID_EDISION = ID_EDISION;
        this.ID_LIBRO = ID_LIBRO;
        this.ANIO = TIPO;
    }

    public int getID_EDISION() {
        return ID_EDISION;
    }

    public void setID_EDISION(int ID_EDISION) {
        this.ID_EDISION = ID_EDISION;
    }

    public int getID_LIBRO() {
        return ID_LIBRO;
    }

    public void setID_LIBRO(int ID_LIBRO) {
        this.ID_LIBRO = ID_LIBRO;
    }

    public String getANIO() {
        return ANIO;
    }

    public void setANIO(String ANIO) {
        this.ANIO = ANIO;
    }
    
    
}
