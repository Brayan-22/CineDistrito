package com.alejandro.Presentacion;

import com.alejandro.Logica.Principal.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 * Panel para la ventana de peliculas
 * @author alejandro
 * @version 1.0
 */
public class VentanaPelicula extends JPanel {
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * label imagen de la pelicula
         */
	private JLabel imgPelicula;
        /**
         * combo box de los cines disponibles
         */
	public JComboBox<String> cmbCinesDisponibles;
        /**
         * boton continuar
         */
	private JButton btnContinue;
        /**
         * label titulo de la pelicula
         */
	private JLabel lblTitulo;
        /**
         * text area descripcion de la pelicula
         */
	private JTextArea txaDescripcion;
        /**
         * label limite de edad
         */
	private JLabel lblLimiteEdad;
        /**
         * label genero de pelicula
         */
	private JLabel lblGeneros;
        /**
         * label directores de la peliculas
         */
	private JLabel lblDirectores;
        /**
         * label directores peliculas
         */
	private JLabel lblDirectoresPelicula;
        /**
         * combo box salas disponibles
         */
	private JComboBox<String> cmbSalasDisponibles;
        /**
         * Logica de negocio principal
         */
	private Sistema sistema;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaPelicula() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		this.setBackground(Color.GRAY);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		this.add(btnSalir);

		btnContinue = new JButton();
		btnContinue.setBounds(400, 550, 154, 54);
		btnContinue.setContentAreaFilled(false);
		ImageIcon imagenContinue = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnContinue.png");

		btnContinue.setIcon(new ImageIcon(imagenContinue.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));

		this.add(btnContinue);

		imgPelicula = new JLabel();
		imgPelicula.setBounds(70, 100, 260, 410);
		imgPelicula.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));

		lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 100, 210, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));

		txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));

		lblLimiteEdad = new JLabel();
		lblLimiteEdad.setBounds(80, 520, 60, 90);

		lblGeneros = new JLabel();
		lblGeneros.setBounds(170, 540, 200, 65);
		lblGeneros.setFont(new Font("Andale Mono", 2, 18));
		lblGeneros.setForeground(Color.BLACK);

		lblDirectores = new JLabel();
		lblDirectores.setBounds(340, 340, 100, 20);
		lblDirectores.setFont(new Font("Comic Sans MS", 1, 15));
		lblDirectores.setText("Directores: ");

		lblDirectoresPelicula = new JLabel();
		lblDirectoresPelicula.setBounds(340, 350, 390, 50);
		lblDirectoresPelicula.setFont(new Font("Comic Sans MS", 0, 13));

		JLabel lblCinesDisponibles = new JLabel();
		lblCinesDisponibles.setBounds(340, 410, 150, 15);
		lblCinesDisponibles.setText("Cines Disponibles: ");
		lblCinesDisponibles.setFont(new Font("Comic Sans MS", 1, 15));

		this.add(lblCinesDisponibles);

		JLabel lblSalasDisponibles = new JLabel();
		lblSalasDisponibles.setBounds(510, 410, 150, 15);
		lblSalasDisponibles.setText("Salas disponibles: ");
		lblSalasDisponibles.setFont(new Font("Comic Sans MS", 1, 15));
		this.add(lblSalasDisponibles);
		cmbCinesDisponibles = new JComboBox<String>();
		cmbCinesDisponibles.setBounds(340, 430, 150, 20);
		cmbSalasDisponibles = new JComboBox<String>();
		cmbSalasDisponibles.setBounds(510, 430, 150, 20);
		sistema = new Sistema();
		for (int i = 0; i < 6; i++) {
			cmbCinesDisponibles.addItem((String) sistema.getArrayMultiplex().get(i).getNombreMultiplex());
		}

		this.add(cmbSalasDisponibles);
		this.add(cmbCinesDisponibles);

		this.add(lblGeneros);
		this.add(lblTitulo);
		this.add(imgPelicula);
		this.add(lblLimiteEdad);
		this.add(txaDescripcion);
		this.add(lblDirectores);
		this.add(lblDirectoresPelicula);

	}

	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter boton continuar 
	 * @return JButton
	 */
	public JButton getBtnContinue() {
		return btnContinue;
	}
	/**
	 * getter comboBox cines disponibles
	 * @return JComboBox
	 */
	public JComboBox<String> getCmbCinesDisponibles() {
		return cmbCinesDisponibles;
	}
	/**
	 * getter comboBox salas disponibles
	 * @return JComboBox
	 */
	public JComboBox<String> getCmbSalasDisponibles() {
		return cmbSalasDisponibles;
	}
	/**
	 * setter comboBox salas disponibles
	 * @param cmbSalasDisponibles JComboBox
	 */
	public void setCmbSalasDisponibles(JComboBox<String> cmbSalasDisponibles) {
		this.cmbSalasDisponibles = cmbSalasDisponibles;
	}
	/**
	 * getter Label generos peliculas
	 * @return JLabel
	 */
	public JLabel getLblGeneros() {
		return lblGeneros;
	}
	/**
	 * getter JLabel titulo pelicula
	 * @return JLabel
	 */
	public JLabel getLblTitulo() {
		return lblTitulo;
	}
	/**
	 * getter JLabel limite edad 
	 * @return JLabel 
	 */
	public JLabel getLblLimiteEdad() {
		return lblLimiteEdad;
	}
	/**
	 * getter JLabel directores pelicula
	 * @return JLabel
	 */
	public JLabel getLblDirectoresPelicula() {
		return lblDirectoresPelicula;
	}
	/**
	 * getter TextArea descripcion pelicula
	 * @return JTextArea
	 */
	public JTextArea getTxtDescripcion() {
		return txaDescripcion;
	}
	/**
	 * getter JLabel img pelicula
	 * @return JLabel
	 */
	public JLabel getLblImagen() {
		return imgPelicula;
	}


}
