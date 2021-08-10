package views;

import java.awt.*;

import javax.swing.*;

public class vistaOld extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel menu, insertarPanel, buscarPanel, eliminarPanel;
	private ButtonGroup menuGroup;
	private JButton insertarMenu, buscarMenu, eliminarMenu; //botones menu
	private JButton añadir, buscar, eliminar; //botones accion principal panel
	private JLabel nombre, apellido, direccion, dni, fecha; //etiquetas de campos
	public JTextField nombreIn, apellidoIn, direccionIn, dniIn, fechaIn;
	
	public vistaOld() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//paneles
		insertarPanel = new JPanel();
		insertarPanel.setLayout(new FlowLayout());
		
		buscarPanel = new JPanel();
		buscarPanel.setLayout(new FlowLayout());
		
		eliminarPanel = new JPanel();
		eliminarPanel.setLayout(new FlowLayout());
		
		menu = new JPanel();
		menu.setLayout(null);
		
		//menu
		insertarMenu = new JButton("Insertar");
		buscarMenu = new JButton("Buscar");
		eliminarMenu = new JButton("Eliminar");
		menuGroup = new ButtonGroup();
		menuGroup.add(insertarMenu);
		menuGroup.add(buscarMenu);
		menuGroup.add(eliminarMenu);
		
		//botones accion principal panel
		añadir = new JButton("Añadir");
		buscar = new JButton("Buscar");
		eliminar = new JButton("Eliminar");
		
		//etiquetas
		nombre = new JLabel("Nombre:");
		apellido = new JLabel("Apellidos:");
		direccion = new JLabel("Direccion:");
		dni = new JLabel("DNI:");
		fecha = new JLabel("Fecha nacimiento:");
		
		//campos texto
		nombreIn = new JTextField();
		apellidoIn = new JTextField();
		direccionIn = new JTextField();
		dniIn = new JTextField();
		fechaIn = new JTextField();
		
		//distribución componentes
		menu.add(insertarMenu);
		menu.add(buscarMenu);
		menu.add(eliminarMenu);
	}
}
