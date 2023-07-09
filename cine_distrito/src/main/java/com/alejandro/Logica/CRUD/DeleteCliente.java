package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Implementacion producto concreto Delete Cliente
 * @author alejandro
 * @version 1.0
 */
public class DeleteCliente implements Delete{
    singletonConexion conexion;
    private PreparedStatement pst;
    private final int idcliente;
    /**
     * Constructor Delete cliente
     * @param idcliente define el id del cliente a eliminar
     */
    public DeleteCliente(int idcliente) {
        this.idcliente=idcliente;
    }
    
    @Override
    public void operacionCrud() {
        String sql="delete from cliente where idcliente=?";
        conexion=singletonConexion.getConexion();
        try {
            conexion.Conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idcliente);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }
    
}
