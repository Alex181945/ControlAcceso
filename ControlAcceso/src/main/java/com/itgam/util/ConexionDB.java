package com.itgam.util;

import java.sql.*;

public class ConexionDB {
	
public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/mocosoft","root","");
        } catch (Exception e) {
            System.out.println("Error de Conexi�n Intente Mas Tarde"
                    + " O Contact� con el �rea de Sistemas"+"\n"+e);
        }
		
		return conexion;
	}

}
