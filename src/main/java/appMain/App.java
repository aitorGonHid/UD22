package appMain;

import controllers.Controller;
import models.conexion.Conexion;
import models.dao.ClienteDao;
import models.dto.Cliente;
import views.vistaActualizar;
import views.vistaBuscar;
import views.vistaEliminar;
import views.vistaPrincipal;
import views.vistaRegistrar;


public class App 
{
	private static vistaPrincipal principal = null;
	private static vistaBuscar buscar = null;
	private static vistaEliminar eliminar = null;
	private static vistaActualizar actualizar = null;
	private static vistaRegistrar registro = null;
	
	public static void main( String[] args ){
    	
    	
    	
    	Controller controller = new Controller();
    	//abrir ventana principal
    	controller.iniciarVista();
    	Conexion con = new Conexion();
    	
    }
}
