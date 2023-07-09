package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * Panel para la ventana de inicio
 * @author alejandro
 * @version 1.0
 */
public class VentanaInicio extends JPanel {

	private JTextField txtNombre;
	private JPasswordField pwdContraseña;
	private JButton btnSalir;
	private JButton btnIngreso;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaInicio() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		JLabel lblImgUsuario = new JLabel();
		lblImgUsuario.setBounds(270, 20, 150, 150);
		ImageIcon imagenUsuario = new ImageIcon("cine_distrito/src/main/resources/img/imgalejandro.png");

		lblImgUsuario.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(lblImgUsuario.getWidth(),
				lblImgUsuario.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(lblImgUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 550, 134, 54);
		btnIngreso.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(btnIngreso);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 60);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/Exit.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		JPanel pnlNombre = new JPanel();
		pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(50, 190, 600, 130);
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		pnlPrincipal.add(pnlNombre);

		JLabel lblNombre = new JLabel();
		lblNombre.setBounds(250, 20, 80, 30);
		lblNombre.setText("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(200, 75, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlNombre.add(txtNombre);

		JPanel pnlContraseña = new JPanel();
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(50, 350, 600, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(250, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(200, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);

		pnlPrincipal.add(pnlContraseña);

	}

	/**
	 * getter boton salir
	 * @return JButton
	 */
	// Se hace para agregarle los escuchadores en el VistaControlador.Java
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
	 * getter campo contraseña
	 * @return JPasswordField
	 */
	public JPasswordField getPwdContraseña() {
		return pwdContraseña;
	}
	/**
	 * getter campo nombre
	 * @return JTextField
	 */
	public JTextField getFTxtNombre() {
		return txtNombre;
	}
	/**
	 * getter texto del campo de nombre
	 * @return String
	 */
	public String getTxtNombre() {
		return txtNombre.getText();
	}
	/**
	 * getter texto del campo de la contraseña
	 * @return String 
	 */
	public String getTxtContraseña() {
		String myPass = String.valueOf(pwdContraseña.getPassword());
		return myPass;
	}

}
