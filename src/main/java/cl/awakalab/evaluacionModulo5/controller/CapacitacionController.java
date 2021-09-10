package cl.awakalab.evaluacionModulo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.evaluacionModulo5.entity.Capacitacion;
import cl.awakelab.evaluacionModulo5.service.CapacitacionServiceIMPL;

@Controller
public class CapacitacionController {
	
	
	@Autowired
	private CapacitacionServiceIMPL cs; // cs = capacitacion service

	@RequestMapping(value="/listarCapacitacion", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		List<Capacitacion> lista = cs.readAll();
		ModelAndView mv = new ModelAndView("listarCapacitacion");
		mv.addObject("lista", lista);
		return mv;
	}
	
	@RequestMapping(value = "/crearCapacitacion", method = RequestMethod.GET)
	public String crearCapVer(Model model) {
		
		//Capacitacion c = cs.readOne(1); // llama al rut cliente para hacer un comparacion tiene que ser igual
		//model.addAttribute("c", c);
		return "crearCapacitacion";
	}
	
	@RequestMapping(value="/crearCapacitacion", method=RequestMethod.POST)
	public String crearCapGuardar(Model model,@RequestParam ("idTxt") int idTxt, @RequestParam ("diaTxt") String diaTxt,
			@RequestParam("horaTxt") String horaTxt, @RequestParam ("lugarTxt") String lugarTxt,
			@RequestParam("duracionTxt") String duracionTxt,@RequestParam("canTxt") String canTxt, @RequestParam("rutTxt") String rutTxt) {
			
		Capacitacion c = new Capacitacion();   // lee los parametros para luego editar
		c.setIdEntity(idTxt);
		c.setDiaEntity(diaTxt);
		c.setHoraEntity(horaTxt);
		c.setLugarEntity(lugarTxt);
		c.setDurEntity(duracionTxt);
		c.setCanCapEntity(canTxt);
		c.setRutCliEntity(rutTxt);
		cs.create(c);
				

		return "redirect:/listarCapacitacion";
	}
	
}
