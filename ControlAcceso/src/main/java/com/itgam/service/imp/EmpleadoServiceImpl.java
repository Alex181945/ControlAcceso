package com.itgam.service.imp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.dao.EmpleadoDAO;
import com.itgam.model.Empleado;
import com.itgam.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	public void agregarEmpleado(Empleado objE){
		empleadoDAO.agregarEmpleado(objE);
	}
	
	public void actualizarEmpleado(Empleado objE){
		empleadoDAO.actualizarEmpleado(objE);
	}
	
	public void eliminarEmpleado(Integer idEmpleado){
		empleadoDAO.eliminarEmpleado(idEmpleado);
	}
	
	public List<Empleado> listaEmpleado(){
		List<Empleado> lista = new ArrayList<Empleado>();
		lista = empleadoDAO.listaEmpleado();
		return lista;
	}
	
	public Empleado getEmpleado(Integer idEmpleado){
		Empleado empleado = new Empleado();
		empleado = empleadoDAO.getEmpleado(idEmpleado);
		return empleado;
	}
	
	public Boolean acceso(Integer idEmpleado) throws SQLException{
		return empleadoDAO.acceso(idEmpleado);
	}

}
