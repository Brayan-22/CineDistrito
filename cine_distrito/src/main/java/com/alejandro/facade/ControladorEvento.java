package com.alejandro.facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.alejandro.Presentacion.*;

/**
 * Controlador de los eventos de la ventana principal /MVC
 * @author alejandro
 * @version 1.0
 */
public class ControladorEvento implements ActionListener, KeyListener {

	private VistaControlador interfaz;
	/**
	 * Constructor Controlador
	 * @param interfaz define la vista
	 */
	public ControladorEvento(VistaControlador interfaz) {

		this.interfaz = interfaz;

	}

	/**
	 * metodo para los listener de los botones
	 * @param e ActionEvent 
	 */
	public void actionPerformed(ActionEvent e) {

		// // // // // // // // // VENTANA INICyIO // // // // // // // // //
		if (e.getSource() == (interfaz.getVentanaInicio().getBtnSalir())) {
			System.out.println("SALIR");
			interfaz.getFachada().salir();
		}

		if (e.getSource() == interfaz.getVentanaInicio().getBtnIngreso()) {

			if (interfaz.getFachada().esAdmin(interfaz.getVentanaInicio())) {

				interfaz.getFachada().ingresoAdmin(interfaz.getVentanaInicio(), interfaz.getVentanaAdmin());
			} else {
				interfaz.getFachada().cambiarPanel(interfaz.getVentanaInicio(), interfaz.getVentanaCartelera());
			}

		}

		// // // // // // // // // VENTANA CARTELERA // // // // // // // // //

		// Boton Salir
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnSalir()) {

			interfaz.getVentanaInicio().getFTxtNombre().setText("");
			interfaz.getVentanaInicio().getPwdContrasena().setText("");
			interfaz.getFachada().cambiarPanel(interfaz.getVentanaCartelera(), interfaz.getVentanaInicio());
		}

		// Boton pelicula Encanto
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaEncanto()) {

			// interfaz.getFachada().cambiarPeliculaEncanto(interfaz.getVentanaCartelera(),interfaz.getVentanaPeliculaEncanto());
			interfaz.getFachada().setPelicula("Encanto", interfaz.getVentanaPelicula());
			interfaz.getFachada().cambiarCarteleraPelicula(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaMoonfall()) {

			// interfaz.getFachada().cambiarPeliculaMoonfall(interfaz.getVentanaCartelera(),
			// interfaz.getVentanaPeliculaMoonfall());
			interfaz.getFachada().setPelicula("Moonfall", interfaz.getVentanaPelicula());
			interfaz.getFachada().cambiarCarteleraPelicula(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaPaseo6()) {

			// interfaz.getFachada().cambiarPeliculaPaseo(interfaz.getVentanaCartelera(),
			// interfaz.getVentanaPeliculaPaseo6());
			interfaz.getFachada().setPelicula("Paseo6", interfaz.getVentanaPelicula());
			interfaz.getFachada().cambiarCarteleraPelicula(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaScream()) {

			// interfaz.getFachada().cambiarPeliculaScream(interfaz.getVentanaCartelera(),
			// interfaz.getVentanaPeliculaScream());
			interfaz.getFachada().setPelicula("Scream", interfaz.getVentanaPelicula());
			interfaz.getFachada().cambiarCarteleraPelicula(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaSpiderman()) {

			// interfaz.getFachada().cambiarPeliculaSpiderman(interfaz.getVentanaCartelera(),
			// interfaz.getVentanaPeliculaSpiderman());
			interfaz.getFachada().setPelicula("Spiderman", interfaz.getVentanaPelicula());
			interfaz.getFachada().cambiarCarteleraPelicula(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}

		// // // // // // // // // VENTANA PELICULAS // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaPelicula().getBtnSalir()) {

			interfaz.getFachada().regresoPeliculaCartelera(interfaz.getVentanaCartelera(),
					interfaz.getVentanaPelicula());

		}

		if (e.getSource() == interfaz.getVentanaPelicula().getBtnContinue()) {

			interfaz.getFachada().continueIngresoCliente(interfaz.getVentanaPelicula(),
					interfaz.getVentanaIngresoCliente());

		}
		if (e.getSource() == interfaz.getVentanaPelicula().getCmbCinesDisponibles()) {

			interfaz.getFachada().setPelicula(interfaz.getVentanaPelicula().getLblTitulo().getText(),
					interfaz.getVentanaPelicula());
		}

		// // // // // // // // // VENTANA INGRESO CLIENTE // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaIngresoCliente().getBtnIngreso()) {

			interfaz.getFachada().verificacionCliente(interfaz.getVentanaIngresoCliente(),
					interfaz.getVentanaCompraSilla(), interfaz.getVentanaPelicula());

		}
		if (e.getSource() == interfaz.getVentanaIngresoCliente().getBtnRegistroUsuario()) {

			interfaz.getFachada().ingresoIngresoClienteRegistroCliente(interfaz.getVentanaRegistroCliente(),
					interfaz.getVentanaIngresoCliente());

		}
		if (e.getSource() == interfaz.getVentanaIngresoCliente().getBtnOlvidoContrasena()) {

			interfaz.getFachada().ingresoIngresoClienteRecuperarContrasena(interfaz.getVentanaIngresoCliente(),
					interfaz.getVentanaRecuperarContrasena());

		}
		if (e.getSource() == interfaz.getVentanaIngresoCliente().getBtnSalir()) {

			interfaz.getFachada().regresoIngresoClientePelicula(interfaz.getVentanaIngresoCliente(),
					interfaz.getVentanaPelicula());
		}

		// // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaCompraSilla().getBtnContinue()) {

			interfaz.getFachada().sillasSeleccionadas(interfaz.getVentanaCompraSilla(), interfaz.getVentanaSnacks());

		}
		if (e.getSource() == interfaz.getVentanaCompraSilla().getBtnSalir()) {

			interfaz.getFachada().regresoCompraSillaIngreso(interfaz.getVentanaCompraSilla(),
					interfaz.getVentanaIngresoCliente());
		}

		if (e.getSource() == interfaz.getVentanaCompraSilla().getRbtnGeneral()) {

			interfaz.getFachada().activarSpinnerGeneral(interfaz.getVentanaCompraSilla());
		}
		if (e.getSource() == interfaz.getVentanaCompraSilla().getRbtnPreferencial()) {

			interfaz.getFachada().activarSpinnerPreferencial(interfaz.getVentanaCompraSilla());
		}

		// // // // // // // // // VENTANA REGISTRO CLIENTE// // // // // // // // //

		if (e.getSource() == interfaz.getVentanaRegistroCliente().getBtnIngreso()) {

			interfaz.getFachada().registroClienteExitoso(interfaz.getVentanaRegistroCliente());

		}
		if (e.getSource() == interfaz.getVentanaRegistroCliente().getCbxAutorizacion()) {

			interfaz.getFachada().chechkBoxSelecionado(interfaz.getVentanaRegistroCliente());
		}

		if (e.getSource() == interfaz.getVentanaRegistroCliente().getBtnSalir()) {

			interfaz.getFachada().regresoRegistroClienteIngresoCliente(interfaz.getVentanaRegistroCliente(),
					interfaz.getVentanaIngresoCliente());
		}

		// // // // // // // // // VENTANA RECUPERAR CONTRASEnA// // // // // // // //
		// //

		if (e.getSource() == interfaz.getVentanaRecuperarContrasena().getBtnSalir()) {

			interfaz.getFachada().regresoRecuperarContrasenaIngresoCliente(interfaz.getVentanaIngresoCliente(),
					interfaz.getVentanaRecuperarContrasena());
		}
		if (e.getSource() == interfaz.getVentanaRecuperarContrasena().getBtnContinue()) {

			interfaz.getFachada().recuperarContrasena(interfaz.getVentanaRecuperarContrasena());
		}

		// // // // // // // // // VENTANA SNACKS // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo1()) {

			interfaz.getFachada().obtenerCombo1(interfaz.getVentanaSnacks());
		}
		if (e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo2()) {

			interfaz.getFachada().obtenerCombo2(interfaz.getVentanaSnacks());
		}
		if (e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo3()) {

			interfaz.getFachada().obtenerCombo3(interfaz.getVentanaSnacks());
		}
		if (e.getSource() == interfaz.getVentanaSnacks().getTbtnImgCombo4()) {

			interfaz.getFachada().obtenerCombo4(interfaz.getVentanaSnacks());
		}
		if (e.getSource() == interfaz.getVentanaSnacks().getBtnContinue()) {

			interfaz.getFachada().facturaConsola(interfaz.getVentanaSnacks());
			interfaz.getFachada().ingresoSnacksPago(interfaz.getVentanaSnacks(), interfaz.getVentanaPago());

		}
		if (e.getSource() == interfaz.getVentanaSnacks().getBtnSalir()) {

			interfaz.getFachada().regresoSnacksSilla(interfaz.getVentanaSnacks(), interfaz.getVentanaCompraSilla());
		}

		// // // // // // // // // // // // // // // // VENTANA PAGO // // // // // //
		// // // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaPago().getTbtnBitcoin()) {

			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());

		}
		if (e.getSource() == interfaz.getVentanaPago().getTbtnPaypal()) {

			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());

		}
		if (e.getSource() == interfaz.getVentanaPago().getBtnFinalizar()) {

			interfaz.getFachada().obtenerPago(interfaz.getVentanaPago());
			interfaz.getFachada().pagoFinal(interfaz.getVentanaCompraSilla(), interfaz.getVentanaSnacks(),
					interfaz.getVentanaInicio(), interfaz.getVentanaIngresoCliente(), interfaz.getVentanaPelicula());
			interfaz.getFachada().reiniciar(interfaz.getVentanaCompraSilla(), interfaz.getVentanaSnacks(),
					interfaz.getVentanaPago(), interfaz.getVentanaPelicula());
			interfaz.getFachada().regresoPagoCartelera(interfaz.getVentanaPago(), interfaz.getVentanaCartelera());

		}
		if (e.getSource() == interfaz.getVentanaPago().getBtnSalir()) {
			interfaz.getFachada().regresoPagoSnacks(interfaz.getVentanaSnacks(), interfaz.getVentanaPago());

		}

		// // // // // // // // // // // // // // // // VENTANA ADMIN // // // // // //
		// // // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaAdmin().getBtnAgregarEmpleado()) {
			interfaz.getFachada().ingresoAdminRegistro(interfaz.getVentanaAdmin(),
					interfaz.getVentanaRegistroUsuario());
		}
		if (e.getSource() == interfaz.getVentanaAdmin().getBtnCambiarContrasena()) {
			interfaz.getFachada().ingresoAdminContrasena(interfaz.getVentanaEstablecerContrasena(),
					interfaz.getVentanaAdmin());
		}
		if (e.getSource() == interfaz.getVentanaAdmin().getBtnCerrarSesion()) {

			interfaz.getFachada().cerrarSesionAdmin(interfaz.getVentanaInicio(), interfaz.getVentanaAdmin());
		}

		// // // // // // // // // // // // // // // // VENTANA ESTABLECER CONTRASEnA //
		// // // // // // // // // // // // // // // //

		if (e.getSource() == interfaz.getVentanaEstablecerContrasena().getBtnSalir()) {

			interfaz.getFachada().regresoContrasenaAdmin(interfaz.getVentanaEstablecerContrasena(),
					interfaz.getVentanaAdmin());
		}
		if (e.getSource() == interfaz.getVentanaEstablecerContrasena().getBtnContinue()) {

			interfaz.getFachada().establecerContrasenaExitoso(interfaz.getVentanaEstablecerContrasena());
		}

		// // // // // // // // // // // // // // // // VENTANA AGREGAR EMPLEADO // //
		// // // // // // // // // // // // // // //
		if (e.getSource() == interfaz.getVentanaRegistroUsuario().getBtnSalir()) {

			interfaz.getFachada().regresoRegistroAdmin(interfaz.getVentanaRegistroUsuario(),
					interfaz.getVentanaAdmin());
		}
		if (e.getSource() == interfaz.getVentanaRegistroUsuario().getBtnIngreso()) {
			interfaz.getFachada().registroEmpleadoExitoso(interfaz.getVentanaRegistroUsuario());
		}

	}

	// Métodos obligatorios al implementar Key Listener
	@Override
	public void keyTyped(KeyEvent evt) {

		if (evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtDocumento()) {

			char c = evt.getKeyChar();
			if (c < '0' || c > '9')
				evt.consume();

		}
		if (evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtNombre()) {

			char c = evt.getKeyChar();
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();
		}
		if (evt.getSource() == interfaz.getVentanaRegistroCliente().getTxtApellido()) {

			char c = evt.getKeyChar();
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();

		}

		if (evt.getSource() == interfaz.getVentanaRecuperarContrasena().getTxtDocumento()) {
			char c = evt.getKeyChar();
			if (c < '0' || c > '9')
				evt.consume();

		}
		if (evt.getSource() == interfaz.getVentanaRegistroUsuario().getFTxtDocumento()) {

			char c = evt.getKeyChar();
			if (c < '0' || c > '9')
				evt.consume();
		}
		if (evt.getSource() == interfaz.getVentanaRegistroUsuario().getFTxtTelefono()) {

			char c = evt.getKeyChar();
			if (c < '0' || c > '9')
				evt.consume();
		}
		if (evt.getSource() == interfaz.getVentanaRegistroUsuario().getFTxtNombre()) {

			char c = evt.getKeyChar();
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();

		}
		if (evt.getSource() == interfaz.getVentanaRegistroUsuario().getFTxtApellido()) {

			char c = evt.getKeyChar();
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
				evt.consume();

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
