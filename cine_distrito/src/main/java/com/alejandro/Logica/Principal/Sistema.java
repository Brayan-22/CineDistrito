package com.alejandro.Logica.Principal;

import com.alejandro.Logica.AbstractFactory.*;
import com.alejandro.Logica.CRUD.Read;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Sistema {
    private AbstractFactoryCRUD miFabrica;
    private Read read;
    private ArrayList<Multiplex> arrayMultiplex;
    private ArrayList<ArrayList> arrayTemp;
    public Sistema() {
        miFabrica=new FabricaMultiplex();
        read=miFabrica.readRegistro();
        arrayMultiplex=new ArrayList<>();
        ingresarMultiplex();
    }
    private void ingresarMultiplex(){
        arrayTemp=read.operacionCrud();
        for(int i=0;i<6;i++){
            Multiplex multiplexTemp=new Multiplex((int)arrayTemp.get(i).get(0), (String)arrayTemp.get(i).get(1));
            arrayMultiplex.add(multiplexTemp);
        }
    }

    public ArrayList<Multiplex> getArrayMultiplex() {
        return arrayMultiplex;
    }
    
    
}
