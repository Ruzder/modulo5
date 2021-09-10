package cl.awakalab.evaluacionModulo5.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {	
		return "index";
	}	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}	
	@RequestMapping(value="/error")
	public String error(Model modelo) {		
		System.out.println("ERROR EN AUTENTICACION");
		modelo.addAttribute("error", "true");
		return "login";
	}
	@RequestMapping(value="/logout")
	public String logout() {		
		if (SecurityContextHolder.getContext().getAuthentication() != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}		
		return "redirect:/login?logout";		
	}	
}
