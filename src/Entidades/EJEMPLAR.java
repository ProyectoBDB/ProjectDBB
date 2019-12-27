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
public class EJEMPLAR {
    private int ID_EJEMPLAR;
    private int ID_EDISION;
    private int ID_LIBRO;
    private int NUMERO_HOJAS;
    private String ESTADO_CONSERVACION;
    private String UBICACION;
    private String FECHA_COMPRA;

    public EJEMPLAR(int ID_EJEMPLAR, int ID_EDISION, int ID_LIBRO, int NUMERO_HOJAS, String ESTADO_CONSERVACION, String UBICACION, String FECHA_COMPRA) {
        this.ID_EJEMPLAR = ID_EJEMPLAR;
        this.ID_EDISION = ID_EDISION;
        this.ID_LIBRO = ID_LIBRO;
        this.NUMERO_HOJAS = NUMERO_HOJAS;
        this.ESTADO_CONSERVACION = ESTADO_CONSERVACION;
        this.UBICACION = UBICACION;
        this.FECHA_COMPRA = FECHA_COMPRA;
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

    public int getNUMERO_HOJAS() {
        return NUMERO_HOJAS;
    }

    public void setNUMERO_HOJAS(int NUMERO_HOJAS) {
        this.NUMERO_HOJAS = NUMERO_HOJAS;
    }

    public String getESTADO_CONSERVACION() {
        return ESTADO_CONSERVACION;
    }

    public void setESTADO_CONSERVACION(String ESTADO_CONSERVACION) {
        this.ESTADO_CONSERVACION = ESTADO_CONSERVACION;
    }

    public String getUBICACION() {
        return UBICACION;
    }

    public void setUBICACION(String UBICACION) {
        this.UBICACION = UBICACION;
    }

    public String getFECHA_COMPRA() {
        return FECHA_COMPRA;
    }

    public void setFECHA_COMPRA(String FECHA_COMPRA) {
        this.FECHA_COMPRA = FECHA_COMPRA;
    }
    
    
    
    
    

}
