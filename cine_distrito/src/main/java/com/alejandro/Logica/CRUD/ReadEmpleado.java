package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * Implementacion producto concreto Read Empleado
 * @author alejandro
 * @version 1.0
 */
public class ReadEmpleado implements Read{
    singletonConexion conexion;
    private Statement st;
    private ResultSet rs;
    private ArrayList array;
    private final String codigoempleado;

    /**
     * Constructor read Empleado
     * @param codigoempleado define el codigo del empleado a buscar
     */
    public ReadEmpleado(String codigoempleado) {
        this.codigoempleado=codigoempleado;
        array=null;
    }
    
    
    
    /** 
     * @return ArrayList
     */
    @Override
    public ArrayList operacionCrud() {
        array = new ArrayList();
        String sql="select codigoempleado,contraseña from empleado where codigoempleado='"+codigoempleado+"'";
        conexion=singletonConexion.getConexion();
        conexion.Conectar();
        try {
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                array.add(rs.getString(1));
                array.add(rs.getString(2));
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No esta registrado un empleado con las credenciales que ingreso");
        }
        return array;
    }

    
}
