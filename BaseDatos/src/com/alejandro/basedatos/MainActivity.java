package com.alejandro.basedatos;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void alta(View v){
    	
    	AdminSQLite admin = new AdminSQLite(this, "administracion", null, 1);
    	SQLiteDatabase db = admin.getWritableDatabase();
    	String n_empleado = et1.getText().toString();
    	String nombre = et2.getText().toString();
    	
    	ContentValues registro = new ContentValues();
    	registro.put("n_empleado", n_empleado);
    	registro.put("nombre", nombre);
    	
    	db.insert("empleados", null, registro);
    	db.close();
    	
    	et1.setText("");
    	et2.setText("");
    	
    	Toast.makeText(this, "Se cargaron los datos del empleado", Toast.LENGTH_SHORT).show();
    	
    }
    
    public void consulta(View v){
    	
    	AdminSQLite admin = new AdminSQLite(this, "administracion", null, 1);
    	SQLiteDatabase db = admin.getWritableDatabase();
    	String n_empleado = et1.getText().toString();
    	
    	Cursor fila = db.rawQuery("SELECT nombre FROM empleados WHERE n_empleado = " + n_empleado, null);
    	
    	if(fila.moveToFirst()){
    		et2.setText(fila.getString(0));
    	}else{
    		Toast.makeText(this, "El empleado no esta registrado", Toast.LENGTH_SHORT).show();
    	}
    	
    	db.close();
    }
    
    public void baja(View v){
    	
    	AdminSQLite admin = new AdminSQLite(this, "administracion", null, 1);
    	SQLiteDatabase db = admin.getWritableDatabase();
    	String n_empleado = et1.getText().toString();
    	
    	int cant = db.delete("empleados", "n_empleado = " + n_empleado, null);
    	
    	db.close();
    	et1.setText("");
    	et2.setText("");
    	
    	if(cant == 1){
    		Toast.makeText(this, "Se borro al empleado", Toast.LENGTH_SHORT).show();
    	}else{
    		Toast.makeText(this, "El empleado no esta registrado", Toast.LENGTH_SHORT).show();
    	}
    	
    }
    
    public void modificacion(View v){
    	
    	AdminSQLite admin = new AdminSQLite(this, "administracion", null, 1);
    	SQLiteDatabase db = admin.getWritableDatabase();
    	String n_empleado = et1.getText().toString();
    	String nombre = et2.getText().toString();
    	
    	ContentValues registro = new ContentValues();
    	registro.put("nombre", nombre);
    	
    	int cant = db.update("empleados", registro, "n_empleado = "+n_empleado, null);
    	
    	if(cant == 1){
    		Toast.makeText(this, "Se modificaron los datos", Toast.LENGTH_SHORT).show();
    	}else{
    		Toast.makeText(this, "El empleado no esta registrado", Toast.LENGTH_SHORT).show();
    	}
    	
    }
}
