package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;
/** 
 * Fabrica concreta para el CRUD de Salas
 * @author alejandro
 * @version 1.0
 */
public class FabricaSala implements AbstractFactoryCRUD{
    private final int idmultiplex;
    
    /**
     * Constructor para leer las salas de un multiplex especificos
     * @param idmultiplex define el id del multiplex
     */
    public FabricaSala(int idmultiplex) {
        this.idmultiplex=idmultiplex;
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
     * retorna un objeto ReadSalas
     */
    @Override
    public Read readRegistro() {
        return new ReadSalas(idmultiplex);
    }
    /** 
     * @return Update
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria(por ahora:) )");
        return null;
    }
    
}
