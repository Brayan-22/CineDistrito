package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;

/**
 * Interface de tipo AbstractFactory para la creacion de un CRUD
 * @author alejandro
 * @version 1.0
 */
public interface AbstractFactoryCRUD {
    /**
     * Metodo que corresponde a la creacion de un registro nuevo en la base de datoss
     * @return Create
     */
    public Create crearRegistro();
    /**
     * Metodo que corresponde a la eliminacion de un registro de la base de datos
     * @return Delete
     */
    public Delete deleteRegistro();
    /**
     * Metodo que corresponde a la lectura de un registro de la base de datos
     * @return Read
     */
    public Read readRegistro();
    /**
     * Metodo que corresponde a la actualizacion de un registro de la base de datos
     * @return Update
     */
    public Update updateRegistro();
}
