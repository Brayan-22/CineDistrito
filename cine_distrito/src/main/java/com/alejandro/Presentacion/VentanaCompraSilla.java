package com.alejandro.Presentacion;

import com.alejandro.Logica.Principal.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * Panel para la ventana de compra de sillas
 * 
 * @author alejandro
 * @version 1.0
 */
public class VentanaCompraSilla extends JPanel {
        /**
         * boton salir 
         */
	private JButton btnSalir;
        /**
         * boton continuar
         */
	private JButton btnContinue;
        /**
         * componentes vector
         */
	private Component[] componentes;
        /**
         * arrayBotones
         */
	private ArrayList<JToggleButton> arrayBotones;
        /**
         * label sala actual
         */
	private JLabel lblSalaActual;
        /**
         * radioboton silla general
         */
	private JRadioButton rbtnGeneral;
        /**
         * radioboton silla preferencial
         */
	private JRadioButton rbtnPreferencial;
        /**
         * spinner silla general
         */
	private JSpinner spnGeneral;
        /**
         * spinner silla preferencial
         */
	private JSpinner spnPreferencial;
        /**
         * label pelicula
         */
	private JLabel lblPelicula;
        /**
         * label cine
         */
	private JLabel lblCine;
        /**
         * Logica de negocio principal
         */
	private Sistema sistema;


	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaCompraSilla() {
		sistema = new Sistema();
		lblCine = new JLabel();

		arrayBotones = new ArrayList<>();
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
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		btnContinue = new JButton();
		btnContinue.setBounds(400, 550, 154, 54);
		btnContinue.setContentAreaFilled(false);
		ImageIcon imagenContinue = new ImageIcon("./src/main/resources/img/imgBtnContinue.png");

		btnContinue.setIcon(new ImageIcon(imagenContinue.getImage().getScaledInstance(btnContinue.getWidth(),
				btnContinue.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnContinue);

		JPanel pnlSillas = new JPanel();
		GridLayout grid = new GridLayout(6, 10, 3, 3);
		pnlSillas.setBackground(Color.LIGHT_GRAY);
		pnlSillas.setBounds(250, 90, 418, 320);
		pnlSillas.setLayout(grid);
		pnlSillas.setOpaque(false);
		pnlSillas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		///////////////////////////////////////////

		ImageIcon imagenSilla = new ImageIcon("./src/main/resources/img/imgAsiento.png");
		ImageIcon imagenSillaPreferencial = new ImageIcon(
				"./src/main/resources/img/imgAsientoPreferencial.png");

		JPanel pnlComplementos = new JPanel();
		pnlComplementos.setBackground(Color.LIGHT_GRAY);
		pnlComplementos.setBounds(30, 90, 620, 470);
		pnlComplementos.setLayout(null);
		pnlComplementos.setOpaque(false);

		lblSalaActual = new JLabel();
		lblSalaActual.setBounds(0, 15, 190, 30);
		lblSalaActual.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblSalaActual);

		lblPelicula = new JLabel();
		lblPelicula.setBounds(0, 80, 200, 40);
		lblPelicula.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblPelicula);

		lblCine.setBounds(0, 120, 200, 40);
		lblCine.setFont((new Font("Comic Sans MS", 0, 18)));
		pnlComplementos.add(lblCine);

		JLabel lblTitulos = new JLabel();
		lblTitulos.setText("Costo     Boletos  Cantidad");
		lblTitulos.setBounds(0, 190, 400, 40);
		lblTitulos.setFont((new Font("Comic Sans MS", 1, 16)));
		pnlComplementos.add(lblTitulos);

		JLabel lblCostoGeneral = new JLabel();
		lblCostoGeneral.setText("$ 11.000");
		lblCostoGeneral.setBounds(0, 240, 100, 40);
		lblCostoGeneral.setFont((new Font("Comic Sans MS", 0, 11)));
		pnlComplementos.add(lblCostoGeneral);

		JLabel lblCostoPreferencial = new JLabel();
		lblCostoPreferencial.setText("$ 15.000");
		lblCostoPreferencial.setBounds(0, 290, 100, 40);
		lblCostoPreferencial.setFont((new Font("Comic Sans MS", 0, 11)));
		pnlComplementos.add(lblCostoPreferencial);

		rbtnGeneral = new JRadioButton();
		rbtnGeneral.setBounds(55, 240, 90, 40);
		rbtnGeneral.setText("General");
		rbtnGeneral.setOpaque(false);
		rbtnGeneral.setFont((new Font("Comic Sans MS", 0, 13)));
		pnlComplementos.add(rbtnGeneral);

		rbtnPreferencial = new JRadioButton();
		rbtnPreferencial.setBounds(55, 290, 115, 40);
		rbtnPreferencial.setText("Preferencial");
		rbtnPreferencial.setOpaque(false);
		rbtnPreferencial.setFont((new Font("Comic Sans MS", 0, 13)));
		pnlComplementos.add(rbtnPreferencial);

		SpinnerModel smG = new SpinnerNumberModel(1, 1, 9, 1);
		spnGeneral = new JSpinner(smG);
		spnGeneral.setBounds(160, 240, 50, 30);
		spnGeneral.setFont((new Font("Comic Sans MS", 0, 11)));
		spnGeneral.setEditor(new JSpinner.DefaultEditor(spnGeneral));
		spnGeneral.setEnabled(false);
		pnlComplementos.add(spnGeneral);

		SpinnerModel smP = new SpinnerNumberModel(1, 1, 9, 1);
		spnPreferencial = new JSpinner(smP);
		spnPreferencial.setBounds(160, 290, 50, 30);
		spnPreferencial.setFont((new Font("Comic Sans MS", 0, 11)));
		spnPreferencial.setEditor(new JSpinner.DefaultEditor(spnPreferencial));
		spnPreferencial.setEnabled(false);
		pnlComplementos.add(spnPreferencial);

		if (lblSalaActual.getText().equals("")) {
			lblSalaActual.setText("1");
		}
		sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).actualizarSalas();
		sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas()
				.get((Integer.valueOf(lblSalaActual.getText())) - 1).actualizasAsientos();
		for (int i = 1; i <= 60; i++) {
			JToggleButton botonTemp = new JToggleButton();
			botonTemp.setName("Silla: " + String.valueOf(sistema.getArrayMultiplex().get(Multiplex(lblCine.getText()))
					.getArraySalas().get(Integer.valueOf(lblSalaActual.getText()) - 1).getArrayAsientos().get(i - 1)
					.getCodigoAsiento()));
			if (sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas()
					.get(Integer.valueOf(lblSalaActual.getText()) - 1).getArrayAsientos().get(i - 1)
					.getTipoAsiento() == 1) {
				botonTemp.setIcon(new ImageIcon(imagenSilla.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			} else {
				botonTemp.setIcon(new ImageIcon(
						imagenSillaPreferencial.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			}
			if (sistema.getArrayMultiplex().get(Multiplex(lblCine.getText())).getArraySalas()
					.get(Integer.valueOf(lblSalaActual.getText()) - 1).getArrayAsientos().get(i - 1)
					.getEstadoAsiento() == 2) {
				botonTemp.setBackground(Color.red);
				botonTemp.setEnabled(false);
			} else {
				botonTemp.setBackground(Color.green);
			}
			pnlSillas.add(botonTemp);
			arrayBotones.add(botonTemp);
		}

		pnlPrincipal.add(pnlSillas);

		pnlPrincipal.add(pnlComplementos);

		componentes = pnlSillas.getComponents();

	}

	private int Multiplex(String multiplex) {
		switch (multiplex) {
			case "Cine: titan":
				return 0;
			case "Cine: unicentro":
				return 1;
			case "Cine: plaza centra":
				return 2;
			case "Cine: gran estacion":
				return 3;
			case "Cine: emabajador":
				return 4;
			case "Cine: Las americas":
				return 5;
			default:
				return 0;
		}
	}

	/**
	 * getter boton salir
	 * 
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * getter boton continuar
	 * 
	 * @return JButton
	 */
	public JButton getBtnContinue() {
		return btnContinue;
	}

	/**
	 * getter componentes del panel
	 * 
	 * @return Component[]
	 */
	public Component[] getComponentesSilla() {
		return componentes;
	}

	/**
	 * getter radioboton silla general
	 * 
	 * @return JRadioButton
	 */
	public JRadioButton getRbtnGeneral() {
		return rbtnGeneral;
	}

	/**
	 * getter radioboton silla preferencial
	 * 
	 * @return JRadioButton
	 */
	public JRadioButton getRbtnPreferencial() {
		return rbtnPreferencial;
	}
	/**
	 * getter Spinner sillas generales
	 * @return JSpinner
	 */
	public JSpinner getSpnGeneral() {
		return spnGeneral;
	}
	/**
	 * getter Spinner sillas preferenciales
	 * @return JSpinner
	 */
	public JSpinner getSpnPreferencial() {
		return spnPreferencial;
	}
	/**
	 * getter valor spinner sillas generales
	 * @return int
	 */
	public int getIntSpnGeneral() {
		return (Integer) spnGeneral.getValue();
	}
	/**
	 * getter valor spinner sillas preferenciales
	 * @return int
	 */
	public int getIntSpnPreferencial() {
		return (Integer) spnPreferencial.getValue();
	}
	/**
	 * getter JLabel sala actual
	 * @return JLabel
	 */
	public JLabel getLblSalaActual() {
		return lblSalaActual;
	}
	/**
	 * setter JLabel sala actual
	 * @param lblSalaActual JLabel
	 */
	public void setLblSalaActual(JLabel lblSalaActual) {
		this.lblSalaActual = lblSalaActual;
	}
	/**
	 * getter JLabel pelicula
	 * @return JLabel
	 */
	public JLabel getLblPelicula() {
		return lblPelicula;
	}
	/**
	 * getter JLabel cine
	 * @return JLabel
	 */
	public JLabel getLblCine() {
		return lblCine;
	}
	/**
	 * setter JLabel peliculas
	 * @param Pelicula String
	 */
	public void setLblPelicula(String Pelicula) {
		lblPelicula.setText("Pelicula: " + Pelicula);
	}
	/**
	 * setter JLabel cine
	 * @param Cine String
	 */
	public void setLblCine(String Cine) {
		lblCine.setText("Cine: " + Cine);
	}
	/**
	 * setter JLabel sala actual
	 * @param Sala String
	 */
	public void setLblSalaActual(String Sala) {
		lblSalaActual.setText(Sala);
	}
	/**
	 * getter JToggleButton 
	 * @return ArrayList
	 */
	public ArrayList<JToggleButton> getArrayBotones() {
		return arrayBotones;
	}
	/**
	 * setter arrayBotones
	 * @param arrayBotones ArrayList
	 */
	public void setArrayBotones(ArrayList<JToggleButton> arrayBotones) {
		this.arrayBotones = arrayBotones;
	}

}
