package com.alejandro.Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
/**
 * Panel para la ventana de pagos
 * @author alejandro
 * @version 1.0
 */
public class VentanaPago extends JPanel {
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * boton finalizar
         */
	private JButton btnFinalizar;
        /**
         * toggleButton paypal
         */
	private JToggleButton tbtnPaypal;
        /**
         * toggleButton bitcoin
         */
	private JToggleButton tbtnBitcoin;
        /**
         * grupo de botones
         */
	private ButtonGroup grupoToggle;

	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaPago() {

		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 700, 700);
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.add(pnlPrincipal);

		btnFinalizar = new JButton();
		btnFinalizar.setBounds(200, 550, 266, 59);
		btnFinalizar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnFinalizar.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./src/main/resources/img/imgBtnFinalizarCompra.png");
		btnFinalizar.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnFinalizar.getWidth(),
				btnFinalizar.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(btnFinalizar);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		ImageIcon imagenSalir = new ImageIcon("./src/main/resources/img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

		tbtnPaypal = new JToggleButton();
		tbtnPaypal.setBounds(269, 250, 152, 59);
		tbtnPaypal.setName("PayPal");
		tbtnPaypal.setContentAreaFilled(false);
		ImageIcon Paypal = new ImageIcon("./src/main/resources/img/imgBtnPypal.png");
		tbtnPaypal.setIcon(new ImageIcon(Paypal.getImage().getScaledInstance(tbtnPaypal.getWidth(),
				tbtnPaypal.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(tbtnPaypal);

		tbtnBitcoin = new JToggleButton();
		tbtnBitcoin.setBounds(269, 400, 152, 59);
		tbtnBitcoin.setName("BitCoin");
		tbtnBitcoin.setContentAreaFilled(false);
		ImageIcon Bitcoin = new ImageIcon("./src/main/resources/img/imgBtnBitcoin.png");
		tbtnBitcoin.setIcon(new ImageIcon(Bitcoin.getImage().getScaledInstance(tbtnBitcoin.getWidth(),
				tbtnBitcoin.getHeight(), Image.SCALE_SMOOTH)));
		pnlPrincipal.add(tbtnBitcoin);

		grupoToggle = new ButtonGroup();
		grupoToggle.add(tbtnBitcoin);
		grupoToggle.add(tbtnPaypal);

	}

	/**
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter boton finalizar 
	 * @return JButton
	 */
	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}
	/**
	 * getter toggleButton pagoPaypal
	 * @return JToggleButton
	 */
	public JToggleButton getTbtnPaypal() {
		return tbtnPaypal;
	}
	/**
	 * getter toggleButton pagoBitcoin
	 * @return JToggleButton
	 */
	public JToggleButton getTbtnBitcoin() {
		return tbtnBitcoin;
	}
	/**
	 * getter grupo de botones 
	 * @return ButtonGroup
	 */
	public ButtonGroup getButtonGroup() {
		return grupoToggle;
	}

}
