package tienda_virtual.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import tienda_virtual.modelo.Empleado;
import tienda_virtual.util.ConexionMySQL;

public class EmpleadoDao {


	private ConexionMySQL conexion;
	
	
	private static final String CONSULTA_LOGIN = "SELECT * FROM user WHERE username=? AND password=?";
	
	
	
	public Empleado consultarUsuario(String username, String pass) {
		Empleado empleado = null;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(CONSULTA_LOGIN);
			preparedStatement.setString(1, username);
			preparedStatement.setString(1, pass);
			ResultSet rs = conexion.query();
			
			if(rs.next() == true) {
				while(rs.next()){
					
					Integer id = rs.getInt("id");
					String password = rs.getString("password");
					String nombre = rs.getString("nombre");
					String telefono = rs.getString("telefono");
					String estado = rs.getString("estado");
					String user = rs.getString("username");
					
					empleado = new Empleado(id,password, nombre, telefono, estado, user);		
				}		
			}			
		}catch(SQLException e) {
			
		}
		return empleado;
	}
	
	
}



