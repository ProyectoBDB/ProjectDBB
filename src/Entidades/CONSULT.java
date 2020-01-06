/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CONSULT {
    
    private ArrayList<String> NombreTablas;
    //private String nombreTabla;
    private ArrayList<String> atributos;
    private ArrayList<String> condiciones;
    private ArrayList<String> orderBy;

    public CONSULT(ArrayList<String> Tablas){
        this.atributos = new ArrayList();
        this.condiciones = new ArrayList();
        this.orderBy = new ArrayList();
         this.NombreTablas = new ArrayList();
        this.NombreTablas = Tablas;
    }
    
     public ArrayList<String> getNombreTablas() {
        return NombreTablas;
    }

    public void setNombreTablas(ArrayList<String> NombreTablas) {
        this.NombreTablas = NombreTablas;
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
        return "Consulta{" + "nombreTabla=" + NombreTablas.toString() + ", atributos=" + atributos.toString() 
                + ", condiciones=" + condiciones.toString() 
                + ", orderBy=" + orderBy.toString() + '}';
    }
    
    
    
}
