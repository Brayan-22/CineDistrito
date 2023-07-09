package com.alejandro.Logica.CRUD;

import java.util.ArrayList;

/**
 * Interface producto abstracto Read 
 * @author alejandro
 * @version 1.0
 */
public interface Read {
    /**
     * metodo para realizar la operacion CRUD solicitada
     * @return ArrayList con el query solicitado
     */
    public ArrayList operacionCrud();
}
