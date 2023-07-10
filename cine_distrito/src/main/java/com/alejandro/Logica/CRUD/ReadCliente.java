package com.alejandro.Logica.CRUD;


import com.alejandro.Persistencia.singletonConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Implementacion producto concreto Read Cliente
 * @author alejandro
 * @version 1.0
 */
public class ReadCliente implements Read{
    singletonConexion conexion;
    private ArrayList array;
    private final String correo;
    private Statement st;
    private ResultSet rs;
    
    /**
     * Constructor read Cliente
     * @param correo define el correo del cliente a consultar
     */
    public ReadCliente(String correo) {
        this.correo=correo;
        array=null;
    }
    
    
    /** 
     * @return ArrayList
     */
    @Override
    public ArrayList operacionCrud() {
        array=new ArrayList();
        String sql="select idcliente,correo,contrasena,nombre from cliente where correo='"+correo+"';";
        conexion=singletonConexion.getConexion();
        try {
            conexion.Conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                array.add(rs.getInt(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encuentra registrado");
        }
        return array;
    }
    
}
