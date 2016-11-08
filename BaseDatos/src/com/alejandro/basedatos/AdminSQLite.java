package com.alejandro.basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class AdminSQLite extends SQLiteOpenHelper {
	
	public AdminSQLite(Context context, String nombre, CursorFactory factory, int version){
		super(context, nombre, factory, version);
	}
	
	public void onCreate(SQLiteDatabase db){
		db.execSQL("CREATE TABLE empleados (n_empleado INTEGER PRIMARY KEY, nombre TEXT)");
	}
	
	public void onUpgrade(SQLiteDatabase db, int versionAnte, int versionNue){
		db.execSQL("DROP TABLE IF EXISTS empleados");
		db.execSQL("CREATE TABLE empleados (n_empleado INTEGER PRIMARY KEY, nombre TEXT)");
	}
	
	
	
}
