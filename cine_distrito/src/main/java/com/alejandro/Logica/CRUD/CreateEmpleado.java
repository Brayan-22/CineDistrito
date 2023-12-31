package com.alejandro.Logica.CRUD;


import com.alejandro.Persistencia.singletonConexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Implementacion producto concreto Create Empleados
 * @author alejandro
 * @version 1.0
 */
public class CreateEmpleado implements Create{
    
    singletonConexion conexion;
    private final int idempleado;
    private final String nombre;
    private final String apellidos;
    private final String contrasena;
    private final String telefono;
    private final String fecha_inin_cargo;
    private final int id_tipo_cargo;
    private final int id_multiplex;
    private String codigoEmpleado;
    private PreparedStatement pst;
    private String sql="insert into empleado(idempleado,nombre,apellidos,contrasena,telefono,fecha_inin_cargo,id_tipo_cargo,id_multiplex,codigoempleado) values(?,?,?,?,?,?,?,?,?)";
    
    /**
     * Constructor para crear un nuevo empleado en la base de datos
     * @param idempleado define el id del empleado nuevo
     * @param nombre define el nombre del empleado nuevo
     * @param apellidos define los apellidos del empleado nuevo
     * @param contrasena define la contrasena del empleado nuevo
     * @param telefono define el telefono del empleado nuevo
     * @param fecha_inin_cargo define la fecha de inicio del cargo de trabajo del empleado nuevo
     * @param id_tipo_cargo define el id del tipo de cargo del empleado nuevo
     * @param id_multiplex define el id del multiplex en el cual trabajara el empleado nuevo
     */
    public CreateEmpleado(int idempleado,String nombre,String apellidos,String contrasena,String telefono,String fecha_inin_cargo,int id_tipo_cargo,int id_multiplex) {
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contrasena=contrasena;
        this.telefono=telefono;
        this.fecha_inin_cargo=fecha_inin_cargo;
        this.id_tipo_cargo=id_tipo_cargo;
        this.id_multiplex=id_multiplex;
        this.codigoEmpleado=nombre.substring(0, 4)+multiplex(id_multiplex)+String.valueOf(idempleado).substring(0, 5);

    }
    @Override
    public void operacionCrud() {
        conexion=singletonConexion.getConexion();
        conexion.Conectar();
        try {
            pst=conexion.getConnection().prepareStatement(sql);
            pst.setInt(1, idempleado);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setString(4, contrasena);
            pst.setString(5, telefono);
            pst.setString(6, fecha_inin_cargo);
            pst.setInt(7, id_tipo_cargo);
            pst.setInt(8, id_multiplex);
            pst.setString(9, codigoEmpleado);
            pst.execute();
            conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La cedula que ingreso ya existe con otro empleado");
        }
    }
    
    private String multiplex(int multi){
        switch (multi) {
            case 1:
                return "titan";
            case 2:
                return "unice";
            case 3:
                return "plaza";
            case 4:
                return "granE";
            case 5:
                return "embaj";
            case 6:
                return "LasAm";
            default:
                return "";
        }
    }
    
}
