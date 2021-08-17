package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	static String db = "UD22";
	static String url = "jdbc:mysql://localhost:3306/"+db+"?useTimezone=true&serverTimezone=UTC";
	static String user = "remote";
	static String password = "L4t20_Mysql";
	
	Connection conn = null;
	
	//Constructor de conexion DB 
	public Conexion() {
		try{
	         //obtenemos el driver de para mysql
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         //obtenemos la conexion
	         conn = DriverManager.getConnection(url,user,password);

	         if (conn!=null){
	            System.out.print("Conexión a base de datos "+db+"_SUCCESS");
	         }
	      }
	      catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }catch(Exception e){
	         System.out.println(e);
	      }
	}
	//Desconexion DB
	public void desconectar(){
		conn = null;
	}	
	
	//Getter conexion
	public Connection getConnection() {
		return conn;
	}
	//Getter nombre bd
	public  String getDb() {
		return db;
	}
	
}
