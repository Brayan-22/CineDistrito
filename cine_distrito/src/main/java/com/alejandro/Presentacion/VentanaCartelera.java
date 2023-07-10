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

/**
 * Panel para la ventana de cartelera
 * @author alejandro
 * @version 1.0
 */
public class VentanaCartelera extends JPanel{
        /**
         * boton salir
         */
	private JButton btnSalir;
        /**
         * boton pelicula encanto
         */
	private JButton peliculaEncanto;
	/**
         * boton pelicula moonfall
         */
        private JButton peliculaMoonfall;
	/**
         * boton pelicula paseo6
         */
        private JButton peliculaPaseo6;
	/**
         * boton pelicula scream
         */
        private JButton peliculaScream;
	/**
         * boton pelicula spiderman
         */
        private JButton peliculaSpiderman;
	/**
	 * Constructor que inicializa los componentes del panel
	 */
	public VentanaCartelera() {
		this.setBounds(0, 0, 700, 700);
		this.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setBounds(0, 0, 700, 700);
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
		
		JPanel pnlCartelera = new JPanel();
		pnlCartelera.setBackground(Color.LIGHT_GRAY);
		pnlCartelera.setBounds(50, 90, 600, 470);
		pnlCartelera.setLayout(null);
		pnlCartelera.setOpaque(false);
		pnlCartelera.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

		// Se crea el label que dice "Peliculas en cartelera"
		JLabel lblPeliculas = new JLabel();
		lblPeliculas.setBounds(180, 20, 250, 30);
		lblPeliculas.setText("PELICULAS EN CARTELERA");
		lblPeliculas.setFont(new Font("Comic Sans MS", 3, 16));

		pnlCartelera.add(lblPeliculas);

		
		JPanel pnlPeliculas = new JPanel();

		pnlPeliculas.setBounds(10, 70, 580, 390);
		pnlPeliculas.setPreferredSize(new Dimension (1050, 370));
		pnlPeliculas.setLayout(null);
		pnlPeliculas.setBackground(Color.GRAY);
		pnlCartelera.add(pnlPeliculas);

		JScrollPane Scroll = new JScrollPane(pnlPeliculas);

		// Es importante que tenga el mismo posicionamiento
		Scroll.setBounds(10, 70, 580, 390);
		Scroll.setViewportView(pnlPeliculas);

		pnlCartelera.add(Scroll);
		
		peliculaEncanto = new JButton();
		peliculaEncanto.setBounds(50, 10, 150, 225);
		peliculaEncanto.setContentAreaFilled(false);
		ImageIcon imagenEncanto = new ImageIcon("./src/main/resources/img/Encanto.jpg");

		peliculaEncanto.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(peliculaEncanto.getWidth(),
				peliculaEncanto.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaEncanto);
		
		JLabel lblPeliculaEncanto = new JLabel();
		lblPeliculaEncanto.setText("<html><body><center><strong>Encanto</strong></center> <br> Estreno:24 Nov 2021 <br>Género: Animación, Aventura </body></html>");
		lblPeliculaEncanto.setBounds(50, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaEncanto);
	
		//Moonfall
		peliculaMoonfall = new JButton();
		peliculaMoonfall.setBounds(250, 10, 150, 225);
		peliculaMoonfall.setContentAreaFilled(false);
		ImageIcon imagenMoonfall = new ImageIcon("./src/main/resources/img/Moonfall.jpg");

		peliculaMoonfall.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(peliculaMoonfall.getWidth(),
				peliculaMoonfall.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaMoonfall);
		
		JLabel lblPeliculaMoonfall = new JLabel();
		lblPeliculaMoonfall.setText("<html><body><center><strong>Moonfall</strong></center> <br> Estreno:3 Feb 2022 <br>Género: Acción, Ciencia Ficción </body></html>");
		lblPeliculaMoonfall.setBounds(250, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaMoonfall);
		
		//Paseo 6
		
		peliculaPaseo6 = new JButton();
		peliculaPaseo6.setBounds(450, 10, 150, 225);
		peliculaPaseo6.setContentAreaFilled(false);
		ImageIcon imagenPaseo6 = new ImageIcon("./src/main/resources/img/Paseo6.jpg");

		peliculaPaseo6.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(peliculaPaseo6.getWidth(),
				peliculaPaseo6.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaPaseo6);
		
		JLabel lblPeliculaPaseo6 = new JLabel();
		lblPeliculaPaseo6.setText("<html><body><center><strong>Paseo 6</strong></center> <br> Estreno:23 Dic 2021 <br>Género: Comedia </body></html>");
		lblPeliculaPaseo6.setBounds(450, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaPaseo6);
		
		//Scream
		
		peliculaScream = new JButton();
		peliculaScream.setBounds(650, 10, 150, 225);
		peliculaScream.setContentAreaFilled(false);
		ImageIcon imagenScream = new ImageIcon("./src/main/resources/img/Scream.jpg");

		peliculaScream.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(peliculaScream.getWidth(),
				peliculaScream.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaScream);
		
		JLabel lblPeliculaScream = new JLabel();
		lblPeliculaScream.setText("<html><body><center><strong>Scream</strong></center> <br> Estreno:13 Ene 2022 <br>Género: Terror </body></html>");
		lblPeliculaScream.setBounds(650, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaScream);
		
		//Spiderman
		
		peliculaSpiderman = new JButton();
		peliculaSpiderman.setBounds(850, 10, 150, 225);
		peliculaSpiderman.setContentAreaFilled(false);
		ImageIcon imagenSpiderman = new ImageIcon("./src/main/resources/img/Spiderman.jpg");

		peliculaSpiderman.setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(peliculaSpiderman.getWidth(),
				peliculaSpiderman.getHeight(), Image.SCALE_SMOOTH)));

		pnlPeliculas.add(peliculaSpiderman);
		
		JLabel lblPeliculaSpiderman = new JLabel();
		lblPeliculaSpiderman.setText("<html><body><center><strong>Spiderman</strong></center> <br> Estreno:16 Dic 2021 <br>Género: Aventura </body></html>");
		lblPeliculaSpiderman.setBounds(850, 250, 150, 75);
		
		pnlPeliculas.add(lblPeliculaSpiderman);
		
		pnlPrincipal.add(pnlCartelera);
		
		
	}
	
	
	
	/** 
	 * getter boton salir
	 * @return JButton
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * getter boton peliculaEncanto
	 * @return JButton
	 */
	public JButton getBtnPeliculaEncanto() {
		return peliculaEncanto;
	}
	/**
	 * getter boton peliculaMoonfall
	 * @return Jbutton
	 */
	public JButton getBtnPeliculaMoonfall() {
		return peliculaMoonfall;
	}
	/**
	 * getter boton peliculaPaseo6
	 * @return JButton
	 */
	public JButton getBtnPeliculaPaseo6() {
		return peliculaPaseo6;
	}
	/**
	 * getter boton peliculaScream
	 * @return JButton
	 */
	public JButton getBtnPeliculaScream() {
		return peliculaScream;
	}
	/**
	 * getter boton peliculaSpiderman
	 * @return JButton
	 */
	public JButton getBtnPeliculaSpiderman() {
		return peliculaSpiderman;
	}
	
	

}
