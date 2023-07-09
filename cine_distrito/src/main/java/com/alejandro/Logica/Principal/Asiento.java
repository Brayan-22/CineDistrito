package com.alejandro.Logica.Principal;
/**
 * Logica de negocio para los asientos 
 * @author alejandro
 * @version 1.0
 */
public class Asiento {
    private int idAsiento;
    private int tipoAsiento;
    private int estadoAsiento;
    private int idSala;
    private int codigoAsiento;
    
    
    /**
     * Constructor para los asientos
     * @param idAsiento define el id del asiento
     * @param tipoAsiento define el tipo de asiento 
     * @param estadoAsiento define el estado del asiento
     * @param idSala define el id de la sala a la cual pertenece el asiento
     * @param codigoAsiento define el codigo del asiento
     */
    public Asiento(int idAsiento,int tipoAsiento,int estadoAsiento,int idSala,int codigoAsiento) {
        this.idSala=idSala;
        this.idAsiento=idAsiento;
        this.codigoAsiento=codigoAsiento;
        this.tipoAsiento=tipoAsiento;
        this.estadoAsiento=estadoAsiento;
    }
    
    /** 
     * getter idAsiento
     * @return int 
     */
    public int getIdAsiento() {
        return idAsiento;
    }
    /**
     * Setter idAsiento
     * @param idAsiento
     */
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    /**
     * getter codigoAsiento
     * @return int
     */
    public int getCodigoAsiento() {
        return codigoAsiento;
    }
    /**
     * setter codigoAsiento
     * @param codigoAsiento int
     */
    public void setCodigoAsiento(int codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }
    /**
     * getter TipoAsiento
     * @return int
     */
    public int getTipoAsiento() {
        return tipoAsiento;
    }
    /**
     * setter tipoAsiento
     * @param tipoAsiento int
     */
    public void setTipoAsiento(int tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }
    /**
     * getter estadoAsiento
     * @return int
     */
    public int getEstadoAsiento() {
        return estadoAsiento;
    }
    /**
     * setter estadoAsiento
     * @param estadoAsiento int
     */
    public void setEstadoAsiento(int estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    /**
     * getter idSala
     * @return int
     */
    public int getIdSala() {
        return idSala;
    }
    /**
     * setter idSala
     * @param idSala int
     */
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    
}
