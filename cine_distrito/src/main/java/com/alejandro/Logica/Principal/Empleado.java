package com.alejandro.Logica.Principal;

/**
 * Logica de negoccio para los empleados
 * @author alejandro
 * @version 1.0
 */
public class Empleado {

	private String Cedula;
	private String IdEmpleado;
	private String Nombre;
	private String Telefono;
	private String FechaIngreso;
	private double Salario;
	private String Cargo;
	private String Multiplex;
	
	/**
	 * Constructor empleado
	 * @param Cedula define la cedula del empleados 
	 * @param IdEmpleado define el id del empleado
	 * @param Nombre define el nombre del empleado
	 * @param Telefono defien el telefono del empleado
	 * @param FechaIngreso define la fecha de ingreso del empleado
	 * @param Salario define el salario actual del empleado
	 * @param Cargo define el cargo actual del empleado
	 * @param Multiplex define el multiplex asignado para el empleado
	 */
	public Empleado(String Cedula, String IdEmpleado, String Nombre, String Telefono, String FechaIngreso,
			double Salario, String Cargo, String Multiplex) {
		
		this.Cedula = Cedula;
		this.IdEmpleado = IdEmpleado;
		this.Nombre = Nombre;
		this.Telefono = Telefono;
		this.FechaIngreso = FechaIngreso;
		this.Salario = Salario;
		this.Cargo = Cargo;
		this.Multiplex = Multiplex;
	}


	
	/** 
	 * getter cedula
	 * @return String
	 */
	public String getCedula() {
		return Cedula;
	}

	/**
	 * setter cedula
	 * @param cedula String
	 */
	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	/**
	 * getter id empleado
	 * @return String
	 */
	public String getIdEmpleado() {
		return IdEmpleado;
	}

	/**
	 * setter id empleado
	 * @param idEmpleado String
	 */
	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	/**
	 * gettter nombre empleado
	 * @return String
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter nombre empleado
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * getter telefono
	 * @return String
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * setter telefono
	 * @param telefono String
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/**
	 * getter fecha ingreso empleado
	 * @return String
	 */
	public String getFechaIngreso() {
		return FechaIngreso;
	}

	/**
	 * setter fecha ingreso empleado
	 * @param fechaIngreso String
	 */
	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	/**
	 * getter salario empleado
	 * @return double
	 */
	public double getSalario() {
		return Salario;
	}

	/**
	 * setter salario empleado
	 * @param salario double
	 */
	public void setSalario(double salario) {
		Salario = salario;
	}

	/**
	 * getter cargo empleado
	 * @return String
	 */
	public String getCargo() {
		return Cargo;
	}

	/**
	 * setter cargo empleado
	 * @param cargo String
	 */
	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	/**
	 * getter multiplex empleado
	 * @return String
	 */
	public String getMultiplex() {
		return Multiplex;
	}

	/**
	 * setter multiplex empleado
	 * @param multiplex String
	 */
	public void setMultiplex(String multiplex) {
		Multiplex = multiplex;
	}
	
	
	
	
	
	
	
	
}
