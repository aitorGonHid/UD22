package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.Controller;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
//import model.Persona;

public class vistaPrincipal extends JFrame implements ActionListener{
	
	private Controller controller;
	private JLabel accionLabel;
	private JButton registrarButton, buscarButton, eliminarButton, actualizarButton;
	
	public vistaPrincipal() {
		setTitle("BBDD clientes");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 165);
		setVisible(true);
		
		//Labels
		accionLabel = new JLabel("Que acción quieres realizar?");
		accionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accionLabel.setBounds(10, 11, 251, 25);
		getContentPane().add(accionLabel);
		
		//Buttons
		actualizarButton = new JButton("Actualizar");
		actualizarButton.setBounds(11, 93, 120, 25);
		getContentPane().add(actualizarButton);
		actualizarButton.addActionListener(this);
		
		eliminarButton = new JButton("Eliminar");
		eliminarButton.setBounds(141, 93, 120, 25);
		getContentPane().add(eliminarButton);
		eliminarButton.addActionListener(this);
		
		registrarButton = new JButton("Registrar");
		registrarButton.setBounds(10, 57, 120, 25);
		getContentPane().add(registrarButton);
		registrarButton.addActionListener(this);
		
		buscarButton = new JButton("Buscar");
		buscarButton.setBounds(140, 57, 120, 25);
		getContentPane().add(buscarButton);
		buscarButton.addActionListener(this);
		
	}
	
	//Seleccionar vista
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource( ) == actualizarButton ) {
			controller.mostrarVistaActualizar();
		}
		if (e.getSource() == eliminarButton) {
			controller.mostrarVistaEliminar();
		}
		if (e.getSource() == registrarButton) {
			controller.mostrarVistaRegistrar();
		}
		if (e.getSource() == buscarButton) {
			controller.mostrarVistaBuscar();
		}
		
	}
	
	public void setControlador(Controller controlador) {
		this.controller = controlador;
	}
}
