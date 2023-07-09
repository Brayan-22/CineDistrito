package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Implementacion producto concreto Read Salas
 * @author alejandro
 * @version 1.0
 */
public class ReadSalas implements Read{
    singletonConexion conexion;
    private final int idmultiplex;
    private ResultSet rs;
    private Statement st;
    private ArrayList<ArrayList> array;

    /**
     * Constructor read salas
     * @param idmultiplex define el id del multiplex de las salas a consultar
     */
    public ReadSalas(int idmultiplex) {
        this.idmultiplex=idmultiplex;
    }

    
    /** 
     * @return ArrayList
     */
    @Override
    public ArrayList operacionCrud() {
        array=new ArrayList<>();
        String sql="select* from sala where id_multiplex="+String.valueOf(idmultiplex);
        conexion=singletonConexion.getConexion();
        try {
            conexion.Conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                ArrayList arrayTemp = new ArrayList();
                arrayTemp.add(rs.getInt(1));
                arrayTemp.add(rs.getInt(2));
                arrayTemp.add(rs.getInt(3));
                arrayTemp.add(rs.getInt(4));
                array.add(arrayTemp);
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
