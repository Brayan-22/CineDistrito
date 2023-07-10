package com.alejandro.Logica.CRUD;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import com.alejandro.Persistencia.singletonConexion;
/**
 * Implementacion producto concreto Create clientes
 * @author alejandro
 * @version 1.0
 * 
 */
public class CreateCliente implements Create{
    singletonConexion conexion;
    private final int idcliente;
    private final String nombre;
    private final String apellidos;
    private final String contrasena;
    private final String correo;
    private final String sql="insert into cliente(idcliente,nombre,apellidos,contrasena,correo) values(?,?,?,?,?)";
    private PreparedStatement pst;
    /**
     * 
     * @param idcliente define el id del cliente nuevo
     * @param nombre define el nombre del cliente nuevo
     * @param apellidos define los apellidos del cliente nuevo
     * @param contrasena define la contrasena del cliente
     * @param correo define el correo electronico del cliente
     */
    public CreateCliente(int idcliente,String nombre,String apellidos,String contrasena,String correo) {
        this.idcliente=idcliente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contrasena=contrasena;
        this.correo=correo;
    }
    
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        try {
            conexion.Conectar();
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idcliente);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setString(4, contrasena);
            pst.setString(5, correo);
            pst.execute();
            conexion.desconectar();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La cedula que ingreso ya existe con otro cliente");
        }
    }
    
}
