package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;
/**
 *
 * @author USER
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
    
    @Override
    public Create crearRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }

    @Override
    public Delete deleteRegistro() {
        System.err.println("Funcionalidad no necesaria");
        return null;
    }

    @Override
    public Read readRegistro() {
        return new ReadSalas(idmultiplex);
    }

    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria(por ahora:) )");
        return null;
    }
    
}
