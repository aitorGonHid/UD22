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

public class vistaRegistrar extends JFrame{
	
	private Controller controller;
	private JLabel registrarLabel, nombreLabel, direccionLabel, dniLabel, fechaLabel;
	public JTextField nombreIn, apellidoIn, direccionIn, dniIn, fechaIn;
	private JButton añadirButton;
	
	public vistaRegistrar() {
		setTitle("Registrar cliente");
		getContentPane().setLayout(null);
		setBounds(400, 100, 284, 294);
		setVisible(false);
		
		//Labels
		registrarLabel = new JLabel("Introduce los valores de cada campo:");
		registrarLabel.setBounds(0, 10, 294, 25);
		registrarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(registrarLabel);
		
		nombreLabel = new JLabel("Nombre:");
		nombreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nombreLabel.setBounds(10, 45, 93, 25);
		getContentPane().add(nombreLabel);
		
		JLabel apellidoLabel = new JLabel("Apellido:");
		apellidoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		apellidoLabel.setBounds(10, 80, 93, 25);
		getContentPane().add(apellidoLabel);
		
		direccionLabel = new JLabel("Direccion:");
		direccionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		direccionLabel.setBounds(10, 115, 93, 25);
		getContentPane().add(direccionLabel);
		
		dniLabel = new JLabel("DNI:");
		dniLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dniLabel.setBounds(10, 150, 93, 25);
		getContentPane().add(dniLabel);
		
		fechaLabel = new JLabel("Fecha nacimiento:");
		fechaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		fechaLabel.setBounds(10, 185, 93, 25);
		getContentPane().add(fechaLabel);

		//TextFields
		nombreIn = new JTextField();
		nombreIn.setBounds(107, 45, 100, 25);
		getContentPane().add(nombreIn);
		
		apellidoIn = new JTextField();
		apellidoIn.setBounds(107, 81, 100, 25);
		getContentPane().add(apellidoIn);
		
		direccionIn = new JTextField();
		direccionIn.setBounds(107, 117, 100, 25);
		getContentPane().add(direccionIn);
		
		dniIn = new JTextField();
		dniIn.setBounds(107, 151, 100, 25);
		getContentPane().add(dniIn);
		
		fechaIn = new JTextField();
		fechaIn.setBounds(107, 185, 100, 25);
		getContentPane().add(fechaIn);
		
		//Boton
		añadirButton = new JButton("Añadir");
		añadirButton.setBounds(93, 221, 120, 25);
		getContentPane().add(añadirButton);
		
	}
	public void setControlador(Controller controlador) {
		this.controller = controlador;
	}
}
