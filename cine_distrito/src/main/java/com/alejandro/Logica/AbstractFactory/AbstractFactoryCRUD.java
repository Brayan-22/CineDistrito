package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;

/**
 *
 * @author USER
 */
public interface AbstractFactoryCRUD {
    public Create crearRegistro();
    public Delete deleteRegistro();
    public Read readRegistro();
    public Update updateRegistro();
}
