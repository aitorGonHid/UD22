package controllers;

import java.awt.event.*;
import javax.swing.*;

import models.dao.ClienteDao;
import models.dto.Cliente;
import views.*;

public class Controller {	
	//Modelo
	private ClienteDao dao;
	private Cliente cliente;
	//Vistas
	public vistaActualizar vActualizar;
	public vistaBuscar vBuscar;
	public vistaEliminar vEliminar;
	public vistaPrincipal vPrincipal;
	public vistaRegistrar vRegistrar;

	//Constructor
	public Controller () {
		this.dao = new ClienteDao();
	}
	//Iniciar vista
	public void iniciarVista() {
		this.vPrincipal = new vistaPrincipal();
		this.vPrincipal.setControlador(this);
	}
	//Cambio ventanas desde ventana principal
	public void mostrarVistaActualizar() {
		this.vActualizar = new vistaActualizar();
		this.vActualizar.setVisible(true);
	}
	
	public void mostrarVistaBuscar() {
		this.vBuscar = new vistaBuscar();
		this.vBuscar.setControlador(this);
		this.vBuscar.setVisible(true);
	}
	
	public void mostrarVistaEliminar() {
		this.vEliminar = new vistaEliminar();
		this.vEliminar.setControlador(this);
		this.vEliminar.setVisible(true);
	}
	
	public void mostrarVistaRegistrar() {
		this.vRegistrar = new vistaRegistrar();
		this.vRegistrar.setControlador(this);
		this.vRegistrar.setVisible(true);
	}
	public ClienteDao getDao() {
		return dao;
	}
	public void setDao(ClienteDao dao) {
		this.dao = dao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
