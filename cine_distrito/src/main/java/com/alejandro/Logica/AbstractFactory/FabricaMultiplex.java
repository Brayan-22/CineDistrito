package com.alejandro.Logica.AbstractFactory;


import com.alejandro.Logica.CRUD.*;

/**
 *
 * @author USER
 */
public class FabricaMultiplex implements AbstractFactoryCRUD{

    @Override
    public Create crearRegistro() {
        return null;
    }

    @Override
    public Delete deleteRegistro() {
        return null;
    }

    @Override
    public Read readRegistro() {
        return new ReadMultiplex();
    }

    @Override
    public Update updateRegistro() {
        return null;
    }
    
}
