package com.alejandro.Presentacion;

import javax.swing.JFrame;
import com.alejandro.facade.*;

/**
 * Ventana principal que invoca a los demas paneles
 * @author alejandro
 * @version 1.0
 */
public class VistaControlador extends JFrame {
        /**
         * Fachada/modelo
         */
	private Fachada fachada;
        /**
         * Controlador de los eventos
         */
	private ControladorEvento control;
        /**
         * panel de ventana admin
         */
	private VentanaAdmin va;
        /**
         * panel de ventana recueperar contrasena
         */
	private VentanaRecuperarContrasena vrcontrasena;
        /**
         * panel de ventana cartelera
         */
	private VentanaCartelera vc;
        /**
         * panel de ventana compra sillas
         */
	private VentanaCompraSilla vcs;
        /**
         * panel de ventana establecer contrasena
         */
	private VentanaEstablecerContrasena vec;
        /**
         * panel de ventana ingreso de clientes
         */
	private VentanaIngresoCliente vic;
        /**
         * panel de ventana inicio
         */
	private VentanaInicio vi;
        /**
         * panel de ventana peliculas
         */
	private VentanaPelicula vp;
        /**
         * panel de ventana registro de cliente
         */
	private VentanaRegistroCliente vrc;
        /**
         * panel de ventana registro usuario
         */
	private VentanaRegistroUsuario vru;
        /**
         * panel de ventana snacks
         */
	private VentanaSnacks vs;
        /**
         * panel de ventana de pagos
         */
	private VentanaPago vpago;
	/**
	 * Constructor de la ventana principal del programa
	 * @param fachada define la fachada que representa al modelo 
	 */
	public VistaControlador(Fachada fachada) {

		this.fachada = fachada;
		iniciarComponentes();
		capturarEventos();
	}
	/**
	 * Inicializacion de los componentes de la ventana principal
	 */
	private void iniciarComponentes() {

		this.setTitle("Cine Distrito");
		this.setSize(700, 700);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		va = new VentanaAdmin();
		this.add(va);

		vrcontrasena = new VentanaRecuperarContrasena();
		this.add(vrcontrasena);

		vc = new VentanaCartelera();
		this.add(vc);

		vcs = new VentanaCompraSilla();
		this.add(vcs);

		vec = new VentanaEstablecerContrasena();
		this.add(vec);

		vic = new VentanaIngresoCliente();
		this.add(vic);

		vi = new VentanaInicio();
		this.add(vi);

		vp = new VentanaPelicula();
		this.add(vp);

		vrc = new VentanaRegistroCliente();
		this.add(vrc);

		vru = new VentanaRegistroUsuario();
		this.add(vru);

		vs = new VentanaSnacks();
		this.add(vs);

		vpago = new VentanaPago();
		this.add(vpago);

		vi.setVisible(true);

		vp.setVisible(false);
		va.setVisible(false);
		vc.setVisible(false);
		vcs.setVisible(false);
		vec.setVisible(false);
		vic.setVisible(false);
		vrcontrasena.setVisible(false);
		vrc.setVisible(false);
		vru.setVisible(false);
		vs.setVisible(false);
		vpago.setVisible(false);

	}
	// Método por el cual se da el control de los eventos de los componentes
	// interactivos de la interfaz
	/**
	 * getter controlador (MVC)
	 * @return ControladorEvento
	 */
	public ControladorEvento getControl() {
		if (control == null) {
			control = new ControladorEvento(this);
		}

		return control;

	}
	/**
	 * Anade los listeners de los eventos a los paneles
	 */
	private void capturarEventos() {

		vi.getBtnSalir().addActionListener(getControl());
		vi.getBtnIngreso().addActionListener(getControl());

		vc.getBtnSalir().addActionListener(getControl());
		vc.getBtnPeliculaEncanto().addActionListener(getControl());
		vc.getBtnPeliculaMoonfall().addActionListener(getControl());
		vc.getBtnPeliculaPaseo6().addActionListener(getControl());
		vc.getBtnPeliculaScream().addActionListener(getControl());
		vc.getBtnPeliculaSpiderman().addActionListener(getControl());

		vp.getBtnContinue().addActionListener(getControl());
		vp.getBtnSalir().addActionListener(getControl());
		vp.getCmbCinesDisponibles().addActionListener(getControl());

		vic.getBtnSalir().addActionListener(getControl());
		vic.getBtnIngreso().addActionListener(getControl());
                vic.getBtnOlvidoContrasena().addActionListener(getControl());
		vic.getBtnRegistroUsuario().addActionListener(getControl());

		vcs.getBtnContinue().addActionListener(getControl());
		vcs.getBtnSalir().addActionListener(getControl());
		//
		for (int i = 0; i < vcs.getArrayBotones().size(); i++) {
			vcs.getArrayBotones().get(i).addActionListener(getControl());
		}
		//
		vcs.getRbtnGeneral().addActionListener(getControl());
		vcs.getRbtnPreferencial().addActionListener(getControl());

		vrc.getBtnIngreso().addActionListener(getControl());
		vrc.getBtnSalir().addActionListener(getControl());
		vrc.getCbxAutorizacion().addActionListener(getControl());
		vrc.getTxtDocumento().addKeyListener(getControl());

		vrcontrasena.getBtnContinue().addActionListener(getControl());
		vrcontrasena.getBtnSalir().addActionListener(getControl());
		vrcontrasena.getTxtDocumento().addKeyListener(getControl());

		vs.getBtnContinue().addActionListener(getControl());
		vs.getBtnSalir().addActionListener(getControl());
		vs.getTbtnImgCombo1().addActionListener(getControl());
		vs.getTbtnImgCombo2().addActionListener(getControl());
		vs.getTbtnImgCombo3().addActionListener(getControl());
		vs.getTbtnImgCombo4().addActionListener(getControl());

		va.getBtnAgregarEmpleado().addActionListener(getControl());
		va.getBtnCambiarContrasena().addActionListener(getControl());
		va.getBtnCerrarSesion().addActionListener(getControl());

		vec.getBtnContinue().addActionListener(getControl());
		vec.getBtnSalir().addActionListener(getControl());

		vru.getBtnIngreso().addActionListener(getControl());
		vru.getBtnSalir().addActionListener(getControl());
		vru.getFTxtDocumento().addKeyListener(getControl());
		vru.getFTxtNombre().addKeyListener(getControl());
		vru.getFTxtTelefono().addKeyListener(getControl());
		vru.getFTxtApellido().addKeyListener(getControl());

		vpago.getTbtnBitcoin().addActionListener(getControl());
		vpago.getTbtnPaypal().addActionListener(getControl());
		vpago.getBtnFinalizar().addActionListener(getControl());
		vpago.getBtnSalir().addActionListener(getControl());

		//

	}
	/**
	 * getter panel de inicio
	 * @return VentanaInicio
	 */
	public VentanaInicio getVentanaInicio() {
		return vi;
	}
	/**
	 * getter panel de carteleras
	 * @return VentanaCartelera
	 */
	public VentanaCartelera getVentanaCartelera() {
		return vc;
	}
	/**
	 * getter panel de peliculas
	 * @return VentanaPelicula
	 */
	public VentanaPelicula getVentanaPelicula() {
		return vp;
	}
	/**
	 * getter panel de ingreso del cliente
	 * @return VentanaIngresoCliente
	 */
	public VentanaIngresoCliente getVentanaIngresoCliente() {
		return vic;
	}
	/**
	 * getter panel de compra de sillas
	 * @return VentanaCompraSilla
	 */
	public VentanaCompraSilla getVentanaCompraSilla() {
		return vcs;
	}
	/**
	 * getter panel de registro de clientes
	 * @return VentanaRegistroCliente
	 */
	public VentanaRegistroCliente getVentanaRegistroCliente() {
		return vrc;
	}
	/**
	 * getter panel recuperar contrasena
	 * @return VentanaRecuperarContrasena
	 */
	public VentanaRecuperarContrasena getVentanaRecuperarContrasena() {

		return vrcontrasena;
	}
	/**
	 * getter panel de snacks
	 * @return VentanaSnacks
	 */
	public VentanaSnacks getVentanaSnacks() {
		return vs;
	}
	/**
	 * getter panel de administradores
	 * @return VentanaAdmin
	 */
	public VentanaAdmin getVentanaAdmin() {
		return va;
	}
	/**
	 * getter panel establecer contrasena
	 * @return VentanaEstablecerContrasena
	 */
	public VentanaEstablecerContrasena getVentanaEstablecerContrasena() {
		return vec;
	}
	/**
	 * getter panel de registro  de usuario
	 * @return VentanaRegistroUsuario
	 */
	public VentanaRegistroUsuario getVentanaRegistroUsuario() {
		return vru;
	}
	/**
	 * getter panel de pagos
	 * @return VentanaPago
	 */
	public VentanaPago getVentanaPago() {
		return vpago;
	}
	/**
	 * getter fachada (modelo)/MVC
	 * @return Fachada
	 */
	public Fachada getFachada() {
		return fachada;
	}

}