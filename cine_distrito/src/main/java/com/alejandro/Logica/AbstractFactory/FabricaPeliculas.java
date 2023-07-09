package com.alejandro.Logica.AbstractFactory;


import com.alejandro.Logica.CRUD.*;
/**
 * Fabrica concreta para el CRUD de Peliculas
 * @author alejandro
 * @version 1.0
 */
public class FabricaPeliculas implements AbstractFactoryCRUD{

    
    /** 
     * @return Create
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Create crearRegistro() {
        return null;
    }

    /** 
     * @return Delete
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Delete deleteRegistro() {
        return null;
    }
    /** 
     * @return Read
     * retorna un objeto readPeliculas
     */
    @Override
    public Read readRegistro() {
        return new ReadPeliculas();
    }

    /** 
     * @return Update
     * retorna null ya que la funcionalidad aun no es implementada
     */
    @Override
    public Update updateRegistro() {
        return null;
    }
    
}
