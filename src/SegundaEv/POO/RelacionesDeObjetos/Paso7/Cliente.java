package SegundaEv.POO.RelacionesDeObjetos.Paso7;

import java.util.Date;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad;
	private Date fNacimiento;
	
	public Cliente(String nombre, String apellidos, String direccion, String localidad, Date fNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.fNacimiento = fNacimiento;
	}
	public String nombreCompleto (){
		return nombre + " " + apellidos;
	}
	public String direccionCompleta (){
		return direccion + ", " + localidad;
	}
	
}
