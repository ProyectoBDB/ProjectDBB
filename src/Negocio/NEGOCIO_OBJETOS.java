/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Data.Operaciones;
import Entidades.CONSULT;
import Entidades.USUARIO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class NEGOCIO_OBJETOS {
    
    private static NEGOCIO_OBJETOS instance;
    
    public static NEGOCIO_OBJETOS getInstance(){
        if(instance == null){
            instance = new NEGOCIO_OBJETOS();
        }
        return instance;
    }
    
     public ArrayList<String> getAtributosTabla(String arg) throws SQLException, Exception{
        ArrayList<String> nombres = new ArrayList();
        ArrayList<ArrayList<String>> resultado = (ArrayList<ArrayList<String>>) Operaciones.getInstance().getAtributosTablas(arg);
        for(int i = 1; i<resultado.size(); i++){
            nombres.add(resultado.get(i).get(0));
        }
        return nombres;
    }
   
   public ArrayList<String> getNombresTablas() throws SQLException, Exception{
        ArrayList<String> nombres = new ArrayList();
        ArrayList<ArrayList<String>> resultado = (ArrayList<ArrayList<String>>) Operaciones.getInstance().getNombreTablas();
        for(int i = 1; i<resultado.size(); i++){
            nombres.add(resultado.get(i).get(0));
        }
        System.out.println(""+resultado.toString());
        return nombres;
    }
    public Object obtenerRegistros(ArrayList<String> Tabla, ArrayList<String> atributos, ArrayList<String> condiciones, ArrayList<String> Funciones, ArrayList<String> orderBy) throws SQLException, Exception{
        System.out.println(" ingresa a nogocio objetos ");
        CONSULT o = new CONSULT(Tabla);
        if(atributos!=null)
            o.setAtributos(atributos);
        if(condiciones!=null)
            o.setCondiciones(condiciones);
        if(orderBy!=null)
            o.setOrderBy(orderBy);
        return Operaciones.getInstance().realizarConsulta(o);
      
        
        
       
    }
    
     public void insertarRegistro(String[] args) throws SQLException, Exception{
        String tabla = (String) args[0];
        System.out.println(""+args[1]);
          System.out.println(""+args[2]);
            System.out.println(""+args[3]);
             System.out.println(""+args[4]);
        switch (tabla) {
            case "USUARIO":
                USUARIO objusuario = new USUARIO(Integer.valueOf(args[1]), (String)args[2], (String)args[3],(String)args[4]);
                 System.out.println("hola amigo "+objusuario.getDIRECCION());
                  System.out.println("hola amigo "+objusuario.getID_USUARIO());
                Operaciones.getInstance().insertarRegistro(objusuario);
                break;
            case "AUTOR":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
                break;
            case "CATEGORIA":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
               // DataBase.getInstance().insertarRegistro(director);
                break;
            case "EDISION":
                //Pelicula pelicula = new Pelicula((String)args[1], (String)args[2], (String)args[3], (String)args[4], (String)args[5]);
                //DataBase.getInstance().insertarRegistro(pelicula);
                break;
            case "EMPLAR":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            case "LIBRO":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            default:
                break;
        }
    }
     
     public void ModificarRegistro(String[] args) throws SQLException, Exception{
        String tabla = (String) args[0];
        switch (tabla) {
            case "USUARIO":
                System.out.println(args);
                USUARIO objusuario = new USUARIO(Integer.valueOf((String)args[1]), (String)args[2], (String)args[3],(String)args[4]);
                Operaciones.getInstance().ModificarRegistro(objusuario);
                break;
            case "AUTOR":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
                break;
            case "CATEGORIA":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
               // DataBase.getInstance().insertarRegistro(director);
                break;
            case "EDISION":
                //Pelicula pelicula = new Pelicula((String)args[1], (String)args[2], (String)args[3], (String)args[4], (String)args[5]);
                //DataBase.getInstance().insertarRegistro(pelicula);
                break;
            case "EMPLAR":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            case "LIBRO":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            default:
                break;
        }
        
        
    }
     
       public void EliminarRegistro(String[] args) throws SQLException, Exception{
        String tabla = (String) args[0];
        switch (tabla) {
            case "USUARIO":
                System.out.println(args);
                USUARIO objusuario = new USUARIO(Integer.valueOf((String)args[1]), (String)args[2], (String)args[3],(String)args[4]);
                Operaciones.getInstance().elimiarRegistro(objusuario);
                break;
            case "AUTOR":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
                break;
            case "CATEGORIA":
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
               // DataBase.getInstance().insertarRegistro(director);
                break;
            case "EDISION":
                //Pelicula pelicula = new Pelicula((String)args[1], (String)args[2], (String)args[3], (String)args[4], (String)args[5]);
                //DataBase.getInstance().insertarRegistro(pelicula);
                break;
            case "EMPLAR":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            case "LIBRO":
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            default:
                break;
        }
        
        
    }
   
      public Object obtenerRegistros(ArrayList<String> nombreTabla, ArrayList<String> atributos, ArrayList<String> condiciones, ArrayList<String> orderBy) throws SQLException, Exception{
     
        CONSULT o = new CONSULT(nombreTabla);
        if(atributos!=null)
            o.setAtributos(atributos);
        if(condiciones!=null)
            o.setCondiciones(condiciones);
        
        if(orderBy!=null)
            o.setOrderBy(orderBy);
        System.err.println(""+o.toString());
       // return OperationData.ObtenerDatos().realizarConsulta(o);
        
        return Operaciones.getInstance().realizarConsulta(o);
    }
     
     
}
