package com.alejandro.Logica.Principal;


import com.alejandro.Logica.AbstractFactory.*;
import com.alejandro.Logica.CRUD.Read;
import java.util.ArrayList;

/**
 * Logica de negocio para salas
 * @author alejandro
 * @version 1.0
 */
public class Sala {
    private int idMultiplex;
    private int codigoSala;
    private int id_pelicula;
    private int idSala;
    private ArrayList<Asiento> arrayAsientos;
    private ArrayList<ArrayList> arrayTemp;
    private AbstractFactoryCRUD miFabrica;
    private Read read;

    /**
     * Constructor sala
     * @param idSala define el id de la sala
     * @param idMultiplex define el id del multiplex de la sala
     * @param codigoSala define el codigo de la sala
     * @param id_pelicula define el id de la pelicula asignada
     */
    public Sala(int idSala,int idMultiplex,int codigoSala,int id_pelicula) {
        this.idSala=idSala;
        this.idMultiplex=idMultiplex;
        this.codigoSala=codigoSala;
        this.id_pelicula=id_pelicula;
        arrayAsientos=new ArrayList<>();
    }
    /**
     * Realiza el query a la base de datos obteniendo los asientos de la sala actualizados
     */
    public void actualizasAsientos(){
        miFabrica=new FabricaAsiento(idSala);
        read=miFabrica.readRegistro();
        arrayTemp=read.operacionCrud();
        for (int i = 0; i < arrayTemp.size(); i++) {
            Asiento asientoTemp = new Asiento((int)arrayTemp.get(i).get(0), 
                    (int)arrayTemp.get(i).get(1), 
                    (int)arrayTemp.get(i).get(2), 
                    (int)arrayTemp.get(i).get(3), 
                    (int)arrayTemp.get(i).get(4));
            arrayAsientos.add(asientoTemp);
        }
    }
    
    /** 
     * getter codigo sala
     * @return int
     */
    public int getCodigoSala() {
        return codigoSala;
    }
    /**
     * setter codigo sala
     * @param codigoSala int
     */
    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }
    /**
     * getter id de la pelicula asignada
     * @return int
     */
    public int getId_pelicula() {
        return id_pelicula;
    }
    /**
     * setter id de la pelicula asignada
     * @param id_pelicula int
     */
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }
    /**
     * getter lista de asientos
     * @return ArrayList
     */
    public ArrayList<Asiento> getArrayAsientos() {
        return arrayAsientos;
    }
    /**
     * setter lista de asientos
     * @param arrayAsientos ArrayList
     */
    public void setArrayAsientos(ArrayList<Asiento> arrayAsientos) {
        this.arrayAsientos = arrayAsientos;
    }

    
    /**
     * getter id del multiplex de la sala
     * @return int
     */
    public int getIdMultiplex() {
        return idMultiplex;
    }
    /**
     * setter id del multiplex de la sala
     * @param idMultiplex int
     */
    public void setIdMultiplex(int idMultiplex) {
        this.idMultiplex = idMultiplex;
    }
    
    /**
     * getter id de la sala
     * @return int
     */
    public int getIdSala() {
        return idSala;
    }
    /**
     * setter id de la sala
     * @param idSala int
     */
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    
}
