package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.Controller;
import javax.swing.SwingConstants;

public class vistaEliminar extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Controller controller;
	private JLabel eliminarLabel, confirmarLabel, idLabel, eliminar;
	public JTextField confirmarIn;
	private JButton eliminarButton;
	private JTextField idIn;
	
	public vistaEliminar() {
		setTitle("Eliminar cliente");
		getContentPane().setLayout(null);
		setBounds(400, 100, 314, 190);
		setVisible(false);
		
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
		confirmarLabel.setBounds(0, 79, 106, 25);
		getContentPane().add(confirmarLabel);
		
		//TextFields
		idIn = new JTextField();
		idIn.setBounds(116, 47, 100, 25);
		getContentPane().add(idIn);
		
		confirmarIn = new JTextField();
		confirmarIn.setBounds(116, 79, 100, 25);
		getContentPane().add(confirmarIn);
		
		//Boton
		eliminarButton = new JButton("Eliminar");
		eliminarButton.setBounds(96, 115, 120, 25);
		getContentPane().add(eliminarButton);
	}
	public void setControlador(Controller controlador) {
		this.controller = controlador;
	}
}
