package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Implementacion producto concreto update empleado
 * @author alejandro
 * @version 1.0
 */
public class UpdateEmpleado implements Update{
    singletonConexion conexion;
    private PreparedStatement pst;
    private final String codigoEmpleado;
    private final String nuevaContrasena;
    /**
     * Constructor update empleado 
     * @param codigoEmpleado define el codigo del empleado a modificar
     * @param nuevaContrasena define la nueva contrasena del empleado
     */
    public UpdateEmpleado(String codigoEmpleado,String nuevaContrasena) {
        this.codigoEmpleado=codigoEmpleado;
        this.nuevaContrasena=nuevaContrasena;
    }
    @Override
    public void operacionCrud(){
        String sql="update empleado set contrasena=? where codigoempleado=?";
        conexion=singletonConexion.getConexion();
        conexion.Conectar();
        try {
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setString(1, nuevaContrasena);
            pst.setString(2, codigoEmpleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
