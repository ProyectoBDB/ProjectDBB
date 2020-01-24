/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.USUARIO_SESION;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class Conexion {
    
     private  Connection conn = null;
     
     private static String login;
     private static String clave ;     
    //private static String login = "SUPERVISOR";
    //private static String clave = "123";
    
    //datos de la base 
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String nombreBaseDD = "ProyectoBases";
    
    private static Conexion instance = null;
    
    public static Conexion getInstance() throws SQLException {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }
   
//     public void establecerConexion() throws SQLException{
//        conexion = DriverManager.getConnection(getMySQLURL(), getLogin());
//    }
   
    public void establecerConexion() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, USUARIO_SESION.getInstance().getUsername(), USUARIO_SESION.getInstance().getPassword());
            conn.setAutoCommit(false);
    }
    
    
    // establece la conexion
//      public  void  getConnection() throws SQLException,Exception {
//    
//            
//            
//           
//    }
    
      public void probarConexion() throws SQLException, Exception{
          Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url, USUARIO_SESION.getInstance().getUsername(), USUARIO_SESION.getInstance().getPassword());
        this.finalizarConexion(null);
    }
      
      
       public void desconexion() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
       
       public void finalizarConexion(Statement stmt) throws Exception{
         try {
            if (stmt != null)
                stmt.close();
            if(this.conn!=null)
                this.conn.close();
        } catch (SQLException ex) {
             throw new Exception(ex.getMessage());
        }
     }

//    public static void main(String[] args) {
//        Conexion c = new Conexion();
//        c.getConnection();
//    }
    
    public String getNombreBD() {
        return nombreBaseDD;
    }
    
    public Connection getConexion() {
        return conn;
    }
    
}
