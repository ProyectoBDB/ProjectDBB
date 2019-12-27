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
public class PEDIR_EJEMPLAR {
    private int ID_USUARIO;
    private int ID_EJEMPLAR;
    private int ID_EDISION;
    private int ID_LIBRO;
    private String ESTADO;
    private int  NUMERO_DIAS_PRESTAMO;
    private String FECHA_PRESTAMO;

    public PEDIR_EJEMPLAR(int ID_USUARIO, int ID_EJEMPLAR, int ID_EDISION, int ID_LIBRO, String ESTADO, int NUMERO_DIAS_PRESTAMO, String FECHA_PRESTAMO) {
        this.ID_USUARIO = ID_USUARIO;
        this.ID_EJEMPLAR = ID_EJEMPLAR;
        this.ID_EDISION = ID_EDISION;
        this.ID_LIBRO = ID_LIBRO;
        this.ESTADO = ESTADO;
        this.NUMERO_DIAS_PRESTAMO = NUMERO_DIAS_PRESTAMO;
        this.FECHA_PRESTAMO = FECHA_PRESTAMO;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public int getID_EJEMPLAR() {
        return ID_EJEMPLAR;
    }

    public void setID_EJEMPLAR(int ID_EJEMPLAR) {
        this.ID_EJEMPLAR = ID_EJEMPLAR;
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

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getNUMERO_DIAS_PRESTAMO() {
        return NUMERO_DIAS_PRESTAMO;
    }

    public void setNUMERO_DIAS_PRESTAMO(int NUMERO_DIAS_PRESTAMO) {
        this.NUMERO_DIAS_PRESTAMO = NUMERO_DIAS_PRESTAMO;
    }

    public String getFECHA_PRESTAMO() {
        return FECHA_PRESTAMO;
    }

    public void setFECHA_PRESTAMO(String FECHA_PRESTAMO) {
        this.FECHA_PRESTAMO = FECHA_PRESTAMO;
    }
    
    
    
}
