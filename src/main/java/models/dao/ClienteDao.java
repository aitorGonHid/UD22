package models.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.Conexion;
import models.dto.Cliente;

public class ClienteDao {

	public void registrar(Cliente cliente)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement st = conex.getConn().createStatement();
			String sql= "INSERT INTO clientes VALUES ('"
					+cliente.getNombre()+"', '"
					+cliente.getApellido()+"', '"
					+cliente.getDireccion()+"', '"
					+cliente.getDni()+"', '"
					+cliente.getFecha()+"');";
			st.executeUpdate(sql);
			System.out.println("Registro efectuado con extio");
			System.out.println(sql);
			st.close();
			conex.disconnect();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			System.out.println("Fallo en el registro");
		}
	}	
}
