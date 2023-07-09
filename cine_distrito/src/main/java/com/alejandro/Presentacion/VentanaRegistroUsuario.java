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
 * Panel para la ventana de registro de usuarios
 * @author alejandro
 * @version 1.0
 */
public class VentanaRegistroUsuario extends JPanel {

	private JButton btnSalir;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtContraseña;
	private JTextField txtDocumento;
	private JComboBox<String> cmbMultiplex;
	private JComboBox<String> cmbCargo;
	private JComboBox<String> cmbRol;
	private JCheckBox cbxAutorizacion;
	private JButton btnIngreso;
	private JLabel lblIngresoUsuario;
	private JTextField txtApellido;

	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaRegistroUsuario() {

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

		lblIngresoUsuario.setText("Registro Empleado");

		lblIngresoUsuario.setBounds(230, 0, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 26));

		pnlPrincipal.add(lblIngresoUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 580, 134, 54);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnRegistro.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnIngreso);

		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombre: ");
		lblNombre.setBounds(120, 110, 190, 30);
		lblNombre.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(120, 140, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtNombre);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblTelefono = new JLabel();
		lblTelefono.setText("Telefono: ");
		lblTelefono.setBounds(400, 210, 190, 30);
		lblTelefono.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(400, 240, 200, 30);
		txtTelefono.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtTelefono);

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
		lblContraseña.setBounds(400, 310, 150, 30);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));


		txtContraseña = new JTextField();
		txtContraseña.setBounds(400, 440, 200, 30);
		txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtContraseña);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblDocumento1 = new JLabel();
		lblDocumento1.setText("Cedula Ciudadania:  ");
		lblDocumento1.setBounds(400, 310, 190, 30);
		lblDocumento1.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblDocumento1);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(400, 340, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(txtDocumento);

		JLabel lblMultiplex = new JLabel();
		lblMultiplex.setText("Multiplex:  ");
		lblMultiplex.setBounds(120, 310, 190, 30);
		lblMultiplex.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblMultiplex);

		cmbMultiplex = new JComboBox<>();
		cmbMultiplex.addItem("Titan");
		cmbMultiplex.addItem("Unicentro");
		cmbMultiplex.addItem("Plaza Central");
		cmbMultiplex.addItem("Gran Estación");
		cmbMultiplex.addItem("Embajador");
		cmbMultiplex.addItem("LasAmericas");
		cmbMultiplex.setBounds(120, 340, 190, 30);
		cmbMultiplex.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbMultiplex);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCargo = new JLabel();
		lblCargo.setText("Cargo: ");
		lblCargo.setBounds(120, 410, 190, 30);
		lblCargo.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblCargo);

		cmbCargo = new JComboBox<>();
		cmbCargo.setBounds(120, 440, 200, 30);
		cmbCargo.addItem("Director");
		cmbCargo.addItem("Cajero");
		cmbCargo.addItem("Despachador Comida");
		cmbCargo.addItem("Encargado Sala");
		cmbCargo.addItem("Aseador");
		cmbCargo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

		pnlPrincipal.add(cmbCargo);

		JLabel lblRol = new JLabel();
		lblRol.setText("Contraseña: ");
		lblRol.setBounds(400, 410, 190, 30);
		lblRol.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));

		pnlPrincipal.add(lblRol);

		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellido: ");
		lblApellido.setBounds(400, 110, 190, 30);
		lblApellido.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		pnlPrincipal.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(400, 140, 200, 30);
		txtApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		pnlPrincipal.add(txtApellido);

	}

	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter campo de texto nombre
	 * @return JTextField
	 */
	public JTextField getFTxtNombre() {
		return txtNombre;
	}
	/**
	 * getter texto del campo de texto nombre
	 * @return String
	 */
	public String getTxtNombre() {
		return txtNombre.getText();
	}
	/**
	 * getter campo de texto telefono
	 * @return JTextField
	 */
	public JTextField getFTxtTelefono() {
		return txtTelefono;
	}
	/**
	 * getter texto del campo de texto del telefono
	 * @return String
	 */
	public String getTxtTelefono() {
		return txtTelefono.getText();
	}
	/**
	 * getter texto del campo de texto del correo
	 * @return String
	 */
	public String getTxtCorreo() {
		return txtCorreo.getText();
	}
	/**
	 * getter campo de texto correo
	 * @return JTextField
	 */
	public JTextField getFTxtCorreo() {
		return txtCorreo;
	}
	/**
	 * getter texto del campo de texto de contraseña 
	 * @return String
	 */
	public String getTxtContraseña() {
		return txtContraseña.getText();
	}
	/**
	 * getter campo de texto contraseña
	 * @return JTextField
	 */
	public JTextField getFTxtContraseña() {
		return txtContraseña;
	}
	/**
	 * getter campo de texto documento
	 * @return JTextField
	 */
	public JTextField getFTxtDocumento() {
		return txtDocumento;
	}
	/**
	 * getter texto del campo de texto documento
	 * @return String
	 */
	public String getTxtDocumento() {
		return txtDocumento.getText();
	}
	/**
	 * getter combo box multiplex
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getCmbMultiplex() {
		return cmbMultiplex;
	}
	/**
	 * getter combo box cargos
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getCmbCargo() {
		return cmbCargo;
	}
	/**
	 * getter combo box roles
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getCmbRol() {
		return cmbRol;
	}
	/**
	 * getter check box autorizacion 
	 * @return JCheckBox 
	 */
	public JCheckBox getCbxAutorizacion() {
		return cbxAutorizacion;
	}
	/**
	 * getter boton ingresar
	 * @return JButton
	 */
	public JButton getBtnIngreso() {
		return btnIngreso;
	}
	/**
	 * getter multiplex seleccionado
	 * @return String
	 */
	public String getSelectedMultiplex() {

		return (String) cmbMultiplex.getSelectedItem();
	}
	/**
	 * getter campo de texto apellidos
	 * @return JTextField
	 */
	public JTextField getFTxtApellido() {
		return txtApellido;
	}
	/**
	 * getter texto del campo de texto de apellidos
	 * @return String
	 */
	public String getTxtApellido() {
		return txtApellido.getText();
	}
	/**
	 * setter campo de texto apellidos
	 * @param txtApellido JTextField
	 */
	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

}
