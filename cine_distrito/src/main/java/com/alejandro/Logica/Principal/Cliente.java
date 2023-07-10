package com.alejandro.Logica.Principal;
/**
 * Logica de negocio para los clientes
 * @author alejandro
 * @version 1.0
 */
public class Cliente {

	private String Nombre;
	private String Correo;
	private String Contrasena;
	private int Identificacion;
	private int Puntos;
	
	/**
	 * Constructor cliente
	 * @param Nombre define el nombre del cliente
	 * @param Correo define el correo del cliente
	 * @param Contrasena define la contrasena del cliente
	 * @param Identificacion define la identificacion del cliente
	 */
	public Cliente(String Nombre, String Correo, String Contrasena, int Identificacion) {
		
		this.Nombre = Nombre;
		this.Correo = Correo;
		this.Contrasena = Contrasena;
		this.Identificacion = Identificacion;
	}


	
	/** 
	 * getter nombreCliente
	 * @return String
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter nombreCliente
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	
	/** 
	 * getter correo electronico
	 * @return String
	 */
	public String getCorreo() {
		return Correo;
	}


	
	/** 
	 * setter correo electronico
	 * @param correo String
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}

	/**
	 * getter contrasena
	 * @return String
	 */
	public String getContrasena() {
		return Contrasena;
	}

	/**
	 * setter contrasena
	 * @param contrasena String
	 */
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	/**
	 * getter identificacion
	 * @return int
	 */
	public int getIdentificacion() {
		return Identificacion;
	}

	/**
	 * setter identificacion
	 * @param identificacion int
	 */
	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
	}

	/**
	 * getter puntos del cliente
	 * @return int
	 */
	public int getPuntos() {
		return Puntos;
	}

	/**
	 * setter puntos del cliente
	 * @param puntos int
	 */
	public void setPuntos(int puntos) {
		Puntos = puntos;
	}
	
	
	
	
	
}
