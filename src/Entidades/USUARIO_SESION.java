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
public class USUARIO_SESION {
    
     private String username;
    private String password;

    private static USUARIO_SESION instance;
    
    public static USUARIO_SESION  getInstance(){
        if (instance == null){
            instance = new USUARIO_SESION ();
        }
        return instance;
    }
    
    public USUARIO_SESION (){}

    public USUARIO_SESION (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUSUARIO_SESION (String username, String password) {
        this.username = username;
        this.password = password;
    }
 
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UsuarioSesion{" + "username=" + username + ", password=" + password + '}';
    }
    
    
    
}
