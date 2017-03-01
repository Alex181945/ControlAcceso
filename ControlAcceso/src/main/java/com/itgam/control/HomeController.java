package com.itgam.control;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.model.Empleado;
import com.itgam.service.EmpleadoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("ctEmpleado", new Empleado());
				
		return "home";
	}
	
	@RequestMapping(value = "/acceso", method = RequestMethod.POST)
	public String acceso(@ModelAttribute("ctEmpleado") Empleado obj, ModelMap mm) throws SQLException {
		
		Boolean bandera = empleadoService.acceso(obj.getiIDEmpleado());
		
		if(!bandera){
			mm.put("mensaje", "Vuelve a intentar se ha susitado un error.");
		}
		
		return "home";
	}
	
	@RequestMapping(value = "/administrativo", method = RequestMethod.GET)
	public String homeAdministrativo() {
				
		return "template/template";
	}
	
}
