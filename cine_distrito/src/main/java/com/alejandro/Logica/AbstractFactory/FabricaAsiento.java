package com.alejandro.Logica.AbstractFactory;


import com.alejandro.Logica.CRUD.*;

/**
 * Fabrica concreta para el CRUD de Asientos
 * @author alejandro
 * @version 1.0
 */
public class FabricaAsiento implements AbstractFactoryCRUD{
    private int idSala;
    
    /**
     * Constructor para obtener los asientos segun el id de la sala
     * @param idSala define el id de la sala
     */
    public FabricaAsiento(int idSala) {
        this.idSala=idSala;
    }
 
    
    
    /** 
     * @return Create
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Create crearRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }

    /**
     * @return Delete
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Delete deleteRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }
    
    /**
     * @return Read
     * retorna un objeto de readAsiento
     */
    @Override
    public Read readRegistro() {
        return new ReadAsiento(idSala);
    }
    /**
     * @return Update
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }
    
}
