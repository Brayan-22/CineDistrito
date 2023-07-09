package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Panel para la ventana de ingreso del cliente
 * @author alejandro
 * @version 1.0
 */
public class VentanaIngresoCliente extends JPanel {
	private String CineSeleccionado;
	private String PeliculaSeleccionada;

	private JPanel pnlPrincipal;
	private JPasswordField pwdContraseña;
	private JTextField txtCorreo;
	private JButton btnIngreso;
	private JButton btnSalir;
	private JButton btnOlvidoContraseña;
	private JButton btnRegistrarUsuario;

	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaIngresoCliente() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 500, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnIngreso);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		btnOlvidoContraseña = new JButton();

		btnOlvidoContraseña.setBounds(20, 600, 300, 40);
		btnOlvidoContraseña.setContentAreaFilled(false);
		btnOlvidoContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnOlvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenOlvidoContraseña = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgOlvidoContraseña.png");

		btnOlvidoContraseña.setIcon(
				new ImageIcon(imagenOlvidoContraseña.getImage().getScaledInstance(btnOlvidoContraseña.getWidth(),
						btnOlvidoContraseña.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnOlvidoContraseña);

		btnRegistrarUsuario = new JButton();
		btnRegistrarUsuario.setBounds(370, 600, 300, 40);
		btnRegistrarUsuario.setContentAreaFilled(false);
		btnRegistrarUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnRegistrarUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenRegistrarUsuario = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgRegistrarUsuario.png");

		btnRegistrarUsuario.setIcon(
				new ImageIcon(imagenRegistrarUsuario.getImage().getScaledInstance(btnRegistrarUsuario.getWidth(),
						btnRegistrarUsuario.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnRegistrarUsuario);

		JLabel lblIngresoUsuario = new JLabel();
		lblIngresoUsuario.setText("Ingreso Cliente");
		lblIngresoUsuario.setBounds(180, 40, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 44));

		pnlPrincipal.add(lblIngresoUsuario);

		JPanel pnlNombre = new JPanel();
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblCorreo = new JLabel();
		lblCorreo.setBounds(105, 20, 180, 30);
		lblCorreo.setText("Correo Electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlNombre.add(txtCorreo);

		pnlPrincipal.add(pnlNombre);

		JPanel pnlContraseña = new JPanel();
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(140, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(100, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);

		pnlPrincipal.add(pnlContraseña);

	}

	private void crearPanelPrincipal() {

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 500, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnIngreso);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		btnOlvidoContraseña = new JButton();

		btnOlvidoContraseña.setBounds(20, 600, 300, 40);
		btnOlvidoContraseña.setContentAreaFilled(false);
		btnOlvidoContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnOlvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenOlvidoContraseña = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgOlvidoContraseña.png");

		btnOlvidoContraseña.setIcon(
				new ImageIcon(imagenOlvidoContraseña.getImage().getScaledInstance(btnOlvidoContraseña.getWidth(),
						btnOlvidoContraseña.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnOlvidoContraseña);

		btnRegistrarUsuario = new JButton();
		btnRegistrarUsuario.setBounds(370, 600, 300, 40);
		btnRegistrarUsuario.setContentAreaFilled(false);
		btnRegistrarUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnRegistrarUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon imagenRegistrarUsuario = new ImageIcon(
				"cine_distrito/src/main/resources/img/imgRegistrarUsuario.png");

		btnRegistrarUsuario.setIcon(
				new ImageIcon(imagenRegistrarUsuario.getImage().getScaledInstance(btnRegistrarUsuario.getWidth(),
						btnRegistrarUsuario.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnRegistrarUsuario);

		JLabel lblIngresoUsuario = new JLabel();
		lblIngresoUsuario.setText("Ingreso Cliente");
		lblIngresoUsuario.setBounds(180, 40, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 44));

		pnlPrincipal.add(lblIngresoUsuario);

	}

	private void crearPanelNombre() {

		JPanel pnlNombre = new JPanel();
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblCorreo = new JLabel();
		lblCorreo.setBounds(105, 20, 180, 30);
		lblCorreo.setText("Correo Electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlNombre.add(txtCorreo);

		pnlPrincipal.add(pnlNombre);

	}

	private void crearPanelContraseña() {

		JPanel pnlContraseña = new JPanel();
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(140, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(100, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);

		pnlPrincipal.add(pnlContraseña);

	}

	/**
	 * verifica si el texto ingresado corresponde al formato de correo electronico
	 * @param Correo
	 * @return boolean
	 */
	private boolean esCorreo(String Correo) {
		Pattern patron = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher comparar = patron.matcher(Correo);
		return comparar.find();

	}
	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter boton ingresar
	 * @return JButton
	 */
	public JButton getBtnIngreso() {
		return btnIngreso;
	}
	/**
	 * setter cineSeleccionado
	 * @param cineSeleccionado String
	 */
	public void setCineSeleccionado(String cineSeleccionado) {
		CineSeleccionado = cineSeleccionado;
	}
	/**
	 * getter cine seleccionado
	 * @return String
	 */
	public String getCineSeleccionado() {
		return CineSeleccionado;
	}
	/**
	 * setter pelicula seleccionada
	 * @param peliculaSeleccionada String
	 */
	public void setPeliculaSeleccionada(String peliculaSeleccionada) {
		PeliculaSeleccionada = peliculaSeleccionada;
	}
	/**
	 * getter pelicula seleccionado
	 * @return String
	 */
	public String getPeliculaSeleccionada() {
		return PeliculaSeleccionada;
	}
	/**
	 * getter boton registrar usuario
	 * @return JButton
	 */
	public JButton getBtnRegistroUsuario() {
		return btnRegistrarUsuario;
	}
	/**
	 * getter boton olvido de contraseña
	 * @return JButton
	 */
	public JButton getBtnOlvidoContraseña() {
		return btnOlvidoContraseña;
	}
	/**
	 * getter texto del campo de correo
	 * @return String
	 */
	public String getTxtCorreo() {
		return txtCorreo.getText();
	}
	/**
	 * getter campo del correo
	 * @return JTextField
	 */
	public JTextField getFtxtCorreo() {

		return txtCorreo;
	}
	/**
	 * setter texto campo del correo
	 * @param n String
	 */
	public void setTxtCorreo(String n) {
		txtCorreo.setText(n);
	}
	/**
	 * getter campo de la contraseña
	 * @return JPasswordField
	 */
	public JPasswordField getPwdContraseña() {
		return pwdContraseña;
	}
	/**
	 * setter campo de la contraseña
	 * @param n String
	 */
	public void setPwdContraseña(String n) {
		pwdContraseña.setText(n);
	}

}
