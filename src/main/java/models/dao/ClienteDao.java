package models.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import models.dto.Cliente;

public class ClienteDao {
	
	//Atributos
	public static String ip = "192.168.1.146:3306";
	public static String user = "remote";
	public static String password = "L4t20_Mysql";
	public static Connection conexion;
	
	// METODOS PARA INTERACTUAR CON EL SERVIDOR
	public static void connect() {
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
	public static void disconnect() {
		try {
			
			conexion.close();
			System.out.println("Desconexion al servidor: OK");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null,"Error cerrando conexion");
		}
	}	
	

	public void registrar(Cliente cliente)
	{
		connect();
		
		try {
			String queryUseDb = "USE UD22;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryUseDb);
			
			
			String queryInsert= "INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES ('"
					+cliente.getNombre()+"', '"
					+cliente.getApellido()+"', '"
					+cliente.getDireccion()+"', '"
					+cliente.getDni()+"', '"
					+cliente.getFecha()+"');";
			
			Statement st = conexion.createStatement();
			st.executeUpdate(queryInsert);
			System.out.println("Datos almacenados con exito");
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			System.out.println("Fallo en el registro");
		}
		
		disconnect();
	}
	public Cliente buscarCliente (int idCliente)
	{
		connect();
		
		Cliente cliente= new Cliente();
		boolean existe=false;
		try {
			String queryUseDb = "USE UD22;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryUseDb);
			
			String consulta= "SELECT * FROM clientes where id=?;";
			PreparedStatement st = conexion.prepareStatement(consulta);
			st.setInt(1, idCliente);
			ResultSet res = st.executeQuery();
			
			while(res.next()){
				existe=true;
				System.out.println("Cliente encontrado");
				cliente.setId(Integer.parseInt(res.getString("id")));
				cliente.setNombre(res.getString("nombre"));
				cliente.setApellido(res.getString("apellido"));
				cliente.setDireccion(res.getString("direccion"));
				cliente.setDni(Integer.parseInt(res.getString("dni")));
				cliente.setFecha(Date.valueOf(res.getString("fecha")));
			 }
			res.close();
					
			} catch (SQLException e) {
				System.out.println("Error en la consulta.");
				System.out.println(e);
			}
		
		disconnect();
		
			if (existe) {
				return cliente;
			} else {
				System.out.println("El cliente no existe.");
				return null;	
			}
	}
	
	public void modificarCliente(Cliente miCliente)
	{		
		connect();
		try{
			String queryUseDb = "USE UD22;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryUseDb);
			
			String consulta="UPDATE clientes SET nombre= ? , apellido= ? , direccion= ? , dni= ?, fecha= ? WHERE id= ? ";
			System.out.println(consulta);
			PreparedStatement st = conexion.prepareStatement(consulta);
			//metodo setTypoAtributo(indice, atributo) susituye los ? de la consulta por atributos el objeto parametro
			//cada ? se sustituye por uno de los atributos del objeto cliente
			st.setString(1, miCliente.getNombre());
			st.setString(2, miCliente.getApellido());
			st.setString(3, miCliente.getDireccion());
			st.setInt(4, miCliente.getDni());
			st.setDate(5, miCliente.getFecha());
			st.setInt(6, miCliente.getId());
			
            st.executeUpdate();
            
            System.out.println(consulta);
         

        }catch(SQLException	 e){
        	System.out.println("Error al modificar el cliente.");
            System.out.println(e);
        }
		
		disconnect();
	}
	
	public void eliminarCliente(String idCliente)
	{
		connect();
		try {
			String queryUseDb = "USE UD22;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryUseDb);
			
			String queryDelete= "DELETE FROM clientes WHERE id='"+idCliente+"'";
			Statement st = conexion.createStatement();
			st.executeUpdate(queryDelete);
			
			System.out.println("Cliente eliminado");
          
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Fallo al eliminar el cliente");
		}
		
		disconnect();
	}
}
