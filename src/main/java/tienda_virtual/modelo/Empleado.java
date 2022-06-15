package tienda_virtual.modelo;

import java.io.Serializable;



public class Empleado implements Serializable {

	private int id;
	private String password;
	private String nombre;
	private String telefono;
	private String estado;
	private String username;
	
	
	
	
	public Empleado() {
	}
	
	
	
	public Empleado(int id, String password, String nombre, String telefono, String estado, String username) {
		super();
		this.id = id;
		this.password = password;
		this.nombre = nombre;
		this.telefono = telefono;
		this.estado = estado;
		this.username = username;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
