package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Implementacion producto concreto Delete Empleado 
 * @author alejandro
 */
public class DeleteEmpleado implements Delete{
    singletonConexion conexion;
    private final String codigoempleado;
    private PreparedStatement pst;
    /**
     * Constructor DeleteEmpleado
     * @param codigoempleado define el codigo del empleado a eliminar
     */
    public DeleteEmpleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }
    
    
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        String sql="delete from empleado where codigoempleado='?'";
        try {
            conexion.Conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setString(1, codigoempleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El empleado no existe");
        }
    }
    
    
}
