package com.alejandro.facade;

import com.alejandro.Logica.AbstractFactory.*;
import com.alejandro.Logica.CRUD.*;
import com.alejandro.Presentacion.*;
import com.alejandro.Logica.Principal.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase fachada conecta la logica del negocio con la vista (Modelo)
 * 
 * @author alejandro
 * @version 1.0
 */
public class Fachada {
	private AbstractFactoryCRUD miFabrica;
	private Read read;
	private Create create;
	private Sistema sistema;
	private VistaControlador interfaz;

	private Verificar verificar;

	private Component[] Componentes;

	/**
	 * Constructor que instancia la ventana principal
	 */
	public Fachada() {

		interfaz = new VistaControlador(this);

	}

	public void iniciar() {

		interfaz.setVisible(true);

	}

	// // // // // // // // // // VENTANA INICIO // // // // // // // // // //
	/**
	 * metodo que finaliza el programa
	 */
	public void salir() {
		JOptionPane.showMessageDialog(null, "¡Hasta luego!");
		System.out.println("Sesión Finalizada con éxito...");
		System.exit(0);
	}

	/**
	 * metodo que cambia de panel de ventanaInicio a ventanaCartelera
	 * 
	 * @param vi VentanaInicio
	 * @param vc VentanaCartelera
	 */
	// de ventana inicio a cartelera
	public void cambiarPanel(VentanaInicio vi, VentanaCartelera vc) {
		String myPass = String.valueOf(vi.getPwdContraseña().getPassword());
		String myName = vi.getTxtNombre();
		miFabrica = new FabricaEmpleado(myName);
		read = miFabrica.readRegistro();
		ArrayList arrayTemp = read.operacionCrud();
		System.out.println(arrayTemp.size());
		if (myName.isEmpty() || myPass.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
		} else if (arrayTemp.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Este empleado no se encuentra registrado");
		} else if (myName.equals(arrayTemp.get(0)) && myPass.equals(arrayTemp.get(1))) {
			System.out.println("Usuario: " + myName);
			System.out.println("Contraseña: " + myPass);
			vi.setVisible(false);
			vc.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
		}

	}

	// // // // // // // // // // VENTANA CARTELERA // // // // // // // // // //
	/**
	 * metodo que cambia de panel de VentanaCartelera a VentanaInicio
	 * 
	 * @param vc VentanaCartelera
	 * @param vi VentanaInicio
	 */
	public void cambiarPanel(VentanaCartelera vc, VentanaInicio vi) {

		System.out.println("Ha regresado a la ventana de inicio");
		vc.setVisible(false);
		vi.setVisible(true);

	}

	/**
	 * metodo que cambia de panel de VentanaCartelera a VentanaPelicula
	 * 
	 * @param vc VentanaCartelera
	 * @param vp VentanaPelicula
	 */
	public void cambiarCarteleraPelicula(VentanaCartelera vc, VentanaPelicula vp) {
		vp.getCmbSalasDisponibles().removeAllItems();
		vc.setVisible(false);
		vp.setVisible(true);

	}

	// // // // // // // // // // VENTANA PELICULA // // // // // // // // // //
	/**
	 * metodo que se encarga de mostrar la ventana pelicula
	 * 
	 * @param nombrePelicula String
	 * @param vp             VentanaPelicula
	 */
	public void setPelicula(String nombrePelicula, VentanaPelicula vp) {
		vp.getCmbSalasDisponibles().removeAllItems();

		switch (nombrePelicula) {

			case "Encanto":
				sistema = new Sistema();

				ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
				vp.getLblImagen()
						.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
								vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblTitulo().setText("Encanto");
				vp.getTxtDescripcion()
						.setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
								+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
								+ "conocido como un Encanto.");

				ImageIcon imgEdadEncanto = new ImageIcon("./img/imgEdadTodos.png");
				vp.getLblLimiteEdad().setIcon(
						new ImageIcon(imgEdadEncanto.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
								vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblGeneros().setText("<html>• Animación <br>• Aventura <br>• Comedia</html>");

				vp.getLblDirectoresPelicula().setText("Byron Howard y Jared Bush.");

				sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
				for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
						.getArraySalas().size(); i++) {
					if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas()
							.get(i).getId_pelicula() == 1) {
						vp.getCmbSalasDisponibles()
								.addItem(String.valueOf(
										sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
												.getArraySalas().get(i).getCodigoSala()));
					}
				}
				// vp.getCmbCinesDisponibles().addItem(nombrePelicula);

				break;

			case "Moonfall":
				sistema = new Sistema();
				ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");
				vp.getLblImagen()
						.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
								vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblTitulo().setText("Moonfall");
				vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
				vp.getTxtDescripcion().setText("una fuerza misteriosa saca a la Luna de su órbita alrededor de la "
						+ "Tierra y la envía a toda \nvelocidad en un curso de colisión con la vida tal   como la conocemos.");

				ImageIcon imgEdadMoonfall = new ImageIcon("./img/imgEdad10.png");
				vp.getLblLimiteEdad().setIcon(
						new ImageIcon(imgEdadMoonfall.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
								vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblDirectoresPelicula().setText("Roland Emmerich");

				vp.getLblGeneros().setText("<html>• Ciencia Ficción <br>• Fantasia <br>• Aventura</html>");
				sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
				for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
						.getArraySalas().size(); i++) {
					if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas()
							.get(i).getId_pelicula() == 2) {
						vp.getCmbSalasDisponibles()
								.addItem(String.valueOf(
										sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
												.getArraySalas().get(i).getCodigoSala()));
					}
				}
				break;

			case "Paseo 6":
				sistema = new Sistema();

				ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");
				vp.getLblImagen()
						.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
								vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblTitulo().setText("Paseo 6");
				vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
				vp.getTxtDescripcion()
						.setText("La Excursión de 11 es el paseo donde todo puede pasar, pero excursión de 11 "
								+ "con los papás, eso sí es el colmo. Y como Álvaro Castaño sabe que es mejor la seguridad "
								+ "que la policía, decide viajar con su familia para vigilar a su hija Sarita, sin embargo, "
								+ "su suegra, Raquel, no está dispuesta a permitirlo y también se embarca en el plan.");

				ImageIcon imgEdadPaseo6 = new ImageIcon("./img/imgEdadTeen.png");
				vp.getLblLimiteEdad().setIcon(
						new ImageIcon(imgEdadPaseo6.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
								vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblDirectoresPelicula().setText("Rodrigo Triana");

				vp.getLblGeneros().setText("<html>• Comedia </html>");

				sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
				for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
						.getArraySalas().size(); i++) {
					if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas()
							.get(i).getId_pelicula() == 3) {
						vp.getCmbSalasDisponibles()
								.addItem(String.valueOf(
										sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
												.getArraySalas().get(i).getCodigoSala()));
					}
				}

				break;

			case "Scream":
				sistema = new Sistema();
				ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");
				vp.getLblImagen()
						.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
								vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblTitulo().setText("Scream");
				vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 49));
				vp.getTxtDescripcion().setText("Una nueva entrega de la franquicia de terror 'Scream' seguirá a "
						+ "una mujer que regresa a su ciudad natal para tratar de averiguar quién ha estado "
						+ "cometiendo una serie de crímenes viciosos.");

				ImageIcon imgEdadScream = new ImageIcon("./img/imgEdad17.png");
				vp.getLblLimiteEdad().setIcon(
						new ImageIcon(imgEdadScream.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
								vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblDirectoresPelicula().setText(" Wes Craven");

				vp.getLblGeneros().setText("<html>• Terror <br>• Misterio </html>");
				sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
				for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
						.getArraySalas().size(); i++) {
					if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas()
							.get(i).getId_pelicula() == 4) {
						vp.getCmbSalasDisponibles()
								.addItem(String.valueOf(
										sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
												.getArraySalas().get(i).getCodigoSala()));
					}
				}

				break;

			case "Spiderman":
				sistema = new Sistema();
				ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");
				vp.getLblImagen().setIcon(
						new ImageIcon(imagenSpiderman.getImage().getScaledInstance(vp.getLblImagen().getWidth(),
								vp.getLblImagen().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblTitulo().setText("Spiderman");
				vp.getLblTitulo().setBounds(380, 100, 250, 70);
				vp.getLblTitulo().setFont(new Font("Comic Sans MS", 3, 45));
				vp.getTxtDescripcion().setText("Por primera vez en la historia cinematográfica de Spider- Man, "
						+ "nuestro amistoso héroe y vecino es desenmascarado, y ya no puede separar su vida "
						+ "normal de los altos riesgos de ser un súper héroe. ");

				ImageIcon imgEdadSpiderman = new ImageIcon("./img/imgEdad10.png");
				vp.getLblLimiteEdad().setIcon(
						new ImageIcon(imgEdadSpiderman.getImage().getScaledInstance(vp.getLblLimiteEdad().getWidth(),
								vp.getLblLimiteEdad().getHeight(), Image.SCALE_SMOOTH)));

				vp.getLblDirectoresPelicula().setText("Marvel Comics y Stan Lee");

				vp.getLblGeneros().setText("<html>• Acción <br>• Aventura</html>");

				sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).actualizarSalas();
				for (int i = 0; i < sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
						.getArraySalas().size(); i++) {
					if (sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex()).getArraySalas()
							.get(i).getId_pelicula() == 5) {
						vp.getCmbSalasDisponibles()
								.addItem(String.valueOf(
										sistema.getArrayMultiplex().get(vp.getCmbCinesDisponibles().getSelectedIndex())
												.getArraySalas().get(i).getCodigoSala()));
					}
				}
				break;

		}

	}

	// encanto
	/**
	 * metodo que se encarga de cambiar de panel VentanaPelicula a VentanaCartelera
	 * 
	 * @param vc VentanaCartelera
	 * @param vp VentanaPelicula
	 */
	public void regresoPeliculaCartelera(VentanaCartelera vc, VentanaPelicula vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}

	/**
	 * metodo que se encarga de cambiar de panel VentanaPelicula a
	 * VentanaIngresoCliente
	 * 
	 * @param vp  VentanaPelicula
	 * @param vic VentanaIngresoCliente
	 */
	public void continueIngresoCliente(VentanaPelicula vp, VentanaIngresoCliente vic) {

		if (vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {

			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {

			System.out.println("...Ingreso...");
			System.out.println("Pelicula: " + vp.getLblTitulo().getText());
			vic.setPeliculaSeleccionada(vp.getLblTitulo().getText());
			System.out.println("Cine: " + vp.cmbCinesDisponibles.getSelectedItem());
			vic.setCineSeleccionado((String) vp.cmbCinesDisponibles.getSelectedItem());
			vp.setVisible(false);
			vic.setVisible(true);
		}
	}

	////////////////////////////////////////////////////// VENTANA INGRESO CLIENTE
	////////////////////////////////////////////////////// ////////////////////////////////////
	/**
	 * metodo que se encarga de la gestion del ingreso del cliente
	 * 
	 * @param vic VentanaIngresoCliente
	 * @param vcs VentanaCompraSilla
	 * @param vp  VentanaPelicula
	 */
	public void verificacionCliente(VentanaIngresoCliente vic, VentanaCompraSilla vcs, VentanaPelicula vp) {

		if (verificar.esCorreo(vic.getTxtCorreo()) && !vic.getPwdContraseña().getText().isEmpty()) {
			miFabrica = new FabricaCliente(vic.getTxtCorreo());
			read = miFabrica.readRegistro();
			ArrayList arrayTemp = read.operacionCrud();

			System.out.println("\nValidando información de Correo....");
			if (vic.getTxtCorreo().equals(arrayTemp.get(1))
					&& vic.getPwdContraseña().getText().equals(arrayTemp.get(2))) {
				System.err.println("es correcto");
				vcs.setLblCine((String) vp.getCmbCinesDisponibles().getSelectedItem());
				vcs.setLblPelicula(vp.getLblTitulo().getText());
				vcs.setLblSalaActual((String) vp.getCmbSalasDisponibles().getSelectedItem());
				vic.setVisible(false);
				vcs.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Credenciales incorrectas, registrese");
			}

			// se debe tener en cuenta para escribir en la base de datos

		} else {

			JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			vic.setTxtCorreo("");
			vic.setPwdContraseña("");

		}

	}

	/**
	 * metodo que cambia de ventanaIngresoCliente a ventanaRecuperarContrasena
	 * 
	 * @param vic VentanaIngresoCliente
	 * @param vrc VentanaRecuperarContrasena
	 */
	public void ingresoIngresoClienteRecuperarContraseña(VentanaIngresoCliente vic, VentanaRecuperarContrasena vrc) {

		System.out.println("Ingresó a Ventana Recuperar Contraseña");
		vic.setVisible(false);
		vrc.setVisible(true);

	}

	/**
	 * metodo que cambia de VentanaIngresoCliente a VentanaPelicula
	 * 
	 * @param vic VentanaIngresoCliente
	 * @param vp  VentanaPelicula
	 */
	public void regresoIngresoClientePelicula(VentanaIngresoCliente vic, VentanaPelicula vp) {

		System.out.println("Regresó a la ventana Pelicula");
		vic.setVisible(false);
		vp.setVisible(true);
	}

	// // // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // // //
	/**
	 * metodo que se encarga de gestioanr la compra de un asiento
	 * 
	 * @param vcs VentanaCompraSilla
	 * @param vs  VentanaSnacks
	 */
	public void sillasSeleccionadas(VentanaCompraSilla vcs, VentanaSnacks vs) {
		int SillasSeleccionadas = 0;
		Componentes = vcs.getComponentesSilla();
		String Sillas = "";
		int sillasGenerales = 0;
		int sillasPreferenciales = 0;

		if (vcs.getSpnGeneral().isEnabled() || vcs.getSpnPreferencial().isEnabled()) {

			for (int i = 0; i < Componentes.length; i++) {

				if (((JToggleButton) Componentes[i]).isSelected()) {
					Sillas += ((JToggleButton) Componentes[i]).getName() + " - ";
				}
			}

			System.out.println("Sillas seleccionadas: " + Sillas);

			// Sirve para saber que sillas generales estan seleccionadas:
			if (vcs.getIntSpnGeneral() != 0) {

				for (int i = 0; i < 40; i++) {

					if (((JToggleButton) Componentes[i]).isSelected()) {

						sillasGenerales++;
					}
				}

			}

			// sirve para saber que sillas Preferenciales estan seleccionadas
			if (vcs.getIntSpnPreferencial() != 0) {

				for (int j = 40; j < 60; j++) {

					if (((JToggleButton) Componentes[j]).isSelected()) {
						sillasPreferenciales++;
					}
				}

			}
			if (sillasGenerales != vcs.getIntSpnGeneral() && vcs.getSpnGeneral().isEnabled()
					|| (!vcs.getSpnGeneral().isEnabled() && sillasGenerales > 0)) {

				JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

			} else if (sillasPreferenciales != vcs.getIntSpnPreferencial() && vcs.getSpnPreferencial().isEnabled()) {

				JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

			} else {

				if (!vcs.getSpnGeneral().isEnabled() && sillasGenerales > 0) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

				} else if (!vcs.getSpnPreferencial().isEnabled() && sillasPreferenciales > 0) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione la cantidad correcta");

				} else {
					System.out.println("Ingreso a la Ventana de Snacks");
					vcs.setVisible(false);
					vs.setVisible(true);
				}
			}

		} else {

			JOptionPane.showMessageDialog(null, "Porfavor seleccione asiento(s) para continuar", "NO Asiento",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	/**
	 * metodo que cambia de panel VentanaCompraSilla a VentanaIngresoCliente
	 * 
	 * @param vcs VentanaCompraSilla
	 * @param vic VentanaIngresoCliente
	 */
	public void regresoCompraSillaIngreso(VentanaCompraSilla vcs, VentanaIngresoCliente vic) {

		System.out.println("Regresó a Ventana Ingreso Cliente");
		vcs.setVisible(false);
		vic.setVisible(true);

	}

	/**
	 * metodo que actualiza las sillas disponibles que ve el usuario
	 * 
	 * @param vcs VentanaCompraSilla
	 */
	public void actualizarSillas(VentanaCompraSilla vcs) {

		Componentes = vcs.getComponentesSilla();

	}

	// // // // // // // // // VENTANA REGISTRO CLIENTE// // // // // // // // //
	/**
	 * metodo que cambia de panel VentanaIngresoCliente a VentanaRegistroCliente
	 * 
	 * @param vrc VentanaRegistroCliente
	 * @param vic VentanaIngresoCliente
	 */
	public void ingresoIngresoClienteRegistroCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		System.out.println("Ingresó a la Ventana de Registro");
		vic.setVisible(false);
		vrc.setVisible(true);

	}

	/**
	 * metodo que gestiona el registro de un cliente
	 * 
	 * @param vrc VentanaRegistroCliente
	 */
	public void registroClienteExitoso(VentanaRegistroCliente vrc) {

		if (!Verificar.esCorreo(vrc.getTxtCorreo().getText())) {
			JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
			vrc.getTxtCorreo().setText("");
		} else if (vrc.getTxtApellido().getText().isEmpty() || vrc.getTxtContraseña().getText().isEmpty()
				|| vrc.getTxtDocumento().getText().isEmpty() || vrc.getTxtNombre().getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco",
					JOptionPane.ERROR_MESSAGE);
			vrc.getBtnIngreso().setEnabled(false);
			vrc.getCbxAutorizacion().setSelected(false);

		} else {

			vrc.getBtnIngreso().setEnabled(true);
			System.out.println("Se registró con éxito!");
			// Se agrega el Cliente a la BDD
			miFabrica = new FabricaCliente(Integer.valueOf(vrc.getTxtDocumento().getText()),
					vrc.getTxtNombre().getText(), vrc.getTxtApellido().getText(), vrc.getTxtContraseña().getText(),
					vrc.getTxtCorreo().getText());
			create = miFabrica.crearRegistro();
			create.operacionCrud();

			vrc.getTxtApellido().setText("");
			vrc.getTxtNombre().setText("");
			vrc.getTxtDocumento().setText("");
			vrc.getTxtCorreo().setText("");
			vrc.getTxtContraseña().setText("");
		}

	}

	/**
	 * metodo que gestiona los checkbox seleccionados de la VentanaRegistroCliente
	 * 
	 * @param vrc VentanaRegistroCliente
	 */
	public void chechkBoxSelecionado(VentanaRegistroCliente vrc) {

		if (vrc.getCbxAutorizacion().isSelected()) {

			vrc.getBtnIngreso().setEnabled(true);

		} else {
			vrc.getBtnIngreso().setEnabled(false);
		}

	}

	/**
	 * metodo que cambia de panel VentanaRegistroCliente a VentanaIngresoCliente
	 * 
	 * @param vrc VentanaRegistroCliente
	 * @param vic VentanaInicioCliente
	 */
	public void regresoRegistroClienteIngresoCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {

		System.out.println("Regresó a ventana Ingreso Usuario");
		vrc.setVisible(false);
		vic.getPwdContraseña().setText("");
		vic.getFtxtCorreo().setText("");
		vic.setVisible(true);

	}

	/**
	 * metodo que gestiona el cambio de contraseña de un cliente
	 * 
	 * @param vrc VentanaRecuperarContrasena
	 */
	public void recuperarContraseña(VentanaRecuperarContrasena vrc) {

		if (Verificar.esCorreo(vrc.getTxtCorreo()) && !vrc.getTxtDocumento().getText().isEmpty()) {
			miFabrica = new FabricaCliente(vrc.getTxtCorreo());
			read = miFabrica.readRegistro();
			ArrayList arrayTemp = read.operacionCrud();
			// Se hace la verificación en la base de datos
			if (arrayTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "credenciales incorrectas");
			} else {
				JOptionPane.showMessageDialog(null,
						"Usuario:" + arrayTemp.get(3) + "\nContraseña: " + arrayTemp.get(2));
			}

		} else {
			JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);

		}

	}

	/**
	 * metodo que cambia de panel VentanaRecuperarContrasena a VentanaIngresoCliente
	 * 
	 * @param vic          VentanaIngresoCliente
	 * @param vrcontraseña VentanaRecuperarContrasena
	 */
	public void regresoRecuperarContraseñaIngresoCliente(VentanaIngresoCliente vic,
			VentanaRecuperarContrasena vrcontraseña) {

		System.out.println("Regresó a Ventana Ingreso");
		vrcontraseña.setVisible(false);
		vic.setVisible(true);

	}

	/**
	 * metodo que gestiona los spinner de silla general de VentanaCompraSilla
	 * 
	 * @param vcs VentanaCompraSilla
	 */
	public void activarSpinnerGeneral(VentanaCompraSilla vcs) {

		if (vcs.getRbtnGeneral().isSelected()) {
			vcs.getSpnGeneral().setEnabled(true);
		} else {
			vcs.getSpnGeneral().setEnabled(false);
		}

	}

	/**
	 * metodo que gestiona los spinner de silla preferencial de VentanaCompraSilla
	 * 
	 * @param vcs VentanaCompraSilla
	 */
	public void activarSpinnerPreferencial(VentanaCompraSilla vcs) {

		if (vcs.getRbtnPreferencial().isSelected()) {
			vcs.getSpnPreferencial().setEnabled(true);
		} else {
			vcs.getSpnPreferencial().setEnabled(false);
		}

	}

	// // // // // // // // // VENTANA SNACKS// // // // // // // // //
	/**
	 * metodo que cambia de panel VentanaSnacks a VentanaPago
	 * 
	 * @param vs VentanaSnacks
	 * @param vp VentanaPago
	 */
	public void ingresoSnacksPago(VentanaSnacks vs, VentanaPago vp) {

		System.out.println("ingresó a VentanaPago");
		vs.setVisible(false);
		vp.setVisible(true);
	}

	/**
	 * metodo que gestiona el combo1 de VentanaSnacks
	 * 
	 * @param vs VentanaSnacks
	 */
	public void obtenerCombo1(VentanaSnacks vs) {

		if (vs.getTbtnImgCombo1().isSelected()) {
			ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1.png");
			vs.getTbtnImgCombo1()
					.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo1().getWidth(),
							vs.getTbtnImgCombo1().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo1().setEnabled(true);
		} else {
			ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1bn.png");
			vs.getTbtnImgCombo1()
					.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo1().getWidth(),
							vs.getTbtnImgCombo1().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo1().setEnabled(false);
		}

	}

	/**
	 * metodo que gestiona el combo2 de VentanaSnacks
	 * 
	 * @param vs VentanaSnacks
	 */
	public void obtenerCombo2(VentanaSnacks vs) {

		if (vs.getTbtnImgCombo2().isSelected()) {

			ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2.png");
			vs.getTbtnImgCombo2()
					.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo2().getWidth(),
							vs.getTbtnImgCombo2().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo2().setEnabled(true);
		} else {
			ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2bn.png");
			vs.getTbtnImgCombo2()
					.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo2().getWidth(),
							vs.getTbtnImgCombo2().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo2().setEnabled(false);
		}
	}

	/**
	 * metodo que gestiona el combo3 de VentanaSnacks
	 * 
	 * @param vs VentanaSnacks
	 */
	public void obtenerCombo3(VentanaSnacks vs) {

		if (vs.getTbtnImgCombo3().isSelected()) {

			ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3.png");
			vs.getTbtnImgCombo3()
					.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
							vs.getTbtnImgCombo3().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo3().setEnabled(true);
		} else {
			ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3bn.png");
			vs.getTbtnImgCombo3()
					.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
							vs.getTbtnImgCombo3().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo3().setEnabled(false);
		}

	}

	/**
	 * metodo que gestiona el combo4 de VentanaSnacks
	 * 
	 * @param vs VentanaSnacks
	 */
	public void obtenerCombo4(VentanaSnacks vs) {

		if (vs.getTbtnImgCombo4().isSelected()) {

			ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4.png");
			vs.getTbtnImgCombo4()
					.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
							vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo4().setEnabled(true);
		} else {
			ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4bn.png");
			vs.getTbtnImgCombo4()
					.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
							vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));
			vs.getSpnCombo4().setEnabled(false);
		}
	}

	/**
	 * metodo que controla la facturacion en VentanaSnacks
	 * 
	 * @param vs VentanaSnacks
	 */
	public void facturaConsola(VentanaSnacks vs) {

		if (vs.getIntSpnComb1() != 0 && vs.getSpnCombo1().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb1() + " Combos N°1.......................................$"
							+ vs.getIntSpnComb1() * 3500);

		}
		if (vs.getIntSpnComb2() != 0 && vs.getSpnCombo2().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb2() + " Combos N°2.......................................$"
							+ vs.getIntSpnComb2() * 2500);

		}
		if (vs.getIntSpnComb3() != 0 && vs.getSpnCombo3().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb3() + " Combos N°3.......................................$"
							+ vs.getIntSpnComb3() * 500);

		}
		if (vs.getIntSpnComb4() != 0 && vs.getSpnCombo4().isEnabled()) {

			System.out.println(
					"→ " + vs.getIntSpnComb4() + " Combos N°4.......................................$"
							+ vs.getIntSpnComb4() * 1500);

		}

	}

	/**
	 * metodo que cambia de panel VentanaSnacks a VentanaCompraSilla
	 * 
	 * @param vs  VentanaSnacks
	 * @param vcs VentanaCompraSilla
	 */
	public void regresoSnacksSilla(VentanaSnacks vs, VentanaCompraSilla vcs) {

		System.out.println("Regresó a Ventana Compra Silla");

		vs.setVisible(false);
		vcs.setVisible(true);

	}

	/**
	 * metodo que verifica que el usuario ingreso es administrador
	 * 
	 * @param vi VentanaInicio
	 * @return Boolean
	 */
	public Boolean esAdmin(VentanaInicio vi) {

		if (vi.getTxtNombre().equalsIgnoreCase("Admin") && vi.getTxtContraseña().equalsIgnoreCase("Admin")) {

			return true;
		} else {
			return false;
		}

	}

	/**
	 * metodo que cambia de panel VentanaInicio a VentanaAdmin
	 * 
	 * @param vi VentanaInicio
	 * @param va VentanaAdmin
	 */
	public void ingresoAdmin(VentanaInicio vi, VentanaAdmin va) {

		vi.setVisible(false);
		va.setVisible(true);

	}

	//////////////////////////////////////// VENTANA
	//////////////////////////////////////// ADMIN///////////////////////////////////////////////
	/**
	 * metodo que cambia de panel VentanaAdmin a VentanaInicio
	 * 
	 * @param vi VentanaInicio
	 * @param va VentanaAdmin
	 */
	public void cerrarSesionAdmin(VentanaInicio vi, VentanaAdmin va) {

		va.setVisible(false);
		vi.setVisible(true);

	}

	/**
	 * metodo que cambia de panel VentanaAdmin a VentanaEstablecerContrasena
	 * 
	 * @param vec VentanaEstablecerContrasena
	 * @param va  VentanaAdmin
	 */
	public void ingresoAdminContraseña(VentanaEstablecerContrasena vec, VentanaAdmin va) {

		va.setVisible(false);
		vec.setVisible(true);

	}

	/**
	 * metodo que cambia de panel VentanaAdmin a VentanaRegistroUsuario
	 * 
	 * @param va  VentanaAdmin
	 * @param vru VentanaRegistroUsuario
	 */
	public void ingresoAdminRegistro(VentanaAdmin va, VentanaRegistroUsuario vru) {

		va.setVisible(false);
		vru.setVisible(true);
	}

	///////////////////////////////////////////// VENTANA ESTABLECER CONTRASEÑA
	///////////////////////////////////////////// ///////////////////////////////////7
	/**
	 * meotod que cambia de panel VentanaEstablecerContrasena a VentanaAdmin
	 * 
	 * @param vec
	 * @param va
	 */
	public void regresoContraseñaAdmin(VentanaEstablecerContrasena vec, VentanaAdmin va) {

		va.setVisible(true);
		vec.setVisible(false);

	}

	/**
	 * metodo que gestiona la VentanaEstablecerContrasena
	 * 
	 * @param vec VentanaEstablecerContrasena
	 * @return boolean
	 */
	public boolean establecerContraseñaExitoso(VentanaEstablecerContrasena vec) {

		if (vec.getFTxtCodigo().getText().isEmpty() || vec.getFTxtContraseña().getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco",
					JOptionPane.ERROR_MESSAGE);
			return false;

		} else {
			return true;
		}

	}

	///////////////////////////////////////////////////// VETNANA REGISTRO USUSARIO
	///////////////////////////////////////////////////// ////////////////////////////////////
	/**
	 * metodo que cambia de panel VentanaRegistroUsuario a VentanaAdmin
	 * 
	 * @param vru VentanaRegistroUsuario
	 * @param va  VentanaAdmin
	 */
	public void regresoRegistroAdmin(VentanaRegistroUsuario vru, VentanaAdmin va) {

		va.setVisible(true);
		vru.setVisible(false);

	}

	/**
	 * metodo que gestio el registro de un empleado
	 * 
	 * @param vru VentanaRegistroUsuario
	 */
	public void registroEmpleadoExitoso(VentanaRegistroUsuario vru) {

		if (vru.getFTxtContraseña().getText().isEmpty() || vru.getFTxtCorreo().getText().isEmpty()
				|| vru.getFTxtDocumento().getText().isEmpty() || vru.getFTxtNombre().getText().isEmpty()
				|| vru.getFTxtTelefono().getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco", "Espacios en blanco",
					JOptionPane.ERROR_MESSAGE);

		} else if (!Verificar.esCorreo(vru.getTxtCorreo())) {

			JOptionPane.showMessageDialog(null, "Ingrese un correo válido", "Error correo",
					JOptionPane.WARNING_MESSAGE);

		} else {
			String nombre = vru.getTxtNombre();
			String apellido = vru.getTxtApellido();
			String correo = vru.getTxtCorreo();
			String telefono = vru.getTxtTelefono();
			String multiplex = vru.getCmbMultiplex().getSelectedItem().toString();
			String cedula = vru.getTxtDocumento();
			String cargo = vru.getCmbCargo().getSelectedItem().toString();
			String contraseña = vru.getTxtContraseña();
			miFabrica = new FabricaEmpleado(Integer.valueOf(cedula), nombre, apellido, contraseña, telefono,
					LocalDate.now().toString(), multiplex(multiplex), cargo(cargo));
			create = miFabrica.crearRegistro();

			create.operacionCrud();
			String codigo = "" + nombre.substring(0, 4) + multiplexString(multiplex)
					+ String.valueOf(cedula).substring(0, 5);

			JOptionPane.showMessageDialog(null, "Registro del empleado " + codigo + " exitoso!");
			vru.getFTxtDocumento().setText("");
			vru.getFTxtApellido().setText("");
			vru.getFTxtNombre().setText("");
			vru.getFTxtCorreo().setText("");
			vru.getFTxtTelefono().setText("");
			vru.getFTxtContraseña().setText("");
		}

	}

	///////////////////////////////////////////////////// VETNANA PAGO
	///////////////////////////////////////////////////// ////////////////////////////////////
	public int cargo(String cargo) {
		switch (cargo) {
			case "Director":
				return 1;
			case "Cajero":
				return 2;
			case "Despachador Comida":
				return 3;
			case "Encargado Sala":
				return 4;
			case "Aseador":
				return 5;
			default:
				return 0;
		}
	}

	private String multiplexString(String multi) {
		switch (multi) {
			case "Titan":
				return "titan";
			case "Unicentro":
				return "unice";
			case "Plaza Central":
				return "plaza";
			case "Gran Estación":
				return "granE";
			case "Embajador":
				return "embaj";
			case "LasAmericas":
				return "LasAm";
			default:
				return "";
		}
	}

	public int multiplex(String multiplex) {
		switch (multiplex) {
			case "Titan":
				return 1;
			case "Unicentro":
				return 2;
			case "Plaza Central":
				return 3;
			case "Gran Estacion":
				return 4;
			case "Embajador":
				return 5;
			case "LasAmericas":
				return 6;
			default:
				return 0;
		}
	}

	/**
	 * metodoq que gestiona las imagenes de pagos
	 * 
	 * @param vpago VentanaPago
	 */
	public void obtenerPago(VentanaPago vpago) {

		if (vpago.getTbtnBitcoin().isSelected() || vpago.getTbtnPaypal().isSelected()) {

			if (vpago.getTbtnPaypal().isSelected()) {
				ImageIcon Paypal = new ImageIcon("src/main/resources/img/imgBtnPypal.png");
				vpago.getTbtnPaypal()
						.setIcon(new ImageIcon(Paypal.getImage().getScaledInstance(vpago.getTbtnPaypal().getWidth(),
								vpago.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
				vpago.getTbtnBitcoin().setSelected(false);
			} else {
				ImageIcon Paypalbn = new ImageIcon("src/main/resources/img/imgBtnPypalbn.png");
				vpago.getTbtnPaypal()
						.setIcon(new ImageIcon(Paypalbn.getImage().getScaledInstance(vpago.getTbtnPaypal().getWidth(),
								vpago.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
			}

			if (vpago.getTbtnBitcoin().isSelected()) {
				ImageIcon Btc = new ImageIcon("src/main/resources/img/imgBtnBitcoin.png");
				vpago.getTbtnBitcoin()
						.setIcon(new ImageIcon(Btc.getImage().getScaledInstance(vpago.getTbtnBitcoin().getWidth(),
								vpago.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));
				vpago.getTbtnPaypal().setSelected(false);
			} else {
				ImageIcon BtcBn = new ImageIcon("src/main/resources/img/imgBtnBitcoinbn.png");
				vpago.getTbtnBitcoin()
						.setIcon(new ImageIcon(BtcBn.getImage().getScaledInstance(vpago.getTbtnBitcoin().getWidth(),
								vpago.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));
			}

		} else {

			JOptionPane.showMessageDialog(null, "Porfavor, Seleccione método de pago", "Pago inválido",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * metodo que gestiona el pago del cliente
	 * 
	 * @param vcs       VentanaCompraSilla
	 * @param vs        VentanaSnacks
	 * @param vi        VentanaInicio
	 * @param vic       VentanaIngresoCliente
	 * @param vpelicula VentanaPelicula
	 */
	public void pagoFinal(VentanaCompraSilla vcs, VentanaSnacks vs, VentanaInicio vi, VentanaIngresoCliente vic,
			VentanaPelicula vpelicula) {

		int SillasGenerales = (vcs.getIntSpnGeneral() * 11000);
		int SillasPreferenciales = (vcs.getIntSpnPreferencial() * 15000);
		int Combo1 = (vs.getIntSpnComb1() * 3500);
		int Combo2 = (vs.getIntSpnComb2() * 2500);
		int Combo3 = (vs.getIntSpnComb3() * 500);
		int Combo4 = (vs.getIntSpnComb4() * 1500);
		String SillasG = "";
		String SillasP = "";

		String NombreCliente = vic.getTxtCorreo();
		String NombreEmpleado = vi.getTxtNombre();

		String Precio = "\nEmpleado: " + NombreEmpleado + "\nCliente: " + NombreCliente + "\nCine Seleccionado: "
				+ (String) vpelicula.getCmbCinesDisponibles().getSelectedItem() + "\nPelicula: "
				+ vpelicula.getLblTitulo().getText();

		int Total = 0;

		Componentes = vcs.getComponentesSilla();

		// Sirve para saber que sillas generales estan seleccionadas:
		if (vcs.getIntSpnGeneral() != 0 && vcs.getRbtnGeneral().isSelected()) {

			for (int i = 0; i < 40; i++) {

				if (((JToggleButton) Componentes[i]).isSelected()) {
					SillasG += ((JToggleButton) Componentes[i]).getName() + "\n";
				}
			}
			Precio += "\n" + SillasG + "Sillas Generales ............$" + SillasGenerales + "\n";
			Total += SillasGenerales;

		}

		// sirve para saber que sillas Preferenciales estan seleccionadas
		if (vcs.getIntSpnPreferencial() != 0 && vcs.getRbtnPreferencial().isSelected()) {

			for (int j = 40; j < 60; j++) {

				if (((JToggleButton) Componentes[j]).isSelected()) {
					SillasP += ((JToggleButton) Componentes[j]).getName() + "\n";
				}
			}
			Precio += "\n" + SillasP + "Sillas Preferenciales:............$" + SillasPreferenciales + "\n";
			Total += SillasPreferenciales;

		}

		// sirve para conocer que combos seleccionó
		if (vs.getIntSpnComb1() != 0 && vs.getSpnCombo1().isEnabled()) {
			Precio += "\nCombo(s) 1..........................$" + Combo1;
			Total += Combo1;
		}
		if (vs.getIntSpnComb2() != 0 && vs.getSpnCombo2().isEnabled()) {
			Precio += "\nCombo(s) 2..........................$" + Combo2;
			Total += Combo2;
		}
		if (vs.getIntSpnComb3() != 0 && vs.getSpnCombo3().isEnabled()) {
			Precio += "\nCombo(s) 3..........................$" + Combo3;
			Total += Combo3;
		}
		if (vs.getIntSpnComb4() != 0 && vs.getSpnCombo4().isEnabled()) {
			Precio += "\nCombo(s) 4..........................$" + Combo4;
			Total += Combo4;
		}

		// El total de la factura
		Precio += "\n\n\nTotal...................................$" + Total;
		JOptionPane.showMessageDialog(null, Precio, "Factura", JOptionPane.PLAIN_MESSAGE);

		vic.setTxtCorreo("");
		vic.setPwdContraseña("");

		// recoge los botones de el panel para inhabilitarlos

		for (int k = 0; k < Componentes.length; k++) {

			if (((JToggleButton) Componentes[k]).isSelected()) {

				((JToggleButton) Componentes[k]).setSelected(false);
				((JToggleButton) Componentes[k]).setBackground(Color.red);
				((JToggleButton) Componentes[k]).setEnabled(false);
			}
		}

	}

	/**
	 * metodo que reinicia el pago del cliente
	 * 
	 * @param vcs   VentanaCompraSilla
	 * @param vs    VentanaSnacks
	 * @param vp    VentanaPago
	 * @param vpeli VentanaPelicula
	 */
	public void reiniciar(VentanaCompraSilla vcs, VentanaSnacks vs, VentanaPago vp, VentanaPelicula vpeli) {

		vcs.getSpnGeneral().setValue(1);
		vcs.getSpnGeneral().setEnabled(false);
		vcs.getSpnPreferencial().setValue(1);
		vcs.getSpnPreferencial().setEnabled(false);
		vcs.getRbtnGeneral().setSelected(false);
		vcs.getRbtnPreferencial().setSelected(false);

		vs.getTbtnImgCombo1().setSelected(false);
		vs.getSpnCombo1().setEnabled(false);
		vs.getSpnCombo1().setValue(1);
		ImageIcon imagenCombo1 = new ImageIcon("src/main/resources/img/combos/imgCombo1bn.png");
		vs.getTbtnImgCombo1()
				.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
						vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));

		vs.getTbtnImgCombo2().setSelected(false);
		vs.getSpnCombo2().setEnabled(false);
		vs.getSpnCombo2().setValue(1);
		ImageIcon imagenCombo2 = new ImageIcon("src/main/resources/img/combos/imgCombo2bn.png");
		vs.getTbtnImgCombo2()
				.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
						vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));

		vs.getTbtnImgCombo3().setSelected(false);
		vs.getSpnCombo3().setEnabled(false);
		vs.getSpnCombo3().setValue(1);
		ImageIcon imagenCombo3 = new ImageIcon("src/main/resources/img/combos/imgCombo3bn.png");
		vs.getTbtnImgCombo3()
				.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(vs.getTbtnImgCombo3().getWidth(),
						vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));

		vs.getTbtnImgCombo4().setSelected(false);
		vs.getSpnCombo4().setEnabled(false);
		vs.getSpnCombo4().setValue(1);
		ImageIcon imagenCombo4 = new ImageIcon("src/main/resources/img/combos/imgCombo4bn.png");
		vs.getTbtnImgCombo4()
				.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(vs.getTbtnImgCombo4().getWidth(),
						vs.getTbtnImgCombo4().getHeight(), Image.SCALE_SMOOTH)));

		ImageIcon Paypalbn = new ImageIcon("src/main/resources/img/imgBtnPypal.png");
		vp.getTbtnPaypal().setIcon(new ImageIcon(Paypalbn.getImage().getScaledInstance(vp.getTbtnPaypal().getWidth(),
				vp.getTbtnPaypal().getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon BtcBn = new ImageIcon("src/main/resourcesx /img/imgBtnBitcoin.png");
		vp.getTbtnBitcoin().setIcon(new ImageIcon(BtcBn.getImage().getScaledInstance(vp.getTbtnBitcoin().getWidth(),
				vp.getTbtnBitcoin().getHeight(), Image.SCALE_SMOOTH)));

		vp.getButtonGroup().clearSelection();

		vpeli.getCmbCinesDisponibles().setSelectedIndex(0);

	}

	/**
	 * metodo que cambia de panel VentanaPago a VentanaSnacks
	 * 
	 * @param vs
	 * @param vp
	 */
	public void regresoPagoSnacks(VentanaSnacks vs, VentanaPago vp) {

		vs.setVisible(true);
		vp.setVisible(false);
	}

	/**
	 * metodo que cambia de panel VentanaPago a VentanaCartelera
	 * 
	 * @param vp VentanaPago
	 * @param vc VentanaCartelera
	 */
	public void regresoPagoCartelera(VentanaPago vp, VentanaCartelera vc) {

		vp.setVisible(false);
		vc.setVisible(true);

	}

}
