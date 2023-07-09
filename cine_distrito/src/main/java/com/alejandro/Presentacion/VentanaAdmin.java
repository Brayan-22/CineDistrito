package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Panel para la ventana de administrador
 * @author alejandro
 * @version 1.0
 */
public class VentanaAdmin extends JPanel {

	private JButton btnAgregarEmpleado;
	private JButton btnCambiarContraseña;
	private JButton btnCerrarSesion;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaAdmin() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(250, 580, 168, 49);
		btnCerrarSesion.setContentAreaFilled(false);
		ImageIcon imagenCerrarSesion = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnCerrarSesion.png");
		btnCerrarSesion.setIcon(new ImageIcon(imagenCerrarSesion.getImage()
				.getScaledInstance(btnCerrarSesion.getWidth(), btnCerrarSesion.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnCerrarSesion);

		btnAgregarEmpleado = new JButton();
		btnAgregarEmpleado.setBounds(110, 170, 186, 49);
		btnAgregarEmpleado.setContentAreaFilled(false);
		ImageIcon imagenAgregarEmpleado = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgBtnAgregarUsuario.png");
		btnAgregarEmpleado.setIcon(new ImageIcon(imagenAgregarEmpleado.getImage()
				.getScaledInstance(btnAgregarEmpleado.getWidth(), btnAgregarEmpleado.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnAgregarEmpleado);

		btnCambiarContraseña = new JButton();
		btnCambiarContraseña.setBounds(400, 170, 186, 49);
		btnCambiarContraseña.setContentAreaFilled(false);
		ImageIcon imagenCambiarContraseña = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgBtnCambiarContraseña.png");
		btnCambiarContraseña.setIcon(new ImageIcon(imagenCambiarContraseña.getImage().getScaledInstance(
				btnCambiarContraseña.getWidth(), btnCambiarContraseña.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnCambiarContraseña);

	}

	/**
	 * getter boton agregarEmpleado
	 * @return JButton
	 */
	public JButton getBtnAgregarEmpleado() {
		return btnAgregarEmpleado;
	}
	/**
	 * getter boton cambiarContraseña
	 * @return JButton
	 */
	public JButton getBtnCambiarContraseña() {
		return btnCambiarContraseña;
	}
	/**
	 * getter boton cerrar sesion
	 * @return JButton
	 */
	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

}
