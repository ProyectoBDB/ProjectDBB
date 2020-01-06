/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.CONSULT;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class OperacionesSQL {
      public static String insertarRegistro(Object obj) throws Exception {
           System.out.println("familia capa desnuda ");
        String consulta = "INSERT INTO "+ nombreClase(obj)+ " " +
                "(" + getAtributosValores(obj)[0] + ")" + " " +
                "VALUES (" + getAtributosValores(obj)[1] + ")";
        System.out.println(consulta);
        return consulta;
    }
      
    public static String modificarRegistro(Object obj) throws Exception {
        String consulta = "UPDATE "+ nombreClase(obj)+ " SET " + getAtributosValoresModificar(obj) [0] + " " +
                "WHERE " + getAtributosValoresModificar(obj)[1] ;
        System.out.println(consulta);
        return consulta;
    }
    
    public static String eliminarRegistro(Object obj) throws Exception {
        String consulta = "DELETE FROM "+ nombreClase(obj)+ " WHERE " + getAtributosValoresModificar(obj)[1] ;
        System.out.println(consulta);
        return consulta;
    }
     
   private static String nombreClase(Object o){
        return o.getClass().getSimpleName();
    }
    
     private static String[] getAtributosValores(Object o) throws Exception{
        String valores = "'";
        String atributos = "";
         System.out.println("ingresa a valores  ");
        try {
            //Atributos del objeto
            int i = 0;
            for(Field f : o.getClass().getDeclaredFields()){
                  System.out.println(" campos : "+f);
                i++;
                f.setAccessible(true);
                if(i != o.getClass().getDeclaredFields().length)
                    atributos=atributos + f.getName() + ",";
                else
                    atributos=atributos + f.getName() ;
            }
            System.out.println(" attr : "+atributos);
            //Valores del objeto
            i = 0;
            for(Field f : o.getClass().getDeclaredFields()){
                    i++;
                    f.setAccessible(true);
                     //System.out.println(" campos  values: "+o.getClass().getDeclaredFields());
                    System.out.println(" campos  values: "+f.get(o));
                    if(i != o.getClass().getDeclaredFields().length){
                        valores=valores + f.get(o) + "','";
                        System.out.println(" attr values fg  in : "+valores);
                    }else{
                        valores=valores +  f.get(o) + "'";}
            }
           System.out.println(" attr values  fin : "+valores);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new Exception("Error con los atributos del objeto.");
        }
        
        String[] args = {atributos,valores};
        System.out.println(args.toString());
        return args;
    }
     
    private static String[] getAtributosValoresModificar(Object o) throws Exception{
        String valores = "'";
         String IDatr ="";
        String atributos = "";
         System.out.println("ingresa a valores  ");
        try {
            //Atributos del objeto
            int i = 0;
            for(Field f : o.getClass().getDeclaredFields()){
                  System.out.println(" campos : "+f);
                i++;
                f.setAccessible(true);
                if(i != o.getClass().getDeclaredFields().length)
                    atributos=atributos + f.getName() +" = "+"'"+f.get(o)+ "'"+",";
                else
                    atributos=atributos + f.getName()+" = "+"'"+f.get(o) + "'";
            }
             System.out.println(" ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; ");
            String[] parts = atributos.split(",");
            System.out.println(parts[0]);
            System.out.println(" attr : "+atributos);
            IDatr = parts[0];
            //Valores del objeto
            
    
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new Exception("Error con los atributos del objeto.");
        }
        
        String[] args = {atributos,IDatr};
        System.out.println(args.toString());
        return args;
    }
    
     static String getRegistrosConsulta(CONSULT o) {
        
        // System.out.println("ingresa en getRegistrosConsulta   pura  "+o+"   varlo de atributos"+atributos);
         String consulta;
        ArrayList<String> nombreTabla = o.getNombreTablas();
        ArrayList<String> columnas = o.getAtributos();
        ArrayList<String> condiciones = o.getCondiciones();
        ArrayList<String> orderBy = o.getOrderBy();
        
        
        consulta = "SELECT ";
       
           //System.out.println("SQL"+columnas.toString());
           System.out.println("frontera 1");
        if(columnas != null && !columnas.isEmpty()){
            for(int i = 0; i<columnas.size(); i++){
                if(i+1 != columnas.size())
                    consulta = consulta + columnas.get(i) + ",";
                else
                    consulta = consulta + columnas.get(i);
            }
        }else{
            consulta = consulta + "*";
        }
        System.out.println(consulta);
         consulta = consulta + " FROM " + nombreTabla;
        if(condiciones!=null && !condiciones.isEmpty()){
            consulta = consulta + " WHERE ";
            for (String condicione : condiciones) {
                consulta = consulta + condicione;
            }
        }
        
          
       
        //consulta = consulta + " FROM " + nombreTabla;
           if(orderBy!=null && !orderBy.isEmpty()){
            consulta = consulta + " ORDER BY " + orderBy.get(0) + " " + orderBy.get(1);
        }
        
        //consulta = consulta + ";";
        System.out.println(consulta);
        
       
        
        
        //consulta = consulta + ";";
        System.out.println(consulta);
        return consulta;
    }//fin
     
      /*Obtener el nombre de las tablas de la base de datos especificada*/
    public static String getNombreTablas() throws SQLException{
        return "select table_name from user_tables order by table_name";
    }
    
    /*Obtiene los atriburos de una tabla*/
    public static String getAtributosTabla(String nombreTabla) throws SQLException{
        return "SELECT " +"COLUMN_NAME" + " FROM " + "user_tab_cols "
                + "WHERE "  + " TABLE_NAME = '"+nombreTabla+"'";
    }
   
    
     
       
}
