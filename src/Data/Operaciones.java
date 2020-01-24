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
            Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
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
            System.out.println("==========="+resultado+"esto es :)");
            return resultado;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
    public void insertarRegistro(Object o) throws Exception {
        
        Statement stmt = null;
        try {
            System.out.println("llega a data familia");
            String consulta = OperacionesSQL.insertarRegistro(o);    
             System.out.println(""+consulta);
             Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
            Conexion.getInstance().getConexion().commit();
        } catch (SQLException ex) {
              Conexion.getInstance().getConexion().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    } 
     public void ModificarRegistro(Object o) throws Exception {
        
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.modificarRegistro(o);    
           Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
            Conexion.getInstance().getConexion().commit();
        } catch (SQLException ex) {
            Conexion.getInstance().getConexion().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
    
      public void elimiarRegistro(Object o) throws Exception{
        Statement stmt = null;
        try {
            //Conexion.getInstance().establecerConexion();
            String consulta = OperacionesSQL.eliminarRegistro(o);
            Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
            Conexion.getInstance().getConexion().commit();
        } catch (SQLException ex) {
             Conexion.getInstance().getConexion().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
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
          
          Conexion.getInstance().establecerConexion();
           sentencia = Conexion.getInstance().getConexion().createStatement();
           sentencia.executeUpdate(consulta);
           
            
        } catch (SQLException e){
            System.out.println(e);
            
            throw new Exception (e.getMessage());
        }finally {
            Conexion.getInstance().finalizarConexion(sentencia);
        }
        
       
   }
      
      
      public void EliminarDatos(Object obj) throws Exception{
       
       
          Statement sentencia = null;
        
        try {
            
           String consulta = OperacionesSQL.eliminarDatos(obj);
          Conexion.getInstance().establecerConexion();
          Conexion.getInstance().establecerConexion();
           sentencia = Conexion.getInstance().getConexion().createStatement();
           sentencia.executeUpdate(consulta);
           
            
        } catch (SQLException e){
            System.out.println(e);
            
            throw new Exception (e.getMessage());
        }finally {
            Conexion.getInstance().finalizarConexion(sentencia);
        }
    }
      
      
      public void registrarUsuario(Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.crearUsuario(o);
            Conexion.getInstance().establecerConexion();
            Conexion.getInstance().getConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
      
      public Object getUsuariosSQL() throws Exception{
        String consulta = OperacionesSQL.getUsuariosSQL();
        return consultarBD(consulta);
    }
      
    
   public Object obtenerPrivilegios(String nombreUsuario) throws SQLException, Exception{
        String consulta = OperacionesSQL.getPrivilegios(nombreUsuario);
        ArrayList<ArrayList<String>> comandos = (ArrayList<ArrayList<String>>) this.consultarBD(consulta);
        System.out.println(comandos+" \n  en obtener privilegios");
        ArrayList<String> privilegios = new ArrayList();
        for(int i=1; i<comandos.size();i++){
            String comando = comandos.get(i).get(0);
            String privilegio = "";
            for(int j = 6; j<comando.indexOf("ON")-1;j++)
                privilegio=privilegio+comando.charAt(j);
            if("ALL PRIVILEGES, SELECT, INSERT, UPDATE, DELETE".contains(privilegio)){
                String total = "";
                for(int j = 6; j<comando.indexOf("TO")-1;j++)
                    total=total+comando.charAt(j);
                privilegios.add(total);
            }
        }
        return privilegios;
    }
   
   public void asignarTodosPrivilegios(Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.asignarTodosPrivilegios((String) o);
            System.out.println(consulta);
            Conexion.getInstance().establecerConexion();
            Conexion.getInstance().getConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
   
   public void asignarPrivilegiosConn(Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.asignarPermisoParaConn((String) o);
            System.out.println(consulta);
            Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
   
    public void agregarPrivilegio(Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.agregarPrivilegio(o);
            Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
    
    public void removerPrivilegio(Object o) throws Exception{
        Statement stmt = null;
        try {
            String consulta = OperacionesSQL.removerPrivilegio(o);
            Conexion.getInstance().establecerConexion();
            stmt = Conexion.getInstance().getConexion().createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            Conexion.getInstance().finalizarConexion(stmt);
        }
    }
      
      
}
