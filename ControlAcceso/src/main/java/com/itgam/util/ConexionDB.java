package com.itgam.util;

import java.sql.*;

public class ConexionDB {
	
public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/mocosoft","root","");
        } catch (Exception e) {
            System.out.println("Error de Conexión Intente Mas Tarde"
                    + " O Contacté con el área de Sistemas"+"\n"+e);
        }
		
		return conexion;
	}

}
