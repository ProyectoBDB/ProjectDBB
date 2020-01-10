/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.CONSULT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Operaciones {
    
     private static Operaciones instance = null;
    
    public static Operaciones getInstance() throws SQLException {
        if (instance == null) {
            instance = new Operaciones();
        }
        return instance;
    }
    
    public Object realizarConsulta(CONSULT cons) throws Exception {
        System.out.println("realizar  consulta en Datos Operaciones "+cons);
        String consulta = OperacionesSQL.getRegistrosConsulta(cons);
        ArrayList<ArrayList<String>> datos;
        datos = (ArrayList<ArrayList<String>>) consultarBD(consulta);
        return datos;
    }
    
     public Object realizarConsultaJoin(CONSULT cons) throws Exception {
        System.out.println("realizar  consulta en Datos Operaciones "+cons);
        String consulta = OperacionesSQL.getRegistrosConsultaJoin(cons);
        ArrayList<ArrayList<String>> datos;
        datos = (ArrayList<ArrayList<String>>) consultarBD(consulta);
        return datos;
    }
    
     private Object consultarBD(String consulta) throws Exception {
        Statement stmt = null;
        ArrayList<ArrayList<String>> resultado = new ArrayList<>();
        try{
            Conexion.getInstance().getConnection();
            stmt = Conexion.getConnection().createStatement();
            ResultSet respuesta = stmt.executeQuery(consulta);
           // System.out.println("gggggg"+respuesta.getMetaData().getColumnCount());
            //Cabecera
            
            ArrayList<String> cabecera = new ArrayList<>();
            int numeroColumnas = respuesta.getMetaData().getColumnCount();
            for (int i = 0; i < numeroColumnas; i++)
                cabecera.add(respuesta.getMetaData().getColumnName(i + 1));
            resultado.add(cabecera);
            
            
            //Armar el ArrayList con el resultado
            int numCols = respuesta.getMetaData().getColumnCount();
            ArrayList<String> columna;
            while (respuesta.next()) {
                columna = new ArrayList<>();
                for (int i = 0; i < numCols; i++)
                    columna.add(respuesta.getString(i + 1));
                    //System.out.println("===========");
                resultado.add(columna);
            }
            System.out.println("==========="+resultado);
            return resultado;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().desconexion();
        }
    }
    public void insertarRegistro(Object o) throws Exception {
        
        Statement stmt = null;
        try {
            System.out.println("llega a data familia");
            String consulta = OperacionesSQL.insertarRegistro(o);    
             System.out.println(""+consulta);
            stmt = Conexion.getConnection().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().desconexion();
        }
    }
    
     public void ModificarRegistro(Object o) throws Exception {
        
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.modificarRegistro(o);    
           
            stmt = Conexion.getConnection().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().desconexion();
        }
    }
    
      public void elimiarRegistro(Object o) throws Exception{
        Statement stmt = null;
        try {
            //Conexion.getInstance().establecerConexion();
            String consulta = OperacionesSQL.eliminarRegistro(o);
            stmt = Conexion.getConnection().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().desconexion();
        }
    }
    /*Se establece la conexion a la BD para luego modificar un registro segun el 
    objeto sin modificar y el nuevo objeto modificado, luego se finaliza la conexion*/
    /*public void modificarRegistro(Object oA, Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = Sentencia.modificarRegistro(oA,o);
            System.out.println(consulta);
            ConexionBD.getInstance().establecerConexion();
            stmt = ConexionBD.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            ConexionBD.getInstance().finalizarConexion(stmt);
        }
    }*/
    
    /*Se establece la conexion a la BD para luego eliminar un registro segun el 
    objeto recibido, luego se finaliza la conexion*/
   /* public void elimiarRegistro(Object o) throws Exception{
        Statement stmt = null;
        try {
            ConexionBD.getInstance().establecerConexion();
            String consulta = Sentencia.eliminarRegistro(o);
            stmt = ConexionBD.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            ConexionBD.getInstance().finalizarConexion(stmt);
        }
    }*/
     
      public Object getNombreTablas() throws Exception{
        String consulta = OperacionesSQL.getNombreTablas();
        return consultarBD(consulta);
    }
      
      public Object getAtributosTablas(Object o) throws Exception{
        String consulta = OperacionesSQL.getAtributosTabla((String) o);
        System.out.println(" entra al metodo getAtributos ");
        return consultarBD(consulta);
    }
      
      
      
      // XD
      public void ActualizarDatos(Object obj) throws Exception{
       
       
          Statement sentencia = null;
        
        try {
            
           String consulta = OperacionesSQL.actualizarDatos(obj);
          
          // Conexion.getInstance().ConectarDB();
           sentencia = Conexion.getConnection().createStatement();
           sentencia.executeUpdate(consulta);
           
            
        } catch (SQLException e){
            System.out.println(e);
            
            throw new Exception (e.getMessage());
        }finally {
            Conexion.getInstance().desconexion();
        }
        
       
   }
      
      
      public void EliminarDatos(Object obj) throws Exception{
       
       
          Statement sentencia = null;
        
        try {
            
           String consulta = OperacionesSQL.eliminarDatos(obj);
          
          // Conexion.getInstance().ConectarDB();
           sentencia = Conexion.getConnection().createStatement();
           sentencia.executeUpdate(consulta);
           
            
        } catch (SQLException e){
            System.out.println(e);
            
            throw new Exception (e.getMessage());
        }finally {
            Conexion.getInstance().desconexion();
        }
    }
      
}
