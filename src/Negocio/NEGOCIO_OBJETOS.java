/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Data.Operaciones;
import Entidades.CONSULT;
import Entidades.USUARIO;
import Entidades.AUTOR;
import Entidades.CATEGORIA;
import Entidades.EDISION;
import Entidades.EJEMPLAR;
import Entidades.LIBRO;
import Entidades.LIBRO_AUTOR;
import Entidades.PEDIR_EJEMPLAR;
import Entidades.USUARIO_SESION;
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
    
     public Object obtenerRegistrosJoin(ArrayList<String> Tabla, ArrayList<String> atributos, ArrayList<String> condiciones, ArrayList<String> Funciones, ArrayList<String> orderBy) throws SQLException, Exception{
        System.out.println(" ingresa a nogocio objetos ");
        CONSULT o = new CONSULT(Tabla);
        if(atributos!=null)
            o.setAtributos(atributos);
        if(condiciones!=null)
            o.setCondiciones(condiciones);
        if(orderBy!=null)
            o.setOrderBy(orderBy);
        return Operaciones.getInstance().realizarConsultaJoin(o);
      
        
        
       
    }
    
     public void insertarRegistro(String[] args) throws SQLException, Exception{
        String tabla = (String) args[0];
//        System.out.println(""+args[1]);
//          System.out.println(""+args[2]);
//            System.out.println(""+args[3]);
//             System.out.println(""+args[4]);
        switch (tabla) {
            case "USUARIO":
                USUARIO objusuario = new USUARIO(args[1], (String)args[2], (String)args[3],(String)args[4],(String)args[5]);
                 System.out.println("hola amigo "+objusuario.getDIRECCION());
                  System.out.println("hola amigo "+objusuario.getID_USUARIO());
                Operaciones.getInstance().insertarRegistro(objusuario);
                break;
            case "AUTOR":
                // cambios realizados de autor
                AUTOR objautor = new AUTOR((String)args[1]);
                System.out.println("hola amigo "+objautor.getNOMBRE());
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
                EDISION objedision = new EDISION(Integer.parseInt((String)args[1]),(String)args[2]);
                Operaciones.getInstance().insertarRegistro(objedision);
                //Pelicula pelicula = new Pelicula((String)args[1], (String)args[2], (String)args[3], (String)args[4], (String)args[5]);
                //DataBase.getInstance().insertarRegistro(pelicula);
                break;
            case "EJEMPLAR":
                //int ID_EDISION, int ID_LIBRO, int NUMERO_HOJAS, String ESTADO_CONSERVACION, String UBICACION, String FECHA_COMPRA, String ESTADO)
                EJEMPLAR objemplar = new EJEMPLAR(Integer.parseInt((String)args[1]),Integer.parseInt((String)args[2]),Integer.parseInt((String)args[3]),(String)args[4],(String)args[5],(String)args[6],Integer.parseInt((String)args[7]));
                Operaciones.getInstance().insertarRegistro(objemplar);
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            case "LIBRO":
                // cambios realizados de libro 
                LIBRO objlibro = new LIBRO((String)args[1],(String)args[2],Integer.parseInt(args[3]));
                Operaciones.getInstance().insertarRegistro(objlibro);
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;
            case "LIBRO_AUTOR":
                // cambios realizados de libro 
                LIBRO_AUTOR objLibroAutor = new LIBRO_AUTOR(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
                Operaciones.getInstance().insertarRegistro(objLibroAutor);
                //Personaje produccion = new Personaje((String)args[1], (String)args[2], (String)args[3], (String)args[4]);
                //DataBase.getInstance().insertarRegistro(produccion);
                break;  
            
            case "PEDIR_EJEMPLAR":
                
                PEDIR_EJEMPLAR objPerdirEjemplar = new PEDIR_EJEMPLAR(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]),(String)(args[5]),Integer.parseInt(args[6]) ,(String)args[7], (String)args[8]);
                Operaciones.getInstance().insertarRegistro(objPerdirEjemplar);
            default:
                break;
        }
    }
     
     public void ModificarRegistro(String[] args) throws SQLException, Exception{
        String tabla = (String) args[0];
        switch (tabla) {
            case "USUARIO":
                System.out.println(args);
                USUARIO objusuario = new USUARIO((String)args[1], (String)args[2], (String)args[3],(String)args[4],(String)args[4]);
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
                USUARIO objusuario = new USUARIO((String)args[1], (String)args[2], (String)args[3],(String)args[4],(String)args[5]);
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
     
      
      
    // XD  
    public void actualizarCampos(ArrayList<String> nombreTabla, ArrayList<String> atributos, ArrayList<String> condiciones)throws SQLException, Exception{
       
       CONSULT c = new CONSULT(nombreTabla);
       if(atributos!=null)
            c.setAtributos(atributos);
        if(condiciones!=null)
            c.setCondiciones(condiciones);
        
        Operaciones.getInstance().ActualizarDatos(c);
       
   }
    
    public void eliminar(ArrayList<String> nombreTabla, ArrayList<String> atributos, ArrayList<String> condiciones)throws SQLException, Exception{
       
       CONSULT c = new CONSULT(nombreTabla);
       if(atributos!=null)
            c.setAtributos(atributos);
        if(condiciones!=null)
            c.setCondiciones(condiciones);
        
        Operaciones.getInstance().EliminarDatos(c);
       

   }
    
     public void registrarUsuarioSQL(String username, String password) throws SQLException, Exception{
        Operaciones.getInstance().registrarUsuario(new USUARIO_SESION(username,password));
    }
     
      public Object getPrivilegios (Object o) throws SQLException, Exception{
        return Operaciones.getInstance().obtenerPrivilegios((String) o);
    }
     
     public ArrayList<String> getUsuariosSQL() throws SQLException, Exception {
        ArrayList<String> nombres = new ArrayList();
        ArrayList<ArrayList<String>> resultado = (ArrayList<ArrayList<String>>) Operaciones.getInstance().getUsuariosSQL();
        for(int i = 1; i<resultado.size(); i++){
            nombres.add(resultado.get(i).get(0));
        }
        return nombres;
    }
     
    public void asignarTodosPrivilegios (Object o) throws SQLException, Exception{
        Operaciones.getInstance().asignarTodosPrivilegios((String) o);
    }
    
     public void agregarPrivilegio(Object o) throws SQLException, Exception{
        Operaciones.getInstance().agregarPrivilegio(o);
    }
     
     public void agregarPrivilegioConn(Object o) throws SQLException, Exception{
        Operaciones.getInstance().asignarPrivilegiosConn(o);
    }
     
     public void removerPrivilegio(Object o) throws SQLException, Exception{
        Operaciones.getInstance().removerPrivilegio(o);
    }
     
   public int callprocedure(String proces, String user ) throws SQLException, Exception{
     
       
       return Operaciones.getInstance().callStoredProcedure(proces, user);
   }  

}
