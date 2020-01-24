/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Data.Conexion;
import Entidades.USUARIO_SESION;
import java.sql.SQLException;

/**
 *
 * @author danny
 */
public class NEGOCIO_SESIONES {
    
    private static NEGOCIO_SESIONES instance;
    
    public static NEGOCIO_SESIONES getInstance(){
        if(instance == null){
            instance = new NEGOCIO_SESIONES();
        }
        return instance;
    }
    
    private NEGOCIO_SESIONES(){}
    
    /*Se prueba la conexion a la base de datos para vertificar si el usuario especificado
    tiene privilegios de acceso a la base de datos especificados.*/
    public boolean IniciarSesion(String usuario, String pass) throws SQLException, Exception {
        
        USUARIO_SESION .getInstance().setUSUARIO_SESION (usuario, pass);
        new Conexion().probarConexion();
        return true;
    }
    
    
}
