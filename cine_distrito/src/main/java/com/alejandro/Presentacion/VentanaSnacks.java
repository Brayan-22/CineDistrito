package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * Panel para la ventana de snacks
 * @author alejandro
 * @version 1.0
 */
public class VentanaSnacks extends JPanel {

	private JPanel pnlPrincipal;
	private JButton btnSalir;
	private JPanel pnlCombos;
	private JPanel pnlSnacks;

	private JSpinner spnCombo1;
	private JToggleButton tbtnImgCombo1;

	private JSpinner spnCombo2;
	private JToggleButton tbtnImgCombo2;

	private JSpinner spnCombo3;
	private JToggleButton tbtnImgCombo3;

	private JSpinner spnCombo4;
	private JToggleButton tbtnImgCombo4;

	private JButton btnContinuar;

	private String Pelicula;
	private String Cine;

	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaSnacks() {

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
		ImageIcon imagenSalir = new ImageIcon("cine_distrito/src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		JLabel lblSnacksDisponibles = new JLabel();
		lblSnacksDisponibles.setBounds(270, 40, 250, 30);
		lblSnacksDisponibles.setText("SNACKS DISPONIBLES");
		lblSnacksDisponibles.setFont(new Font("Comic Sans MS", 3, 16));

		pnlPrincipal.add(lblSnacksDisponibles);

		btnContinuar = new JButton();
		btnContinuar.setBounds(280, 580, 134, 54);
		btnContinuar.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("cine_distrito/src/main/resources/img/imgBtnContinue.png");
		btnContinuar.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnContinuar.getWidth(),
				btnContinuar.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnContinuar);

		pnlSnacks = new JPanel();
		pnlSnacks.setBackground(Color.LIGHT_GRAY);
		pnlSnacks.setBounds(50, 90, 600, 470);
		pnlSnacks.setLayout(null);
		pnlSnacks.setOpaque(false);
		pnlSnacks.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

		// Se crea el label que dice "Peliculas en cartelera"

		pnlCombos = new JPanel();
		//
		pnlCombos.setBounds(10, 30, 580, 420);
		pnlCombos.setPreferredSize(new Dimension(370, 1050));
		pnlCombos.setLayout(null);
		pnlCombos.setBackground(Color.GRAY);
		pnlSnacks.add(pnlCombos);

		JScrollPane Scroll = new JScrollPane(pnlCombos);

		Scroll.setBounds(5, 30, 585, 420);
		Scroll.setViewportView(pnlCombos);
		pnlSnacks.add(Scroll);
		pnlPrincipal.add(pnlSnacks);

		JLabel lblCombo1 = new JLabel();
		lblCombo1.setText("Combo N°1");
		lblCombo1.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo1.setBounds(30, 40, 151, 30);
		pnlCombos.add(lblCombo1);

		tbtnImgCombo1 = new JToggleButton();
		tbtnImgCombo1.setBounds(30, 70, 151, 150);
		ImageIcon imagenCombo1 = new ImageIcon("cine_distrito/src/main/resources/img/combos/imgCombo1bn.png");
		tbtnImgCombo1.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(tbtnImgCombo1.getWidth(),
				tbtnImgCombo1.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo1);

		SpinnerModel sm = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo1 = new JSpinner(sm);
		spnCombo1.setBounds(200, 180, 60, 40);
		spnCombo1.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo1.setEditor(new JSpinner.DefaultEditor(spnCombo1));
		spnCombo1.setEnabled(false);

		pnlCombos.add(spnCombo1);

		JLabel DescCombo1 = new JLabel();
		DescCombo1.setFont((new Font("Comic Sans MS", 0, 16)));
		DescCombo1.setText(
				"<html><body>1 Crispeta de sal 120 g + 2 perros calientes + 2 Gaseosas 640 ml + 1 Kit Kat 41 g + 1 chocolatina Jet 30 g");
		DescCombo1.setOpaque(false);
		DescCombo1.setBounds(200, 70, 350, 90);
		pnlCombos.add(DescCombo1);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////// 777

		JLabel lblCombo2 = new JLabel();
		lblCombo2.setText("Combo N°2");
		lblCombo2.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo2.setBounds(30, 280, 151, 30);
		pnlCombos.add(lblCombo2);

		tbtnImgCombo2 = new JToggleButton();
		tbtnImgCombo2.setBounds(30, 310, 151, 150);
		ImageIcon imagenCombo2 = new ImageIcon("cine_distrito/src/main/resources/img/combos/imgCombo2bn.png");
		tbtnImgCombo2.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(tbtnImgCombo2.getWidth(),
				tbtnImgCombo2.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo2);

		SpinnerModel sm1 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo2 = new JSpinner(sm1);
		spnCombo2.setBounds(200, 420, 60, 40);
		spnCombo2.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo2.setEditor(new JSpinner.DefaultEditor(spnCombo2));
		spnCombo2.setEnabled(false);

		pnlCombos.add(spnCombo2);

		JLabel DescCombo2 = new JLabel();
		DescCombo2.setFont((new Font("Comic Sans MS", 0, 16)));
		DescCombo2
				.setText("<html><body>1 Crispeta de sal 120 g + 1 perro caliente + 1 Gaseosa 640 ml + 1 Kit Kat 41 g");
		DescCombo2.setOpaque(false);
		DescCombo2.setBounds(200, 310, 350, 90);
		pnlCombos.add(DescCombo2);

		/////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCombo3 = new JLabel();
		lblCombo3.setText("Combo N°3");
		lblCombo3.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo3.setBounds(30, 550, 151, 30);
		pnlCombos.add(lblCombo3);

		tbtnImgCombo3 = new JToggleButton();
		tbtnImgCombo3.setBounds(30, 580, 151, 150);
		ImageIcon imagenCombo3 = new ImageIcon("cine_distrito/src/main/resources/img/combos/imgCombo3bn.png");
		tbtnImgCombo3.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(tbtnImgCombo3.getWidth(),
				tbtnImgCombo3.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo3);

		SpinnerModel sm3 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo3 = new JSpinner(sm3);
		spnCombo3.setBounds(200, 690, 60, 40);
		spnCombo3.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo3.setEditor(new JSpinner.DefaultEditor(spnCombo3));
		spnCombo3.setEnabled(false);

		pnlCombos.add(spnCombo3);

		JLabel DescCombo3 = new JLabel();
		DescCombo3.setFont((new Font("Comic Sans MS", 0, 16)));
		DescCombo3.setText("<html><body>1 Caja crispetas de sal 55 g + 1 Gaseosa 640 ml + 1 chocolatina Jet 30g");
		DescCombo3.setOpaque(false);
		DescCombo3.setBounds(200, 580, 350, 90);
		pnlCombos.add(DescCombo3);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel lblCombo4 = new JLabel();
		lblCombo4.setText("Combo N°4");
		lblCombo4.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo4.setBounds(30, 800, 151, 30);
		pnlCombos.add(lblCombo4);

		tbtnImgCombo4 = new JToggleButton();
		tbtnImgCombo4.setBounds(30, 830, 151, 150);
		ImageIcon imagenCombo4 = new ImageIcon("cine_distrito/src/main/resources/img/combos/imgCombo4bn.png");
		tbtnImgCombo4.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(tbtnImgCombo4.getWidth(),
				tbtnImgCombo4.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo4);

		SpinnerModel sm4 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo4 = new JSpinner(sm4);
		spnCombo4.setBounds(200, 940, 60, 40);
		spnCombo4.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo4.setEditor(new JSpinner.DefaultEditor(spnCombo4));
		spnCombo4.setEnabled(false);

		pnlCombos.add(spnCombo4);

		JLabel DescCombo4 = new JLabel();
		DescCombo4.setFont((new Font("Comic Sans MS", 0, 16)));
		DescCombo4.setText("<html><body>1 Crispeta de sal 150 g + 2 Gaseosas 640 ml");
		DescCombo4.setOpaque(false);
		DescCombo4.setBounds(200, 830, 350, 90);
		pnlCombos.add(DescCombo4);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}

	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter spinner combo1
	 * @return JSpinner
	 */
	public JSpinner getSpnCombo1() {
		return spnCombo1;
	}
	/**
	 * getter togglebutton combo1
	 * @return JToggleButton
	 */
	public JToggleButton getTbtnImgCombo1() {
		return tbtnImgCombo1;
	}
	/**
	 * getter spinner combo2
	 * @return JSpinner
	 */
	public JSpinner getSpnCombo2() {
		return spnCombo2;
	}
	/**
	 * getter togglebutton combo2
	 * @return JToggleButton
	 */
	public JToggleButton getTbtnImgCombo2() {
		return tbtnImgCombo2;
	}
	/**
	 * getter spinner combo3
	 * @return JSpinner
	 */
	public JSpinner getSpnCombo3() {
		return spnCombo3;
	}
	/**
	 * getter togglebutton combo3
	 * @return JToggleButton
	 */
	public JToggleButton getTbtnImgCombo3() {
		return tbtnImgCombo3;
	}
	/**
	 * getter spinner combo4
	 * @return JSpinner
	 */
	public JSpinner getSpnCombo4() {
		return spnCombo4;
	}
	/**
	 * getter toggleButton combo4
	 * @return JToggleButton 
	 */
	public JToggleButton getTbtnImgCombo4() {
		return tbtnImgCombo4;
	}
	/**
	 * getter boton continuar 
	 * @return JButton
	 */
	public JButton getBtnContinue() {
		return btnContinuar;
	}
	/**
	 * getter cantidad combo1
	 * @return int
	 */
	public int getIntSpnComb1() {

		return (Integer) spnCombo1.getValue();
	}
	/**
	 * getter cantidad combo2
	 * @return int
	 */
	public int getIntSpnComb2() {

		return (Integer) spnCombo2.getValue();
	}
	/**
	 * getter cantidad combo3
	 * @return int
	 */
	public int getIntSpnComb3() {

		return (Integer) spnCombo3.getValue();
	}
	/**
	 * getter cantidad combo4
	 * @return int
	 */
	public int getIntSpnComb4() {

		return (Integer) spnCombo4.getValue();
	}
}