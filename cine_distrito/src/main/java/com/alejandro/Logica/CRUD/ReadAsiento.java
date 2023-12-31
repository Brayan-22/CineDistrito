package com.alejandro.Logica.CRUD;

import com.alejandro.Persistencia.singletonConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Implementacion producto concreto Read Asiento
 * @author alejandro
 * @version 1.0
 */
public class ReadAsiento implements Read{
    singletonConexion conexion;
    private final int idSala;
    private Statement st;
    private ResultSet rs;
    private ArrayList<ArrayList> array;

    /**
     * Constructor readAsiento
     * @param idSala define el id de la sala a la cual pertenecen los asientos
     */
    public ReadAsiento(int idSala) {
        this.idSala=idSala;
    }
    
    
    /** 
     * @return ArrayList
     */
    @Override
    public ArrayList operacionCrud() {
        conexion=singletonConexion.getConexion();
        array = new ArrayList<>();
        String sql="select* from asiento where sala_idsala="+String.valueOf(idSala);
        try {
            conexion.Conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {               
                ArrayList arrayTemp= new ArrayList<>();
                arrayTemp.add(rs.getInt(1));
                arrayTemp.add(rs.getInt(2));
                arrayTemp.add(rs.getInt(3));
                arrayTemp.add(rs.getInt(4));
                arrayTemp.add(rs.getInt(5));
                array.add(arrayTemp);
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}

