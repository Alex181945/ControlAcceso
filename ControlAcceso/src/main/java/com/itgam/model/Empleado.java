package com.itgam.model;

public class Empleado {
	
	private Integer iIDEmpleado;
	private String  cNombre;
	private String  cAP1;
	private String  cAP2;
	private String  cFechaN;    
	private String  cRFC;
	private String  cCurp;
	private Boolean lGenero;
	private Integer IDSituacion;
	private Integer iPuesto;
	private Boolean lActivo;
	
	public Integer getiIDEmpleado() {
		return iIDEmpleado;
	}
	public void setiIDEmpleado(Integer iIDEmpleado) {
		this.iIDEmpleado = iIDEmpleado;
	}
	public String getcNombre() {
		return cNombre;
	}
	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}
	public String getcAP1() {
		return cAP1;
	}
	public void setcAP1(String cAP1) {
		this.cAP1 = cAP1;
	}
	public String getcAP2() {
		return cAP2;
	}
	public void setcAP2(String cAP2) {
		this.cAP2 = cAP2;
	}
	public String getcFechaN() {
		return cFechaN;
	}
	public void setcFechaN(String cFechaN) {
		this.cFechaN = cFechaN;
	}
	public String getcRFC() {
		return cRFC;
	}
	public void setcRFC(String cRFC) {
		this.cRFC = cRFC;
	}
	public String getcCurp() {
		return cCurp;
	}
	public void setcCurp(String cCurp) {
		this.cCurp = cCurp;
	}
	public Boolean getlGenero() {
		return lGenero;
	}
	public void setlGenero(Boolean lGenero) {
		this.lGenero = lGenero;
	}
	public Integer getIDSituacion() {
		return IDSituacion;
	}
	public void setIDSituacion(Integer iDSituacion) {
		IDSituacion = iDSituacion;
	}
	public Integer getiPuesto() {
		return iPuesto;
	}
	public void setiPuesto(Integer iPuesto) {
		this.iPuesto = iPuesto;
	}
	public Boolean getlActivo() {
		return lActivo;
	}
	public void setlActivo(Boolean lActivo) {
		this.lActivo = lActivo;
	}

}
