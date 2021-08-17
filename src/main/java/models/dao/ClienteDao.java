package models.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import models.conexion.Conexion;
import models.dto.Cliente;

public class ClienteDao {

	public void registrar(Cliente cliente)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql= "INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES ('"
					+cliente.getNombre()+"', '"
					+cliente.getApellido()+"', '"
					+cliente.getDireccion()+"', '"
					+cliente.getDni()+"', '"
					+cliente.getFecha()+"');";
			st.executeUpdate(sql);
			System.out.println("Registro efectuado con extio");
			System.out.println(sql);
			st.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			System.out.println("Fallo en el registro");
		}
	}
	public Cliente buscarCliente (int idCliente)
	{
		Conexion conex= new Conexion();
		Cliente cliente= new Cliente();
		boolean existe=false;
		try {
			String sql= "SELECT * FROM clientes where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, idCliente);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				cliente.setId(Integer.parseInt(res.getString("id")));
				cliente.setNombre(res.getString("nombre"));
				cliente.setApellido(res.getString("apellido"));
				cliente.setDireccion(res.getString("direccion"));
				cliente.setDni(Integer.parseInt(res.getString("dni")));
				cliente.setFecha(Date.valueOf(res.getString("fecha"))); // << posible error en parseo de fecha
			 }
			res.close();
			conex.desconectar();
			System.out.println(sql);
					
			} catch (SQLException e) {
				System.out.println("Error, no se conecto");
				System.out.println(e);
			}
		
			if (existe) {
				return cliente;
			}
			else return null;	
	}
	
	public void modificarPersona(Cliente miCliente)
	{		
		Conexion conex= new Conexion();
		try{
			String consulta="UPDATE clientes SET id= ? ,nombre= ? , apellido= ? , direccion= ? , dni= ?, fecha= ? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			//metodo setTypoAtributo(indice, atributo) susituye los ? de la consulta por atributos el objeto parametro
			//cada ? se sustituye por uno de los atributos del objeto cliente
			estatuto.setInt(1, miCliente.getId());
			estatuto.setString(2, miCliente.getNombre());
			estatuto.setString(3, miCliente.getApellido());
			estatuto.setString(4, miCliente.getDireccion());
			estatuto.setInt(5, miCliente.getDni());
			estatuto.setDate(6, miCliente.getFecha());
			estatuto.setInt(7, miCliente.getId());
			
            estatuto.executeUpdate();
            
          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
          System.out.println(consulta);
         

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}
	
	public void eliminarCliente(String idCliente)
	{
		Conexion conex= new Conexion();
		try {
			String sql= "DELETE FROM persona WHERE id='"+idCliente+"'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(sql);
			st.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}
}
