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
 * Panel para la ventana de establecer contraseña
 * @author alejandro
 * @version 1.0
 */
public class VentanaEstablecerContrasena extends JPanel {
        /**
         * campo texto contraseña
         */
	private JTextField txtContraseña;
        /**
         * campo texto codigo
         */
	private JTextField txtCodigo;
        /**
         * boton continuar
         */
	private JButton btnContinue;
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * label contraseña
         */
	private JLabel lblContraseña;
        /**
         * label codigo
         */
	private JLabel lblCodigo;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaEstablecerContrasena() {

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
		lblContraseña.setText("Establecer Contraseña");
		lblContraseña.setBounds(130, 40, 500, 100);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 44));

		pnlPrincipal.add(lblContraseña);

		JPanel pnlCodigo = new JPanel();
		pnlCodigo.setLayout(null);
		pnlCodigo.setBounds(150, 190, 400, 130); 
		pnlCodigo.setOpaque(false);
		pnlCodigo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblCodigo = new JLabel();
		lblCodigo.setBounds(120, 20, 280, 30);
		lblCodigo.setText("Código Empleado");
		lblCodigo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlCodigo.add(lblCodigo);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(100, 75, 200, 30);
		txtCodigo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlCodigo.add(txtCodigo);

		pnlPrincipal.add(pnlCodigo);

		JPanel pnlContraseña = new JPanel();
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		lblContraseña = new JLabel();
		lblContraseña.setBounds(110, 20, 200, 30);
		lblContraseña.setText("Nueva Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(100, 75, 200, 30);
		txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(txtContraseña);

		pnlPrincipal.add(pnlContraseña);

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
	/**
	 * getter campo de texto de la contraseña
	 * @return JTextField
	 */
	public JTextField getFTxtContraseña() {
		return txtContraseña;
	}
	/**
	 * getter campo de texto del codigo
	 * @return JTextField
	 */
	public JTextField getFTxtCodigo() {
		return txtCodigo;
	}
	/**
	 * getter texto del campo de la contraseña
	 * @return String
	 */
	public String getTxtContraseña() {
		return txtContraseña.getText();
	}
	/**
	 * getter texto del campo del codigo
	 * @return String
	 */
	public String getTxtCodigo() {
		return txtCodigo.getText();
	}

}
