package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.Control;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
//import model.Persona;

public class vistaPrincipal extends JFrame{
	
	private Control controller;
	private JLabel accionLabel;
	private JButton registrarButton, buscarButton, eliminarButton, actualizarButton;
	
	public vistaPrincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Labels
		accionLabel = new JLabel("Que acción quieres realizar?");
		accionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accionLabel.setBounds(10, 11, 251, 25);
		getContentPane().add(accionLabel);
		
		//Buttons
		actualizarButton = new JButton("Actualizar");
		actualizarButton.setBounds(11, 93, 120, 25);
		getContentPane().add(actualizarButton);
		
		eliminarButton = new JButton("Eliminar");
		eliminarButton.setBounds(141, 93, 120, 25);
		getContentPane().add(eliminarButton);
		
		registrarButton = new JButton("Registrar");
		registrarButton.setBounds(10, 57, 120, 25);
		getContentPane().add(registrarButton);
		
		buscarButton = new JButton("Buscar");
		buscarButton.setBounds(140, 57, 120, 25);
		getContentPane().add(buscarButton);
	}
	
}
