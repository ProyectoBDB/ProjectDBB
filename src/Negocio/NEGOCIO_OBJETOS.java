/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Data.Operaciones;
import Entidades.USUARIO;
import Entidades.AUTOR;
import Entidades.CATEGORIA;
import Entidades.LIBRO;
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
    
    public Object obtenerRegistros(String Tabla) throws SQLException, Exception{
        System.out.println(" ingresa a nogocio objetos ");
        return Operaciones.getInstance().realizarConsulta(Tabla);
        
        
       
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
                // cambios realizados de autor
                AUTOR objautor = new AUTOR((String)args[1]);
                Operaciones.getInstance().insertarRegistro(objautor);
               // Director director = new Director((String)args[1], (String)args[2], (String)args[3]);
                break;
            case "CATEGORIA":
                // cambios realizados en categoria
                CATEGORIA objcategoria = new CATEGORIA((String)args[1]);
                Operaciones.getInstance().insertarRegistro(objcategoria);
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
                // cambios realizados de libro 
                LIBRO objlibro = new LIBRO((String)args[1],(String)args[2]);
                Operaciones.getInstance().insertarRegistro(objlibro);
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
   
      public Object obtenerRegistros(String nombreTabla, ArrayList<String> atributos, ArrayList<String> condiciones, ArrayList<String> orderBy) throws SQLException, Exception{
     
       
        
        return Operaciones.getInstance().realizarConsulta(nombreTabla);
    }
     
     
}
