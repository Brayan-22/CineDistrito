package com.alejandro.Logica.CRUD;
import com.alejandro.Persistencia.singletonConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ReadMultiplex implements Read{
    singletonConexion conexion;
    private Statement st;
    private ResultSet rs;
    private ArrayList<ArrayList> array;
    @Override
    public ArrayList operacionCrud() {
        array=new ArrayList();
        conexion=singletonConexion.getConexion();
        String sql="select idmultiplex,nombre_multiplex from multiplex";
        try {
            conexion.Conectar();
            st=conexion.getConnection().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                ArrayList arrayTemp=new ArrayList();
                arrayTemp.add(rs.getInt(1));
                arrayTemp.add(rs.getString(2));
                array.add(arrayTemp);
            }
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
