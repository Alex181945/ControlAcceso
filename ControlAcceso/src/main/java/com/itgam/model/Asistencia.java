package com.itgam.model;

import java.sql.Timestamp;
import java.util.Date;

public class Asistencia {
	
	private Integer   iIDAsistencia;
	private Integer   iIDEmpleado;
	private Date      dtFecha;
	private Timestamp dtFHEntrada;
	private Timestamp dtFHSalida;
	
	public Integer getiIDAsistencia() {
		return iIDAsistencia;
	}
	public void setiIDAsistencia(Integer iIDAsistencia) {
		this.iIDAsistencia = iIDAsistencia;
	}
	public Integer getiIDEmpleado() {
		return iIDEmpleado;
	}
	public void setiIDEmpleado(Integer iIDEmpleado) {
		this.iIDEmpleado = iIDEmpleado;
	}
	public Date getDtFecha() {
		return dtFecha;
	}
	public void setDtFecha(Date dtFecha) {
		this.dtFecha = dtFecha;
	}
	public Timestamp getDtFHEntrada() {
		return dtFHEntrada;
	}
	public void setDtFHEntrada(Timestamp dtFHEntrada) {
		this.dtFHEntrada = dtFHEntrada;
	}
	public Timestamp getDtFHSalida() {
		return dtFHSalida;
	}
	public void setDtFHSalida(Timestamp dtFHSalida) {
		this.dtFHSalida = dtFHSalida;
	}

}
