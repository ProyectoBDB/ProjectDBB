/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
/**
 *
 * @author Daniel
 */
public class CONSULT {
    
    private String nombreTabla;
    private ArrayList<String> atributos;
    private ArrayList<String> condiciones;
    private ArrayList<String> orderBy;

    public CONSULT(String nombreTabla){
        this.atributos = new ArrayList();
        this.condiciones = new ArrayList();
        this.orderBy = new ArrayList();
        this.nombreTabla = nombreTabla;
    }
    
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(ArrayList<String> condiciones) {
        this.condiciones = condiciones;
    }
    
    public void addCondicion(String condicion){
        this.condiciones.add(condicion);
    }
    
    public void addAtributos(String atributo){
        this.atributos.add(atributo);
    }

    public ArrayList<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(ArrayList<String> orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return "Consulta{" + "nombreTabla=" + nombreTabla + ", atributos=" + atributos.toString() 
                + ", condiciones=" + condiciones.toString() 
                + ", orderBy=" + orderBy.toString() + '}';
    }
    
    
    
}
