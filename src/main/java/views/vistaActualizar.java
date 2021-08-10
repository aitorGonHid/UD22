package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.Control;
import javax.swing.SwingConstants;

public class vistaActualizar extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Control controller;
	private JLabel nombreLabel, apellidoLabel, direccionLabel, dniLabel, fechaLabel, idLabel;
	public JTextField nombreIn, apellidoIn, direccionIn, dniIn, fechaIn;
	private JButton actualizarButton;
	private JTextField idIn;
	private JLabel actualizarLabel;
	
	public vistaActualizar() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Labels
		actualizarLabel = new JLabel("Introduce el identificador y campos que actualizar:");
		actualizarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		actualizarLabel.setBounds(10, 11, 274, 25);
		getContentPane().add(actualizarLabel);
		
		idLabel = new JLabel("ID cliente:");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(9, 45, 93, 25);
		getContentPane().add(idLabel);
		
		nombreLabel = new JLabel("Nombre:");
		nombreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nombreLabel.setBounds(9, 79, 93, 25);
		getContentPane().add(nombreLabel);
		
		apellidoLabel = new JLabel("Apellido:");
		apellidoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		apellidoLabel.setBounds(9, 114, 93, 25);
		getContentPane().add(apellidoLabel);
		
		direccionLabel = new JLabel("Direccion:");
		direccionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		direccionLabel.setBounds(9, 149, 93, 25);
		getContentPane().add(direccionLabel);
		
		dniLabel = new JLabel("DNI:");
		dniLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dniLabel.setBounds(9, 184, 93, 25);
		getContentPane().add(dniLabel);
		
		fechaLabel = new JLabel("Fecha nacimiento:");
		fechaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		fechaLabel.setBounds(9, 219, 93, 25);
		getContentPane().add(fechaLabel);

		//TextFields
		idIn = new JTextField();
		idIn.setBounds(106, 45, 100, 25);
		getContentPane().add(idIn);
		
		nombreIn = new JTextField();
		nombreIn.setBounds(106, 79, 100, 25);
		getContentPane().add(nombreIn);
		
		apellidoIn = new JTextField();
		apellidoIn.setBounds(106, 115, 100, 25);
		getContentPane().add(apellidoIn);
		
		direccionIn = new JTextField();
		direccionIn.setBounds(106, 151, 100, 25);
		getContentPane().add(direccionIn);
		
		dniIn = new JTextField();
		dniIn.setBounds(106, 185, 100, 25);
		getContentPane().add(dniIn);
		
		fechaIn = new JTextField();
		fechaIn.setBounds(106, 219, 100, 25);
		getContentPane().add(fechaIn);
		
		//Boton
		actualizarButton = new JButton("Actualizar");
		actualizarButton.setBounds(86, 255, 120, 25);
		getContentPane().add(actualizarButton);
	}
}
