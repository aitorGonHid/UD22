package models;
import java.sql.*;
import java.util.Scanner;
import views.vistaOld;

public class Modelo {
	
	//Conector mysql
	private  String ip = "192.168.1.146:3306";
	private  String user = "remote";
	private  String password = "L4t20_Mysql";
	private  String db = "UD22";
	private  String nombre_tabla = "clientes";
	private  String campos_tabla = "nombre, apellido, direccion, dni, fecha";
	private  Connection conexion;
	
	//Datos
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String fecha;
	private StringBuilder command;
	
	//Getters&setters
	public String getnombreTabla() {
		return nombre_tabla;
	}
	public void setnombreTabla(String tabla) {
		this.nombre_tabla = tabla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//crud methods
	//Metodo para conectar al servidor "+ ip +"
	public  void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://"+ ip +"?useTimezone=true&serverTimezone=UTC",""+ user +"",""+ password +"");
			System.out.println("Conexion al servidor: OK");
		}catch(SQLException | ClassNotFoundException ex  ){
			System.out.println("Conexion al servidor: FAILED");
			System.out.println(ex.getMessage());	
		}
	}
	//Metodo para desconectar del servidor
	public  void disconnect() {
		try {
			
			conexion.close();
			System.out.println("Desconexion al servidor: OK");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	//Metodo para insertar datos en una tabla
	public  void insertData(String valores) {
		try {
			connect();
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			StringBuilder script = new StringBuilder("INSERT INTO "+nombre_tabla+" ("+campos_tabla+") VALUE("); //añade la primera parte de la sentencia DML
			script.append(valores);
			script.delete(script.length()-2, script.length()); //Elimina el ultimo ", "
			script.append(");"); //añade el parentesis final
			System.out.println(script.toString());
			String Query = script.toString();
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");
			disconnect();
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
		}			
	}
}
