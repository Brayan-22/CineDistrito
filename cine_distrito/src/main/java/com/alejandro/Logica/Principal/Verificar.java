package com.alejandro.Logica.Principal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase para manejar la utilidad de verificacion en la logica de negocio
 * @author alejandro
 * @version 1.0
 */
public class Verificar {
	/** 
	 * Metodo para verificar si una cadena de caracteres es de tipo numerico
	 * @param cadena String
	 * @return boolean
	 */
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	/**
	 * Metodo para verificar que una cadena de caracteres siga el patron para correos electronicos
	 * @param Correo String 
	 * @return boolean
	 */
	public static boolean esCorreo(String Correo) {
		Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=patron.matcher(Correo);
        return comparar.find();
		
	}
	/**
	 * Metodo para verificar que una cadena de caracteres sea solo alfabetica
	 * @param Texto String
	 * @return boolean
	 */
	public static boolean esTexto(String Texto) {
		Pattern patron = Pattern.compile("[_A-Za-z]");
        Matcher comparar=patron.matcher(Texto);
        return comparar.find();
		
	}
}
