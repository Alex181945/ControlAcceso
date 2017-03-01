package com.itgam.dao.imp;

import java.sql.*;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.dao.EmpleadoDAO;
import com.itgam.model.Empleado;
import com.itgam.util.ConexionDB;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {
	
	public void agregarEmpleado(Empleado objE){
		
	}
	
	public void actualizarEmpleado(Empleado objE){
		
	}
	
	public void eliminarEmpleado(Integer idEmpleado){
		
	}
	
	public List<Empleado> listaEmpleado(){
		return null;
	}
	
	public Empleado getEmpleado(Integer idEmpleado){
		
		return null;
	}
	
	@SuppressWarnings("static-access")
	public Boolean acceso(Integer idEmpleado) throws SQLException{
		
		Calendar fecha = Calendar.getInstance();
	    int año = fecha.get(Calendar.YEAR);
	    int mes = fecha.get(Calendar.MONTH) + 1;
	    int dia = fecha.get(Calendar.DAY_OF_MONTH);
	    int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
		
		ConexionDB conexion = new ConexionDB();
		Connection inicio = conexion.GetConnection();
		
		Statement consulta = inicio.createStatement();
		
		//String con = "SELECT ";
		
		ResultSet res = consulta.executeQuery("SELECT * FROM Asistencia WHERE dtFecha ='"+año+ "/" +mes+ "/" +dia+"' AND iIDEmpleado = "+idEmpleado+" ORDER BY iIDAsistencia ASC;");
		
		Boolean aux;
		
		aux = res.last();
		
		if(aux){
			if(!(res.getString("dtFHSalida")).equals("0000-00-00 00:00:00")){
				//Salida llena registrar entrada
				consulta.executeUpdate("INSERT INTO Asistencia (iIDEmpleado, dtFecha, dtFHEntrada) VALUES ('"+res.getInt("iIDEmpleado")+"', "
						+ " '"+(año+ "/" +mes+ "/" +dia)+"',  '"+(año+ "/" +mes+ "/" +dia+" "+hora+":"+minuto+":"+segundo)+"');");

			}else{
				//Salida a modificar
				consulta.executeUpdate("UPDATE Asistencia SET dtFHSalida = '"+(año+ "/" +mes+ "/" +dia+" "+hora+":"+minuto+":"+segundo)+"' WHERE iIDAsistencia ="
						+ " '"+res.getInt("iIDAsistencia")+ "' AND iIDEmpleado = '"+res.getInt("iIDEmpleado")+"';");
			}
		}
		
		inicio.close();
		return aux;
	}
}
