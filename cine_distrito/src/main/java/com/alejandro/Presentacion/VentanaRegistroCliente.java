package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel para la ventana de registro de cliente
 * @author alejandro
 * @version 1.0
 */
public class VentanaRegistroCliente extends JPanel {
        /**
         * panel principal
         */
	private JPanel pnlPrincipal;
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * campo de texto nombre
         */
	private JTextField txtNombre;
        /**
         * campo de texto apellidos
         */
	private JTextField txtApellido;
        /**
         * campo de texto correo
         */
	private JTextField txtCorreo;
        /**
         * campo de texto contraseña
         */
	private JTextField txtContraseña;
        /**
         * campo de texto documento
         */
	private JTextField txtDocumento;
        /**
         * combo box tipo documento
         */
	private JComboBox<String> cmbDocumento;
        /**
         * check box autorizacion
         */
	private JCheckBox cbxAutorizacion;
        /**
         * boton ingresar
         */
	private JButton btnIngreso;
        /**
         * label ingreso usuario
         */
	private JLabel lblIngresoUsuario;
        /**
         * cadena cine
         */
	private String Cine;
        /**
         * cadena peliculas
         */
	private String Pelicula;

	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaRegistroCliente() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		lblIngresoUsuario = new JLabel();

		lblIngresoUsuario.setText("Registro clientes");

		lblIngresoUsuario.setBounds(230, 0, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 26));

		pnlPrincipal.add(lblIngresoUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 580, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnRegistro.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		btnIngreso.setEnabled(false);

		pnlPrincipal.add(btnIngreso);

		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombres: ");
		lblNombre.setBounds(120, 110, 150, 30);
		lblNombre.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(120, 140, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtNombre);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellidos: ");
		lblApellido.setBounds(400, 110, 150, 30);
		lblApellido.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(400, 140, 200, 30);
		txtApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtApellido);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCorreo = new JLabel();
		lblCorreo.setText("Correo electrónico: ");
		lblCorreo.setBounds(120, 210, 150, 30);
		lblCorreo.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(120, 240, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtCorreo);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblContraseña = new JLabel();
		lblContraseña.setText("Contraseña: ");
		lblContraseña.setBounds(400, 210, 150, 30);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblContraseña);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(400, 240, 200, 30);
		txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtContraseña);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblDocumento1 = new JLabel();
		lblDocumento1.setText("Documento de identidad: ");
		lblDocumento1.setBounds(120, 310, 190, 30);
		lblDocumento1.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblDocumento1);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(400, 340, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtDocumento);

		cmbDocumento = new JComboBox<>();
		cmbDocumento.addItem("Cédula de Ciudadania");
		cmbDocumento.setBounds(120, 340, 190, 30);
		cmbDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbDocumento);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		cbxAutorizacion = new JCheckBox();
		cbxAutorizacion.setBounds(120, 350, 400, 260);
		cbxAutorizacion.setContentAreaFilled(false);
		cbxAutorizacion.setText("<html>En cumplimiento del Régimen de Protección Datos Personales, "
				+ "autorizo expresamente a Cine Distrito, de manera directa, o a través de terceros "
				+ "designados, para almacenar, consultar, procesar y en general, para dar tratamiento "
				+ "a la información personal que suministre, y para ser incluido en sus bases de datos, "
				+ "recibir información de la Compañía, de conformidad con las políticas de privacidad "
				+ "y manejo de información.</html>");
		pnlPrincipal.add(cbxAutorizacion);

	}

	/**
	 * metodo para cambiar datos 
	 * @param Pelicula String
	 * @param Cine String
	 */
	public void enviarDatos(String Pelicula, String Cine) {

		this.Cine = Cine;
		this.Pelicula = Pelicula;

	}
	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter campo texto nombre
	 * @return JTextField
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	/**
	 * getter campo texto apellido
	 * @return JTextField
	 */
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	/**
	 * getter campo de texto correo
	 * @return JTextField
	 */
	public JTextField getTxtCorreo() {
		return txtCorreo;
	}
	/**
	 * getter campo de texto contraseña
	 * @return JTextField
	 */
	public JTextField getTxtContraseña() {
		return txtContraseña;
	}
	/**
	 * getter campo de texto documento
	 * @return JTextField
	 */
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	/**
	 * getter combo box documentos
	 * @return JComboBox
	 */
	public JComboBox<String> getCmbDocumento() {
		return cmbDocumento;
	}
	/**
	 * getter check box autorizacion 
	 * @return JCheckBox
	 */
	public JCheckBox getCbxAutorizacion() {
		return cbxAutorizacion;
	}
	/**
	 * getter boton ingresas
	 * @return JButton
	 */
	public JButton getBtnIngreso() {
		return btnIngreso;
	}
}
