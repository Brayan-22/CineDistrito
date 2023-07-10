package com.alejandro.Logica.AbstractFactory;

import com.alejandro.Logica.CRUD.*;
/**
 * Fabrica concreta para el CRUD de Empleados
 * @author alejandro
 * @version 1.0
 */
public class FabricaEmpleado implements AbstractFactoryCRUD{
    @SuppressWarnings("FieldMayBeFinal")
    private int idempleado;
    private String nombre;
    private String apellidos;
    private String contrasena;
    private String telefono;
    private String fecha_inin_cargo;
    private int id_tipo_cargo;
    private int id_multiplex;
    private String codigoempleado;
    
    
    /**
     * Constructor para insertar un empleado
     * @param idempleado define la cedula del empleado
     * @param nombre define el nombre del empleado
     * @param apellidos  define el/los apellidos del empleado
     * @param contrasena define la contrasena para el empleado
     * @param telefono define el telefono del empleado
     * @param fecha_inin_cargo define la fecha en la que empezo a trabajar el empleado
     * @param id_tipo_cargo define el tipo de cargo del empleado
     * @param id_multiplex define el multiplex en el que trabaja
     */
    public FabricaEmpleado(int idempleado,String nombre,String apellidos,String contrasena,String telefono,String fecha_inin_cargo,int id_tipo_cargo,int id_multiplex) {
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.contrasena=contrasena;
        this.telefono=telefono;
        this.fecha_inin_cargo=fecha_inin_cargo;
        this.id_tipo_cargo=id_tipo_cargo;
        this.id_multiplex=id_multiplex;
    }

    /**
     * constructor para leer un registro de empleado o para eliminar un empleado
     * @param codigoempleado El parametro codigoempleado define el empleado al que se realizara la operacion
    */
    public FabricaEmpleado(String codigoempleado) {
        this.codigoempleado=codigoempleado;
    }
    
    /**
     * constructor para update empleado
     * @param codigoempleado define el codigo del empleado al cual se le actualizaran los datos
     * @param contrasena define la nueva contrasena del empleado
     */
    public FabricaEmpleado(String codigoempleado,String contrasena) {
        this.codigoempleado=codigoempleado;
        this.contrasena=contrasena;
    }
    
    
    
    /** 
     * @return Create
     * retorna un objeto CreateEmpleado
     */
    @Override
    public Create crearRegistro() {
        return new CreateEmpleado(idempleado, nombre, apellidos, contrasena, telefono, fecha_inin_cargo, id_tipo_cargo, id_multiplex);
    }
    /** 
     * @return Delete
     * retorna un objeto deleteEmpleado
     */
    @Override
    public Delete deleteRegistro() {
        return new DeleteEmpleado(codigoempleado);
    }
    /** 
     * @return Read
     * retorna un objeto readEmpleado
     */
    @Override
    public Read readRegistro() {
        return new ReadEmpleado(codigoempleado);
    }
    /** 
     * @return Update
     * retorna un objeto UpdateEmpleado
     */
    @Override
    public Update updateRegistro() {
        return new UpdateEmpleado(codigoempleado, contrasena);
    }
    
    
    
}
