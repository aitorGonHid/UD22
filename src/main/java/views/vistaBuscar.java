package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.Control;
import javax.swing.SwingConstants;

public class vistaBuscar extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Control controller;
	private JLabel nombreLabel, apellidoLabel, direccionLabel, dniLabel, fechaLabel, idLabel;
	public JTextField nombreIn, apellidoIn, direccionIn, dniIn, fechaIn;
	private JButton buscarButton;
	private JTextField idIn;
	
	public vistaBuscar() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Labels
		idLabel = new JLabel("ID cliente:");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(10, 11, 93, 25);
		getContentPane().add(idLabel);
		
		nombreLabel = new JLabel("Nombre:");
		nombreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nombreLabel.setBounds(10, 45, 93, 25);
		getContentPane().add(nombreLabel);
		
		apellidoLabel = new JLabel("Apellido:");
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

		idIn = new JTextField();
		idIn.setBounds(107, 11, 100, 25);
		getContentPane().add(idIn);
		
		nombreIn = new JTextField();
		nombreIn.setEnabled(false);
		nombreIn.setBounds(107, 45, 100, 25);
		getContentPane().add(nombreIn);
		
		apellidoIn = new JTextField();
		apellidoIn.setEnabled(false);
		apellidoIn.setBounds(107, 81, 100, 25);
		getContentPane().add(apellidoIn);
		
		direccionIn = new JTextField();
		direccionIn.setEnabled(false);
		direccionIn.setBounds(107, 117, 100, 25);
		getContentPane().add(direccionIn);
		
		dniIn = new JTextField();
		dniIn.setEnabled(false);
		dniIn.setBounds(107, 151, 100, 25);
		getContentPane().add(dniIn);
		
		fechaIn = new JTextField();
		fechaIn.setEnabled(false);
		fechaIn.setBounds(107, 185, 100, 25);
		getContentPane().add(fechaIn);
		
		//Boton
		buscarButton = new JButton("Buscar");
		buscarButton.setBounds(87, 221, 120, 25);
		getContentPane().add(buscarButton);
	}
}
