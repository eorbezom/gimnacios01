package com.erormar.pe.model;

import java.util.Date;

public class Personal {
	
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private int dni;
	private Date fNacimiento;
	private Date fIngreso;
	private Date fCese;
	private String imagen="no-image.png";
	private String tipoTrabajador;
	private String sede;
	private Boolean estado;
	private double sueldo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public Date getfIngreso() {
		return fIngreso;
	}
	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}
	public Date getfCese() {
		return fCese;
	}
	public void setfCese(Date fCese) {
		this.fCese = fCese;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getTipoTrabajador() {
		return tipoTrabajador;
	}
	public void setTipoTrabajador(String tipoTrabajador) {
		this.tipoTrabajador = tipoTrabajador;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Personal [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", fNacimiento=" + fNacimiento + ", fIngreso=" + fIngreso + ", fCese=" + fCese + ", imagen=" + imagen
				+ ", tipoTrabajador=" + tipoTrabajador + ", sede=" + sede + ", estado=" + estado + ", sueldo=" + sueldo
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
