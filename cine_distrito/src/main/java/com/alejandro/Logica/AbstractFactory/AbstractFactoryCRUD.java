package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;

/**
 * Interface de tipo AbstractFactory para la creacion de un CRUD
 * @author alejandro
 * @version 1.0
 */
public interface AbstractFactoryCRUD {
    /**
     * 
     * @return Create
     */
    public Create crearRegistro();
    /**
     * 
     * @return Delete
     */
    public Delete deleteRegistro();
    /**
     * 
     * @return Read
     */
    public Read readRegistro();
    /**
     * 
     * @return Update
     */
    public Update updateRegistro();
}
