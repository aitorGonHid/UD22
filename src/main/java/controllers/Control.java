package controllers;

import java.awt.event.*;
import javax.swing.*;

import models.Modelo;
import views.vistaOld;

public class Control implements ActionListener {
	private Modelo modelo;
	private vistaOld vista = new vistaOld();
	private String nombre, apellido, direccion, dni, fecha;
	
	public Control(Modelo modelo, vistaOld vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
//	//Metodo para crear un String de valores
//	public String getValores() {
//		
//		StringBuilder valores = new StringBuilder();
//		
//		valores.append(vista.nombreIn.getText() +", ");
//		valores.append(vista.apellidoIn.getText()+", ");
//		valores.append(vista.direccionIn.getText() +", ");
//		valores.append(vista.dniIn.getText()+", ");
//		valores.append(vista.fechaIn.getText() +", ");
//		
//		return valores.toString();
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
