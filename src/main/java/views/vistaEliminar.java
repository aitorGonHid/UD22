package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.Control;
import javax.swing.SwingConstants;

public class vistaEliminar extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Control controller;
	private JLabel eliminarLabel, confirmarLabel, idLabel, eliminar;
	public JTextField confirmarIn;
	private JButton eliminarButton;
	private JTextField idIn;
	
	public vistaEliminar() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Labels
		eliminarLabel = new JLabel("Introduce identificador del cliente y confirma:");
		eliminarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		eliminarLabel.setBounds(10, 11, 274, 25);
		getContentPane().add(eliminarLabel);
		
		idLabel = new JLabel("ID cliente:");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(9, 45, 93, 25);
		getContentPane().add(idLabel);
		
		confirmarLabel = new JLabel("Escribe confirmar");
		confirmarLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		confirmarLabel.setBounds(9, 79, 93, 25);
		getContentPane().add(confirmarLabel);
		
		//TextFields
		idIn = new JTextField();
		idIn.setBounds(106, 45, 100, 25);
		getContentPane().add(idIn);
		
		confirmarIn = new JTextField();
		confirmarIn.setBounds(106, 79, 100, 25);
		getContentPane().add(confirmarIn);
		
		//Boton
		eliminarButton = new JButton("Eliminar");
		eliminarButton.setBounds(86, 117, 120, 25);
		getContentPane().add(eliminarButton);
	}
}
