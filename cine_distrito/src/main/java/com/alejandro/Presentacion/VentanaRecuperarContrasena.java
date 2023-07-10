package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel para la ventana de recuperar contraseña
 * @author alejandro
 * @version 1.0
 */
public class VentanaRecuperarContrasena extends JPanel {
        /**
         * panel principal
         */
	private JPanel pnlPrincipal;
        /**
         * campo de texto para el correo
         */
	private JTextField txtCorreo;
        /**
         * campo de texto para el documento
         */
	private JTextField txtDocumento;
        /**
         * boton continuar
         */
	private JButton btnContinue;
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * nombre cine
         */
	private String Cine;
        /**
         * nombre pelicula
         */
	private String Pelicula;
        /**
         * label contraseña
         */
	private JLabel lblContraseña;
        /**
         * label documento
         */
	private JLabel lblDocumento;
        /**
         * label correo
         */
	private JLabel lblCorreo;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaRecuperarContrasena() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnContinue = new JButton();
		btnContinue.setBounds(280, 520, 134, 54);
		btnContinue.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnContinue.png");
		btnContinue.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnContinue);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		lblContraseña = new JLabel();
		lblContraseña.setText("Recuperar Contraseña");
		lblContraseña.setBounds(130, 40, 500, 100);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 44));

		pnlPrincipal.add(lblContraseña);

		JPanel pnlDocumento = new JPanel();
		pnlDocumento.setLayout(null);
		pnlDocumento.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlDocumento.setOpaque(false);
		pnlDocumento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblDocumento = new JLabel();
		lblDocumento.setBounds(80, 20, 280, 30);
		lblDocumento.setText("Documento de Identidad");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlDocumento.add(lblDocumento);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(100, 75, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlDocumento.add(txtDocumento);

		pnlPrincipal.add(pnlDocumento);

		JPanel pnlCorreo = new JPanel();
		pnlCorreo.setLayout(null);
		pnlCorreo.setBounds(150, 350, 400, 130);
		pnlCorreo.setOpaque(false);
		pnlCorreo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblCorreo = new JLabel();
		lblCorreo.setBounds(110, 20, 200, 30);
		lblCorreo.setText("Correo electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlCorreo.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlCorreo.add(txtCorreo);

		pnlPrincipal.add(pnlCorreo);
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
	 * getter campo de texto para el correo
	 * @return JtextField
	 */
	public JTextField getFTxtCorreo() {
		return txtCorreo;
	}
	/**
	 * getter texto del campo de texto de correo
	 * @return String
	 */
	public String getTxtCorreo() {
		return txtCorreo.getText();
	}
	/**
	 * getter campo de texto para el documento
	 * @return JTextField
	 */
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	/**
	 * getter boton continuar
	 * @return JButton
	 */
	public JButton getBtnContinue() {
		return btnContinue;
	}
	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

}
