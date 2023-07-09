package com.alejandro.Logica.Principal;
import com.alejandro.Logica.AbstractFactory.*;
import com.alejandro.Logica.CRUD.Read;
import java.util.ArrayList;

/**
 * Logica de negocio para los multiplex
 * @author alejandro
 * @version 1.0
 */
public class Multiplex {
    private int idMultiplex;
    private String nombreMultiplex;
    private ArrayList<Sala> arraySalas;
    private ArrayList<ArrayList> arrayTemp;
    private AbstractFactoryCRUD miFabrica;
    private Read read;
    /**
     * Constructor multiplex
     * @param idMultiplex define el id del multiplex
     * @param nombreMultiplex define el nombre del multiplex
     */
    public Multiplex(int idMultiplex,String nombreMultiplex) {
        this.idMultiplex=idMultiplex;
        this.nombreMultiplex=nombreMultiplex;
        arraySalas=new ArrayList<>();
    }
    /**
     * Realiza el query a la base de datos obteniendo las salas actualizadas
     */
    public void actualizarSalas(){
        miFabrica=new FabricaSala(idMultiplex);
        read=miFabrica.readRegistro();
        arrayTemp=read.operacionCrud();
        for (int i = 0; i < arrayTemp.size(); i++) {
            Sala salaTemp= new Sala((int)arrayTemp.get(i).get(0), (int)arrayTemp.get(i).get(1), (int)arrayTemp.get(i).get(2), (int)arrayTemp.get(i).get(3));
            arraySalas.add(salaTemp);
        }
    }

    
    /** 
     * getter id multiplex
     * @return int
     */
    public int getIdMultiplex() {
        return idMultiplex;
    }
    /**
     * setter id multiplex
     * @param idMultiplex int
     */
    public void setIdMultiplex(int idMultiplex) {
        this.idMultiplex = idMultiplex;
    }
    /**
     * getter nombre multiplex
     * @return String
     */
    public String getNombreMultiplex() {
        return nombreMultiplex;
    }
    /**
     * setter nomnbre multiplex
     * @param nombreMultiplex String
     */
    public void setNombreMultiplex(String nombreMultiplex) {
        this.nombreMultiplex = nombreMultiplex;
    }
    /**
     * getter salas multiplex
     * @return ArrayList<Sala>
     */
    public ArrayList<Sala> getArraySalas() {
        return arraySalas;
    }
    /**
     * setter salas
     * @param arraySalas ArrayLista<Sala>
     */
    public void setArraySalas(ArrayList<Sala> arraySalas) {
        this.arraySalas = arraySalas;
    }
    
    
}
