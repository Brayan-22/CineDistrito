package com.alejandro;

import com.alejandro.facade.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
     * @param args
     */
    public static void main(String[] args) {
        new Launcher();
    }
    
}
