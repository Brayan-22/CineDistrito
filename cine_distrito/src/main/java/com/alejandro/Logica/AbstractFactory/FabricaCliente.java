package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;

/**
 * Fabrica concreta para el CRUD de Clientes
 * @author alejandro
 * @version 1.0
 */
public class FabricaCliente implements AbstractFactoryCRUD{
    private int idcliente;
    private String nombre;
    private String apellidos;
    private String contrasena;
    private String correo;
    
    
    /**
     * Constructor para insertar un nuevo cliente
     * @param idcliente define el id del cliente
     * @param nombre define el nombre del cliente 
     * @param apellidos define el/los apellidos del cliente
     * @param contrasena define la contrasena que tendra el cliente
     * @param correo define el correo del cliente
     */
    public FabricaCliente(int idcliente,String nombre,String apellidos,String contrasena,String correo) {
        this.idcliente=idcliente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contrasena=contrasena;
        this.correo=correo;
    }
    
    /**
     * Constructor para eliminar un registro de cliente
     * @param idcliente define el id del cliente al que se eliminara el registro
     */
    public FabricaCliente(int idcliente) {
        this.idcliente=idcliente;
    }
    /**
     * Constructor para leer un registro de cliente
     * @param correo String define el correo del cliente
     */
    public FabricaCliente(String correo) {
        this.correo=correo;
    }
    
    
    
    /** 
     * @return Create
     * retorna un objeto CreateCliente
     */
    @Override
    public Create crearRegistro() {
        return new CreateCliente(idcliente, nombre, apellidos, contrasena, correo);
    }
    /** 
     * @return Delete
     * retorna un objeto DeleteCliente
     */
    @Override
    public Delete deleteRegistro() {
        return new DeleteCliente(idcliente);
    }
    /** 
     * @return Read
     * retorna un objeto ReadCliente
     */
    @Override
    public Read readRegistro() {
        return new ReadCliente(correo);
    }
    /** 
     * @return Update
     * retorna un objeto UpdateCliente
     */
    @Override
    public Update updateRegistro() {
        return new UpdateCliente();
    }
    
}
