package com.alejandro;

import com.alejandro.facade.*;

/**
 * Clase principal del programa
 * @author alejandro
 * @version 1.0
 */
public class Launcher {
    private Fachada miFachada;
    /**
     * Inicializador del programa
     */
    public Launcher(){
        miFachada=new Fachada();
        miFachada.iniciar();
    }
    
    
    
    /** 
     * Main
     * @param args argumentos de consola
     */
    public static void main(String[] args) {
        new Launcher();
    }
    
}
