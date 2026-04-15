package com.tripsModels;

import java.util.Date;

public class Trip {
	private Integer id;
	private String nombre_trip;
	private String descripción;
	private double costo;
	private int calificación;
	private String imagen;
	private String detalles;
	private boolean activo;
	private Date fecha;
	private int IdCategoria;
	private Integer destacado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre_trip() {
		return nombre_trip;
	}
	public void setNombre_trip(String nombre_trip) {
		this.nombre_trip = nombre_trip;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCalificación() {
		return calificación;
	}
	public void setCalificación(int calificación) {
		this.calificación = calificación;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdCategoria() {
		return IdCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}
	public Integer getDestacado() {
		return destacado;
	}
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
}
