package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private  static String ip = "192.168.1.146:3306";
	private  static String user = "remote";
	private  static String password = "L4t20_Mysql";
	private  static Connection conn;
	private static String db = "U22";
	
	//Metodo para conectar al servidor "+ ip +"
	public static void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://"+ ip +"?useTimezone=true&serverTimezone=UTC",""+ user +"",""+ password +"");
			System.out.println("Conexion al servidor: OK");
		}catch(SQLException | ClassNotFoundException ex  ){
			System.out.println("Conexion al servidor: FAILED");
			System.out.println(ex.getMessage());	
		}
	}
	//Metodo para desconectar del servidor
	public static void disconnect() {
		try {	
			conn.close();
			System.out.println("Desconexion al servidor: OK");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	//Getter conexion
	public Connection getConn() {
		return conn;
	}
	//Getter nombre bd
	public  String getDb() {
		return db;
	}
}
