package com.alejandro.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author alejandro
 * @version 1.0
 * 
 * Clase singleton para manejar una instancia global en el programa para la conexion a la base de datos
 *  */
public class singletonConexion {
    private Connection conexion;
    private String password;
    private String alejandro;
    private static singletonConexion INSTANCE = null;
    private singletonConexion(){
        password = "123456";
        alejandro = "root";
    }
    /**
     * Metodo que inicia la conexion a la base de datos
     */
    public void Conectar(){
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/cine",alejandro,password);
        } catch (SQLException e) {
            System.err.println("Error en conexion(conectar):" +e);
        }        
    }
    private synchronized static void createInstance(){
        if(INSTANCE==null){
            INSTANCE=new singletonConexion();
        }
    }
    
    /** 
     * @return Instancia singleton de la clase
     */
    public static singletonConexion getConexion(){
 
        if (INSTANCE==null) {
            createInstance();
        }
        return INSTANCE;
    }
    /**
     * 
     * @throws SQLException
     */
    public void desconectar() throws SQLException{
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @param password 
     * setter contraseña para la conexion a la base de datos
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @param alejandro
     * setter usuario para la conexion a la base de datos
     */
    public void setalejandro(String alejandro) {
        this.alejandro = alejandro;
    }
    /**
     * 
     * @return objeto de tipo Connection para manipular los datos de la base de datos
     */
    public Connection getConnection(){
        return conexion;
    }
}
