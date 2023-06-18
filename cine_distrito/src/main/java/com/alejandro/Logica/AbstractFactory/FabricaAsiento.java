package com.alejandro.Logica.AbstractFactory;


import com.alejandro.Logica.CRUD.*;

/**
 *
 * @author USER
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
        return new ReadAsiento(idSala);
    }

    @Override
    public Update updateRegistro() {
        System.err.println("Funcionalidad no necesaria por ahora :)");
        return null;
    }
    
}
